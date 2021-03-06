package cafe.gui.mdi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import cafe.tool.Combo;
import cafe.tool.MsgBox;
import cafe.tool.MyDb;

/**
 *
 * @author edwinnersherlim
 */
public class IfStaff extends javax.swing.JInternalFrame {
// TODO Fix code, table staff is updated
    /**
     * Creates new form ifStaff
     */
    public IfStaff() {
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

        spStaff = new javax.swing.JScrollPane();
        tabStaff = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnUpd = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        editPanelGroup = new javax.swing.JPanel();
        labPhone = new javax.swing.JLabel();
        labAddress = new javax.swing.JLabel();
        labFirstName = new javax.swing.JLabel();
        tfAddress = new javax.swing.JTextField();
        tfLastName = new javax.swing.JTextField();
        labUsername = new javax.swing.JLabel();
        labLastName = new javax.swing.JLabel();
        tfFirstName = new javax.swing.JTextField();
        tfPhone = new javax.swing.JTextField();
        java.util.Vector loginModel = MyDb.FillCombo("SELECT `Id`, `Username` FROM `Login` ORDER BY `Username`");
        cbUsername = new javax.swing.JComboBox(loginModel);
        tfPosition = new javax.swing.JTextField();
        labPosition = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Manage Staff");

        tabStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabStaff.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabStaff.getTableHeader().setReorderingAllowed(false);
        //tabStaff = MyDb.setTable("SELECT * FROM Staff");
        spStaff.setViewportView(tabStaff);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpd.setText("Update");
        btnUpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdActionPerformed(evt);
            }
        });

        btnDel.setText("Delete");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        editPanelGroup.setBorder(javax.swing.BorderFactory.createTitledBorder("Details"));

        labPhone.setText("Phone");

        labAddress.setText("Address");

        labFirstName.setText("First name");

        labUsername.setText("Username");

        labLastName.setText("Last name");

        labPosition.setText("Position");

        javax.swing.GroupLayout editPanelGroupLayout = new javax.swing.GroupLayout(editPanelGroup);
        editPanelGroup.setLayout(editPanelGroupLayout);
        editPanelGroupLayout.setHorizontalGroup(
            editPanelGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelGroupLayout.createSequentialGroup()
                .addGroup(editPanelGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labPosition)
                    .addComponent(labUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editPanelGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbUsername, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfPosition, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editPanelGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editPanelGroupLayout.createSequentialGroup()
                        .addComponent(labAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(tfAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                    .addGroup(editPanelGroupLayout.createSequentialGroup()
                        .addComponent(labLastName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(editPanelGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editPanelGroupLayout.createSequentialGroup()
                        .addComponent(labFirstName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                    .addGroup(editPanelGroupLayout.createSequentialGroup()
                        .addComponent(labPhone)
                        .addGap(38, 38, 38)
                        .addComponent(tfPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))))
        );
        editPanelGroupLayout.setVerticalGroup(
            editPanelGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelGroupLayout.createSequentialGroup()
                .addGroup(editPanelGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labFirstName)
                    .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editPanelGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labPhone)
                    .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(editPanelGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cbUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(labUsername))
            .addGroup(editPanelGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labLastName)
                .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(editPanelGroupLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(editPanelGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editPanelGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labPosition)
                        .addComponent(tfPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editPanelGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labAddress)
                        .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spStaff, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(editPanelGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(spStaff, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editPanelGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDel)
                    .addComponent(btnAdd)
                    .addComponent(btnUpd))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String query;
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // add staff to database
        Combo userId = (Combo) cbUsername.getSelectedItem();
        int id = Integer.parseInt(userId.getValue());
        
        query = "INSERT INTO `Staff` (`Last_Name`, `First_Name`, `User_Id`, `Address`, `Phone`, `Position`) VALUES('" + tfLastName.getText() + "','" + tfFirstName.getText() + "',";
        if(id > 0) query += id;
        else query += "NULL";
        query += ",'" + tfAddress.getText() + "','" + tfPhone.getText() + "','" + tfPosition.getText() + "')";
//        MsgBox.info(query);
        MyDb.ExecNonQuery(query);
        clearComp();
        refreshList();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdActionPerformed
        // update staff to database
        Combo userId = (Combo) cbUsername.getSelectedItem();
        int id = Integer.parseInt(userId.getValue());
        
        query = "UPDATE `Staff` SET `Last_Name`='" + tfLastName.getText() + "', `First_Name`='" + tfFirstName.getText() + "', ";
        if(id != -1) query += "`User_Id`=" + id + ", ";
        else query += "`User_Id`=NULL, ";
        query += "`Address`='" + tfAddress.getText() + "', `Phone`='" + tfPhone.getText() + "', Position='" + tfPosition.getText() + "'";
        query += " WHERE `Id`=" + tabStaff.getValueAt(tabStaff.getSelectedRow(), 0).toString();
//        MsgBox.info(query);
        MyDb.ExecNonQuery(query);
        clearComp();
        refreshList();
    }//GEN-LAST:event_btnUpdActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        // delete staff from database
        query = "DELETE FROM `Staff` WHERE `Id`=" + tabStaff.getValueAt(tabStaff.getSelectedRow(), 0).toString();
//        MsgBox.info(query);
        MyDb.ExecNonQuery(query);
        clearComp();
        refreshList();
    }//GEN-LAST:event_btnDelActionPerformed

    private void clearComp() {
        // clear components's value
        tfLastName.setText("");
        tfFirstName.setText("");
        tfAddress.setText("");
        tfPhone.setText("");
        tfPosition.setText("");
        cbUsername.setSelectedIndex(0);
    }
    
    private void refreshList() {
        // refresh table list
        tabStaff = MyDb.setTable("SELECT * FROM `Staff` ORDER BY `Position`");
        spStaff.setViewportView(tabStaff);
        
        // set selection change event for table tabRecipe
        tabStaff.getSelectionModel().addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            @Override
            public void valueChanged(javax.swing.event.ListSelectionEvent ev) {
                if (ev.getValueIsAdjusting())
                    return;
//                MsgBox.info("Selection Changed", "Info");
                // set textfields & combobox binding
                tfLastName.setText(tabStaff.getValueAt(tabStaff.getSelectedRow(), 1).toString());
                tfFirstName.setText(tabStaff.getValueAt(tabStaff.getSelectedRow(), 2).toString());
                tfAddress.setText(tabStaff.getValueAt(tabStaff.getSelectedRow(), 4).toString());
                tfPhone.setText(tabStaff.getValueAt(tabStaff.getSelectedRow(), 5).toString());
                tfPosition.setText(tabStaff.getValueAt(tabStaff.getSelectedRow(), 6).toString());
                int k = -1;
                try {
                    // get login_id value from selected row
                    k = Integer.parseInt(tabStaff.getValueAt(tabStaff.getSelectedRow(), 3).toString());
                } catch (Exception e){}
                if(k != -1){
                    Combo temp;
                    int j;
                    // check every username's id in combobox
                    for(j=0; j<cbUsername.getItemCount(); ++j){
                        temp = (Combo) cbUsername.getItemAt(j);
                        // get current index's username id
                        int l = Integer.parseInt(temp.getValue());
//                        MsgBox.info(temp.getValue() + " " + tabStaff.getValueAt(i, 3));
                        if(k==l){
                            // if found set selected username
                            cbUsername.setSelectedIndex(j);
                            return;
                        }
                    }
                }
                // if id null set selected username to "None"
                else cbUsername.setSelectedIndex(0);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnUpd;
    private javax.swing.JComboBox cbUsername;
    private javax.swing.JPanel editPanelGroup;
    private javax.swing.JLabel labAddress;
    private javax.swing.JLabel labFirstName;
    private javax.swing.JLabel labLastName;
    private javax.swing.JLabel labPhone;
    private javax.swing.JLabel labPosition;
    private javax.swing.JLabel labUsername;
    private javax.swing.JScrollPane spStaff;
    private javax.swing.JTable tabStaff;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfPosition;
    // End of variables declaration//GEN-END:variables
}
