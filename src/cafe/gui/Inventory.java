/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafe.gui;

import cafe.tool.MsgBox;
import cafe.tool.MyDb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.EventQueue;

/**
 *
 * @author Rudy
 */
public class Inventory extends javax.swing.JFrame {
    /**
     * Creates new form Stock
     */
    public Inventory() {
        initComponents();

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                refreshList();
                // programmatically select row in table
                tabStock.setRowSelectionInterval(0, 0);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spStock = new javax.swing.JScrollPane();
        tabStock = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        tfSearch = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuAction = new javax.swing.JMenu();
        miLogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventory Management");
        setMinimumSize(getPreferredSize());

        tabStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabStock.setColumnSelectionAllowed(true);
        tabStock.getTableHeader().setReorderingAllowed(false);
        spStock.setViewportView(tabStock);
        tabStock.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btnAdd.setBackground(new java.awt.Color(204, 204, 0));
        btnAdd.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(0, 204, 204));
        btnSearch.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tfSearch.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        tfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSearchActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(0, 204, 0));
        btnRefresh.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        menuAction.setText("Action");

        miLogout.setText("Logout");
        miLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLogoutActionPerformed(evt);
            }
        });
        menuAction.add(miLogout);

        menuBar.add(menuAction);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spStock)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                        .addGap(8, 8, 8))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfSearch)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spStock, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // add stock according to data input from selected search result
        this.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.WAIT_CURSOR));
        int idx, initAmt, amt, punit;
        String message = "Input add stock amount (" + tabStock.getValueAt(tabStock.getSelectedRow(), 3).toString() + ") :";
        try { // catch no row selected error
            // get id from selected row
            idx = Integer.parseInt(tabStock.getModel().getValueAt(tabStock.getSelectedRow(), 0).toString());
            // get initial stock from id
            initAmt = Integer.parseInt(tabStock.getValueAt(tabStock.getSelectedRow(), 1).toString());
            // get stock addition amount
            amt = Integer.parseInt(MsgBox.input(message, "Stock addition"));
            // get per unit amount
            punit = Integer.parseInt(tabStock.getValueAt(tabStock.getSelectedRow(), 2).toString());

            if(amt <= 0 || idx < 0) return;    // cancel addition if add amount is less than one or no selected row
            MyDb.ExecNonQuery("UPDATE `Inventory` SET `Unit`=" + (initAmt + (punit * amt)) + " WHERE `Id`=" + idx);
        } catch (Exception e){}
        finally {
            refreshList();
            this.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // search item from inventory according to selected keyword
        tabStock = MyDb.setTable("SELECT id 'No', `Name`, `Unit`, `@unit` 'Unit per Stock', unit_desc 'Unit Description', stock_desc 'Stock Description' FROM Inventory WHERE Name LIKE '%" + tfSearch.getText() + "%'");
        tabStock.removeColumn(tabStock.getColumnModel().getColumn(0));
        spStock.setViewportView(tabStock);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // refresh table data
        refreshList();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void tfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSearchActionPerformed
        // enter key pressed when editing
        btnSearchActionPerformed(evt);
    }//GEN-LAST:event_tfSearchActionPerformed

    private void miLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLogoutActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_miLogoutActionPerformed

    private void refreshList() {
        // refresh table data
        int idx = -1;
        if(tabStock.getRowCount() > 0)
            idx = tabStock.getSelectedRow();

        tabStock = MyDb.setTable("SELECT id 'No', `Name`, `Unit`, `@unit` 'Unit per Stock', unit_desc 'Unit Description', stock_desc 'Stock Description' FROM Inventory ORDER BY `Name`");
        tabStock.removeColumn(tabStock.getColumnModel().getColumn(0));
        spStock.setViewportView(tabStock);

        checkQty();
        if(idx != -1)
            if(tabStock.getRowCount() > idx)
                tabStock.setRowSelectionInterval(idx, idx);
        if(tabStock.getRowCount() > 0)
            tabStock.setRowSelectionInterval(0, 0);
    }

    private void checkQty() {
        // check any item's amount if it's lower than minimum amount needed
        // current minimum amount needed = 5 * @unit (stock)
        String needed = "List of item below minimum amount :";

        Connection conn = null;
        Statement stm = null;
        ResultSet rs = null;

        try {
            // connection/statement/resultset declaration
            conn = DriverManager.getConnection(MyDb.url);
            stm = conn.createStatement();
            // get menu name, maximum item requirement, current item unit available
            rs = stm.executeQuery("SELECT i.name, MAX(`Requirement`), i.unit FROM `Recipe` r JOIN `Inventory` i ON r.item_id=i.id GROUP BY r.item_id ORDER BY i.name");

            while(rs.next()){
                String name = rs.getString(1);
                int req = rs.getInt(2);
                int amt = rs.getInt(3);
                // set minimum requirement to 100 * maximum item requirement
                if(amt < req * 100)
                    needed += "\n" + name;
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

//        for(int i=0; i<tabStock.getRowCount(); ++i){
//            int currAmt = (int) tabStock.getValueAt(i, 1);
//            int perUnit = (int) tabStock.getValueAt(i, 2);
//            if(currAmt < perUnit * 5){
//                needed += "\n" + tabStock.getValueAt(i, 0).toString();
//            }
//        }
        MsgBox.info(needed, "Warning");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JMenu menuAction;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem miLogout;
    private javax.swing.JScrollPane spStock;
    private javax.swing.JTable tabStock;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
