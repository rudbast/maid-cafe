/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafe.gui;

import cafe.tool.Combo;
import cafe.tool.MsgBox;
import cafe.tool.MyDb;

/**
 *
 * @author Rudy
 */
public class Recipe extends javax.swing.JFrame {

    /**
     * Creates new form Recipe
     */
    public Recipe() {
        initComponents();
        
        refreshList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        java.util.Vector menuModel = cafe.tool.MyDb.FillCombo("SELECT `Id`, `Name` FROM `Menu` ORDER BY `Name`");
        cbMenu = new javax.swing.JComboBox(menuModel);
        labMenu = new javax.swing.JLabel();
        spRecipe = new javax.swing.JScrollPane();
        tabRecipe = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        java.util.Vector itemModel = cafe.tool.MyDb.FillCombo("SELECT `Id`, `Name` FROM `Inventory` ORDER BY `Name`");
        cbItem = new javax.swing.JComboBox(itemModel);
        labItem = new javax.swing.JLabel();
        labQty = new javax.swing.JLabel();
        spQty = new javax.swing.JSpinner(new javax.swing.SpinnerNumberModel(0, 0, 999999, 1));
        labUnit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Recipe Editing");
        setResizable(false);

        cbMenu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMenuItemStateChanged(evt);
            }
        });

        labMenu.setText("Menu :");

        tabRecipe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabRecipe.setColumnSelectionAllowed(true);
        tabRecipe.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabRecipe.getTableHeader().setReorderingAllowed(false);
        spRecipe.setViewportView(tabRecipe);
        tabRecipe.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btnAdd.setBackground(new java.awt.Color(0, 204, 0));
        btnAdd.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setBackground(new java.awt.Color(204, 0, 0));
        btnRemove.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        cbItem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbItemItemStateChanged(evt);
            }
        });

        labItem.setText("Item");

        labQty.setText("Quantity");

        labUnit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labUnit.setText("Unit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spRecipe, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbItem, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labUnit, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labQty, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spQty, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labMenu)
                    .addComponent(cbItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labItem)
                    .addComponent(labUnit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spRecipe, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnRemove)
                    .addComponent(labQty)
                    .addComponent(spQty, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbMenuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMenuItemStateChanged
        // update item list in table according to selected menu
        if ((evt.getStateChange() == java.awt.event.ItemEvent.SELECTED)) {
            refreshList();
        }
    }//GEN-LAST:event_cbMenuItemStateChanged

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // add or update the total value of selected item from combobox
        if(cbItem.getSelectedIndex() == 0 || cbMenu.getSelectedIndex() == 0) return;
        
        boolean found = false;
        int iid, mid, amt, initAmt = 0;
        Combo itemCb = (Combo) cbItem.getSelectedItem();
        Combo menuCb = (Combo) cbMenu.getSelectedItem();
        
        try {
            this.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.WAIT_CURSOR));
            iid = Integer.parseInt(itemCb.getValue()); // get item id
            mid = Integer.parseInt(menuCb.getValue()); // get menu id
            amt = Integer.parseInt(spQty.getValue().toString());    // get item amount to add to recipe
            
            // check if selected item combobox value is already inside recipe
            for (int i = 0; i < tabRecipe.getRowCount(); ++i) {
                // if exist, set initial amount to be updated with new amount
                if (iid == Integer.parseInt(tabRecipe.getModel().getValueAt(i, 0).toString())) {
                    // get initial amount of item if it exist on recipe
                    initAmt = Integer.parseInt((tabRecipe.getValueAt(i, 1).toString()));
                    found = true;
                    break;
                }
            }

            if(amt <= 0) return;    // cancel update / insert item if specified amount is less than one
            String query;
            if(found){
                // update item amount in recipe
                query = "UPDATE `Recipe` SET `Requirement`=" + (initAmt + amt) + " WHERE `Item_Id`=" + iid + " AND `Menu_Id`=" + mid;
//                MsgBox.info(query);
//                MsgBox.info("FOUND at " + iid + " : " + amt, "Attention");
            }
            else {
                // insert new item to recipe
                query = "INSERT INTO `Recipe` Values(" + iid + "," + amt + "," + mid + ")";
//                MsgBox.info(query);
//                MsgBox.info("NOT FOUND " + iid + " : " + amt, "Attention");
            }
            MyDb.ExecNonQuery(query);
            refreshList();
            spQty.setValue(0);
        }
        catch (Exception ex) {
//            MsgBox.info(ex.toString());
        }
        finally {
            this.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // remove selected item from selected menu from recipe
        if(cbItem.getSelectedIndex() == 0 || cbMenu.getSelectedIndex() == 0) return;
        
        boolean found = false;
        int iid, mid, amt, initAmt = 0;
        Combo itemCb = (Combo) cbItem.getSelectedItem();
        Combo menuCb = (Combo) cbMenu.getSelectedItem();
        
        try {
            this.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.WAIT_CURSOR));
            iid = Integer.parseInt(itemCb.getValue()); // get item id
            mid = Integer.parseInt(menuCb.getValue()); // get menu id
            amt = Integer.parseInt(spQty.getValue().toString());    // get item amount to remove from recipe
            
            // check if selected item combobox value is already inside recipe
            for (int i = 0; i < tabRecipe.getRowCount(); ++i) {
                // if exist, set initial amount to be updated with new amount
                if (iid == Integer.parseInt(tabRecipe.getModel().getValueAt(i, 0).toString())) {
                    // get initial amount of item if it exist on recipe
                    initAmt = Integer.parseInt((tabRecipe.getValueAt(i, 1).toString()));
                    // show info if amount specified is higher than initial amount
                    if(amt > initAmt){
                        MsgBox.info("Amount to remove must not exceed initial amount in recipe.\n" +
                                    "Please re-set amount.");
                        return;
                    }
                    found = true;
                    break;
                }
            }

            if(amt <= 0) return;    // cancel update item if specified amount is less than one
            
            String query;
            if(found){
                // update item from recipe according to amount specified
                if(initAmt - amt == 0)  // delete item from recipe if item amount after removal equal zero
                    query = "DELETE FROM `Recipe` WHERE `Item_Id`=" + iid + " AND `Menu_Id`=" + mid;
                else
                    query = "UPDATE `Recipe` SET `Requirement`=" + (initAmt - amt) + " WHERE `Item_Id`=" + iid + " AND `Menu_Id`=" + mid;
//                MsgBox.info(query);
                MyDb.ExecNonQuery(query);
            }
            else {
                // item is not found inside recipe
                MsgBox.info("Selected item to remove is not found inside recipe.\n" +
                            "Please select the correct item from table.");
            }
            refreshList();
            spQty.setValue(0);
        }
        catch (Exception ex) {
//            MsgBox.info(ex.toString());
        }
        finally {
            this.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void cbItemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbItemItemStateChanged
        // update labUnit according to selected item
        if(cbItem.getSelectedIndex() == 0){
            labUnit.setText("Unit");
            return;
        }
        
        Combo idx = (Combo) cbItem.getSelectedItem();
//        MsgBox.info("SELECT unit_desc FROM Inventory WHERE id=" + idx.getValue());
        labUnit.setText(MyDb.GetField("SELECT unit_desc FROM Inventory WHERE id=" + idx.getValue()));
    }//GEN-LAST:event_cbItemItemStateChanged

    private void refreshList() {
        // refresh table
        // remove table row if none is selected
        if(cbMenu.getSelectedIndex() == 0) {
            tabRecipe = new javax.swing.JTable();
            spRecipe.setViewportView(tabRecipe);
        }
        
        Combo idx = (Combo) cbMenu.getSelectedItem();   // get menu id
//        MsgBox.info("idx : " + idx + " id : " + menuCombo.intList.get(idx) + " str " + menuCombo.strList.get(idx), "Info");
        // set table query shown
        tabRecipe = MyDb.setTable("SELECT i.id, i.Name, r.Requirement FROM `Recipe` r "
                + "JOIN `Inventory` i ON r.item_id=i.id WHERE r.menu_id=" + idx.getValue()
                + " ORDER BY i.name");
        tabRecipe.removeColumn(tabRecipe.getColumnModel().getColumn(0));
        spRecipe.setViewportView(tabRecipe);

        // set selection change event for table tabRecipe
        tabRecipe.getSelectionModel().addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            @Override
            public void valueChanged(javax.swing.event.ListSelectionEvent ev) {
                if (ev.getValueIsAdjusting())
                    return;
                // get item id from selected row from tabRecipe
                int idx = Integer.parseInt(tabRecipe.getModel().getValueAt(tabRecipe.getSelectedRow(), 0).toString());
                // check every item in combobox
                for(int i=0; i<cbItem.getItemCount(); ++i){
                    Combo temp = (Combo) cbItem.getItemAt(i);
                    // check item id equality
                    if(idx == Integer.parseInt(temp.getValue())){
                        cbItem.setSelectedIndex(i);
                        break;
                    }
                }
            }
        });
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
            java.util.logging.Logger.getLogger(Recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recipe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRemove;
    private javax.swing.JComboBox cbItem;
    private javax.swing.JComboBox cbMenu;
    private javax.swing.JLabel labItem;
    private javax.swing.JLabel labMenu;
    private javax.swing.JLabel labQty;
    private javax.swing.JLabel labUnit;
    private javax.swing.JSpinner spQty;
    private javax.swing.JScrollPane spRecipe;
    private javax.swing.JTable tabRecipe;
    // End of variables declaration//GEN-END:variables
}