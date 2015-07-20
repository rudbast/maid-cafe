/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cafe.gui.mdi;

/**
 *
 * @author edwinnersherlim
 */

import cafe.tool.MyDb;

public class IfDiscount extends javax.swing.JInternalFrame {

    /**
     * Creates new form ifDiscount
     */
    public IfDiscount() {
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

        spDisc = new javax.swing.JScrollPane();
        tabDisc = new javax.swing.JTable();
        editPanelGroup = new javax.swing.JPanel();
        Desc = new javax.swing.JLabel();
        textDesc = new javax.swing.JTextField();
        Percentage = new javax.swing.JLabel();
        textPercen = new javax.swing.JTextField();
        Name = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        Category = new javax.swing.JLabel();
        cbCategory = new javax.swing.JComboBox();
        AddButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Manage Discount");

        tabDisc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabDisc.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        spDisc.setViewportView(tabDisc);

        editPanelGroup.setBorder(javax.swing.BorderFactory.createTitledBorder("Detail"));

        Desc.setText("Description");

        Percentage.setText("Percentage");

        Name.setText("Name");

        Category.setText("Category");

        cbCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CREDIT", "EVENT" }));

        javax.swing.GroupLayout editPanelGroupLayout = new javax.swing.GroupLayout(editPanelGroup);
        editPanelGroup.setLayout(editPanelGroupLayout);
        editPanelGroupLayout.setHorizontalGroup(
            editPanelGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelGroupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editPanelGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Desc, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editPanelGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(editPanelGroupLayout.createSequentialGroup()
                        .addComponent(textName, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Percentage)
                        .addGap(18, 18, 18)
                        .addComponent(textPercen, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Category)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(textDesc))
                .addContainerGap())
        );
        editPanelGroupLayout.setVerticalGroup(
            editPanelGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelGroupLayout.createSequentialGroup()
                .addGroup(editPanelGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Category)
                    .addComponent(Name)
                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Percentage)
                    .addComponent(textPercen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(editPanelGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Desc)
                    .addComponent(textDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editPanelGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spDisc, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(UpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spDisc, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editPanelGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton)
                    .addComponent(UpdateButton)
                    .addComponent(DeleteButton))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private String query;
    
    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // delete discounts
        query = "DELETE FROM `Discount` WHERE `Id`= " + tabDisc.getValueAt(tabDisc.getSelectedRow(), 0).toString();
        //MsgBox.info(query);
        MyDb.ExecNonQuery(query);
        clearComp();
        refreshList();
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // insert discounts
         query = "INSERT INTO `Discount` (`Name`, `Category`, `Description`, `Percentage`) VALUES('" + textName.getText() + "','" + cbCategory.getSelectedItem().toString() + "','" + textDesc.getText() + "'," + textPercen.getText() + ")";
        //MsgBox.info(query);
        MyDb.ExecNonQuery(query);
        clearComp();
        refreshList();
    }//GEN-LAST:event_AddButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // update discounts
        query = "UPDATE `Discount` SET `Name` = '" + textName.getText() + "', `Category`='" + cbCategory.getSelectedItem().toString() + "', `Description`='" + textDesc.getText() + "', `Percentage`=" + textPercen.getText();
        query += " WHERE `Id`=" + tabDisc.getValueAt(tabDisc.getSelectedRow(), 0).toString();
        //MsgBox.info(query);
        MyDb.ExecNonQuery(query);
        clearComp();
        refreshList();
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void clearComp() {
        // clear components's value
        textName.setText("");
        textDesc.setText("");
        textPercen.setText("");
        cbCategory.setSelectedIndex(0);
    }
    
    private void refreshList() {
        // refresh table list
        tabDisc = MyDb.setTable("SELECT * FROM `Discount` ORDER BY `Category`");
        spDisc.setViewportView(tabDisc);
        
        // set column preferred width
        tabDisc.getColumnModel().getColumn(0).setPreferredWidth(40);
        tabDisc.getColumnModel().getColumn(1).setPreferredWidth(76);
        tabDisc.getColumnModel().getColumn(2).setPreferredWidth(75);
        tabDisc.getColumnModel().getColumn(3).setPreferredWidth(430);
        tabDisc.getColumnModel().getColumn(4).setPreferredWidth(84);
        
        // set selection change event for table tabRecipe
        tabDisc.getSelectionModel().addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            @Override
            public void valueChanged(javax.swing.event.ListSelectionEvent ev) {
                if (ev.getValueIsAdjusting())
                    return;
                //MsgBox.info("Selection Changed", "Info");
                // set textfields binding
                textName.setText(tabDisc.getValueAt(tabDisc.getSelectedRow(), 1).toString());
                if(tabDisc.getValueAt(tabDisc.getSelectedRow(),2).toString().equals("CREDIT"))
                    cbCategory.setSelectedIndex(0);
                else cbCategory.setSelectedIndex(1);
                textDesc.setText(tabDisc.getValueAt(tabDisc.getSelectedRow(), 3).toString());
                textPercen.setText(tabDisc.getValueAt(tabDisc.getSelectedRow(),4).toString());
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JLabel Category;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel Desc;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Percentage;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JComboBox cbCategory;
    private javax.swing.JPanel editPanelGroup;
    private javax.swing.JScrollPane spDisc;
    private javax.swing.JTable tabDisc;
    private javax.swing.JTextField textDesc;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textPercen;
    // End of variables declaration//GEN-END:variables
}