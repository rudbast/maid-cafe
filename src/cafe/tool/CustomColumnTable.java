/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafe.tool;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Rudy
 */
public class CustomColumnTable {
    public static TableModel resultSetToTableModel(ResultSet rs, String addColName) {
        try {
            ResultSetMetaData metaData = rs.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            Vector columnNames = new Vector();

            // Get the column names
            for (int column = 0; column < numberOfColumns; column++) {
                columnNames.addElement(metaData.getColumnLabel(column + 1));
            }
            columnNames.addElement(addColName);
            
            // Get all rows.
            Vector rows = new Vector();

            while (rs.next()) {
                Vector newRow = new Vector();

                for (int i = 1; i <= numberOfColumns; i++) {
                    newRow.addElement(rs.getObject(i));
                }
                newRow.addElement(null);
                rows.addElement(newRow);
            }

            return new MyTableModel(rows, columnNames);
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }
}

// Ref : http://www.coderanch.com/t/488016/GUI/java/JTable-set-column-data-type
class MyTableModel extends DefaultTableModel {
    public MyTableModel(Object rowData[][], Object columnNames[]) {
        super(rowData, columnNames);
    }

    public MyTableModel(Vector rows, Vector columnNames) {
        super(rows, columnNames);
    }

    @Override  
      public Class getColumnClass(int col) {  
        if (col == 2)       //second column accepts only Integer values
            return Integer.class;
        else return String.class;  //other columns accept String values
    }

    @Override  
      public boolean isCellEditable(int row, int col) {  
        if (col == 2)       //first column will be uneditable
            return true;
        else return false;
    }
}