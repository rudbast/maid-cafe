/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafe.tool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rudy
 */
public class MyDb {
    public static final String host = "jdbc:mysql://localhost:3306/";
    public static final String dbName = "maid_cafe";
    public static final String username = "root";
    public static final String password = "t00r";
    public static final String url = host + dbName + "?user=" + username + "&password=" + password;
    
    public static void ExecNonQuery(String sqlQuery){
        // execute query without returning any query result
        Connection conn = null;
        Statement stm = null;
        try {
            // connection/statement/resultset declaration
            conn = DriverManager.getConnection(MyDb.url);
            stm = conn.createStatement();
            int rs = stm.executeUpdate(sqlQuery);
            //System.out.println(rs + " row(s) affected.");
        }
        catch (SQLException e){
            MsgBox.info(e.toString());
        }
        finally {
            try {
                // close existing connection/statement/resultset
                stm.close();
                conn.close();
            } catch (SQLException e){
                MsgBox.info(e.toString());
            }
        }
    }
    
    public static String GetField(String sqlQuery) {
        // execute query returning single column value
        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;
        String result = "";
        try {
            // connection/statement/resultset declaration
            conn = DriverManager.getConnection(MyDb.url);
            stm = conn.createStatement();
            rs = stm.executeQuery(sqlQuery);
            // read query result
            while(rs.next()){
                result = rs.getString(1);
            }
        }
        catch (SQLException e){
            MsgBox.info(e.toString());
        }
        finally {
            try {
                // close existing connection/statement/resultset
                rs.close();
                stm.close();
                conn.close();
            } catch (SQLException e){
                MsgBox.info(e.toString());
            }
        }
        return result;
    }
    
    public static javax.swing.JTable setTableV3(String sqlQuery, String newCol){
        // create table with one custom column
        // set table on specified query
        javax.swing.JTable tab = null;
        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;
        
        try {
            // connection/statement/resultset declaration 
            conn = DriverManager.getConnection(MyDb.url);
            stm = conn.createStatement();
            rs = stm.executeQuery(sqlQuery);
            
            // declare jtable on customcolumntable
            tab = new javax.swing.JTable(CustomColumnTable.resultSetToTableModel(rs, newCol));
            tab.getTableHeader().setReorderingAllowed(false);
        }
        catch (SQLException e){
            MsgBox.info(e.toString());
        }
        finally {
            try {
                // close existing connection/statement/resultset
                rs.close();
                stm.close();
                conn.close();
            } catch (SQLException e){
                MsgBox.info(e.toString());
            }
        }
        tab.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        return tab;
    }
    
    public static javax.swing.JTable setTable(String sqlQuery){
        // create table with column alias enabled
        // set table on specified query
        javax.swing.JTable tab = null;
        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;
        
        try {
            // connection/statement/resultset declaration 
            conn = DriverManager.getConnection(MyDb.url);
            stm = conn.createStatement();
            rs = stm.executeQuery(sqlQuery);
            
            // declare new table using table model from provided method from DbUtils
            tab = new javax.swing.JTable(DbUtils.resultSetToTableModel(rs));
            tab.getTableHeader().setReorderingAllowed(false);
        }
        catch (SQLException e){
            MsgBox.info(e.toString());
        }
        finally {
            try {
                // close existing connection/statement/resultset
                rs.close();
                stm.close();
                conn.close();
            } catch (SQLException e){
                MsgBox.info(e.toString());
            }
        }
        tab.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        return tab;
    }
    
    // Ref : http://stackoverflow.com/questions/10094518/how-can-i-fill-a-combobox-with-values-in-a-database
    // Ref : http://stackoverflow.com/questions/4822928/jcombobox-string-item-visible-and-integer-key-inherent
    public static java.util.Vector FillCombo(String sqlQuery) {
        // fill databound combo on specified query
        java.util.Vector model = new java.util.Vector();
        
        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            // connection/statement/resultset declaration
            conn = DriverManager.getConnection(MyDb.url);
            stm = conn.createStatement();
            rs = stm.executeQuery(sqlQuery);
            // read query result
            model.addElement(new Combo("-1", "None"));
            while(rs.next()){
                model.addElement(new Combo(rs.getString(1), rs.getString(2)));
            }
        }
        catch (SQLException e){
            MsgBox.info(e.toString());
        }
        finally {
            try {
                // close existing connection/statement/resultset
                rs.close();
                stm.close();
                conn.close();
            } catch (SQLException e) {
                MsgBox.info(e.toString());
            }
        }
        return model;
    }
    
    public static java.util.Vector FillTableNumber(String sqlQuery) {
        // fill table number on specific query
        java.util.Vector model = new java.util.Vector();
        
        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            // connection/statement/resultset declaration
            conn = DriverManager.getConnection(MyDb.url);
            stm = conn.createStatement();
            rs = stm.executeQuery(sqlQuery);
            // read query result
            model.addElement("None");
            while(rs.next()){
                model.addElement(rs.getString(1));
            }
        }
        catch (SQLException e){
            MsgBox.info(e.toString());
        }
        finally {
            try {
                // close existing connection/statement/resultset
                rs.close();
                stm.close();
                conn.close();
            } catch (SQLException e) {
                MsgBox.info(e.toString());
            }
        }
        return model;
    }
    
    // ref : http://javaknowledge.info/calling-jasper-report-from-java-application-working-example/
    public static void createReceipt(int rec_id, int totaltopay, int payment) {
        // create receipt on payment
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection(MyDb.url);
            statement = connection.createStatement();
            
            java.util.HashMap parameterMap = new java.util.HashMap();
            parameterMap.put("rec_id", rec_id);
            parameterMap.put("totaltopay", totaltopay);
            parameterMap.put("payment", payment);
            
            Report rpt = new Report(parameterMap, connection);
            rpt.setReportName("src/Cafe/Report/Payment");
            // set true to autosave receipt on specified path
            rpt.callReport(true, "src/ReportsCollection/receipts/" + rec_id + ".pdf");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void createSales(String dateafter, String datebefore, String filename) {
        // create sales report on specified date
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection(MyDb.url);
            statement = connection.createStatement();
            
            java.util.HashMap parameterMap = new java.util.HashMap();
            parameterMap.put("datebefore", datebefore);
            parameterMap.put("dateafter", dateafter);
            
            Report rpt = new Report(parameterMap, connection);
            rpt.setReportName("src/Cafe/Report/" + filename);
            rpt.callReport(false, "src/ReportsCollection/salesreport/" + filename + ".pdf");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}