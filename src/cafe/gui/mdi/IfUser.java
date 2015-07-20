package cafe.gui.mdi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import cafe.tool.MyDb;
import cafe.tool.MsgBox;

/**
 *
 * @author edwinnersherlim
 */
public class IfUser extends javax.swing.JInternalFrame {

    /**
     * Creates new form ifUser
     */
    public IfUser() {
        initComponents();
        refreshList();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spUser = new javax.swing.JScrollPane();
        tabUser = new javax.swing.JTable();
        editPanelGroup = new javax.swing.JPanel();
        labUsername = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        tfPassword = new javax.swing.JTextField();
        labPassword = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnUpd = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Manage User");
        setToolTipText("");

        tabUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabUser.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        spUser.setViewportView(tabUser);

        editPanelGroup.setBorder(javax.swing.BorderFactory.createTitledBorder("Details"));

        labUsername.setText("Username");

        labPassword.setText("Password");

        javax.swing.GroupLayout editPanelGroupLayout = new javax.swing.GroupLayout(editPanelGroup);
        editPanelGroup.setLayout(editPanelGroupLayout);
        editPanelGroupLayout.setHorizontalGroup(
            editPanelGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelGroupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfUsername)
                .addGap(18, 18, 18)
                .addComponent(labPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPassword)
                .addContainerGap())
        );
        editPanelGroupLayout.setVerticalGroup(
            editPanelGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelGroupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labUsername)
                .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(labPassword)
                .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDel.setText("Delete");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnUpd.setText("Update");
        btnUpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spUser, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
            .addComponent(editPanelGroup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15)
                .addComponent(btnUpd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(spUser, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editPanelGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDel)
                    .addComponent(btnUpd))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String query;
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // add user to database
        int id = -1;
        // check whether new user's username exists (no duplicate allowed)
        try {
            id = Integer.parseInt(MyDb.GetField("SELECT `Id` FROM `Login` WHERE `Username`='" + tfUsername.getText() + "'"));
        } catch(Exception e){}
        if(id != -1){
            MsgBox.info("Specified username exists, please change it.");
            return;
        }
        
        query = "INSERT INTO `Login` (`Username`, `Password`) VALUES('" + tfUsername.getText() + "','" + tfPassword.getText() + "')";
//        MsgBox.info(query);
        MyDb.ExecNonQuery(query);
        clearComp();
        refreshList();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdActionPerformed
        // update staff to database
        query = "UPDATE `Login` SET `Username` = '" + tfUsername.getText()+ "', `Password`='" + tfPassword.getText() + "'";
        query += " WHERE `ID`=" + tabUser.getValueAt(tabUser.getSelectedRow(), 0).toString() ;
//        MsgBox.info(query);
        MyDb.ExecNonQuery(query);
        clearComp();
        refreshList();
    }//GEN-LAST:event_btnUpdActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        // delete staff from database
        query = "DELETE FROM `Login` WHERE `ID`= " + tabUser.getValueAt(tabUser.getSelectedRow(), 0).toString() ;
//        MsgBox.info(query);
        MyDb.ExecNonQuery(query);
        clearComp();
        refreshList();
    }//GEN-LAST:event_btnDelActionPerformed

    private void clearComp() {
        // clear components's value
        tfUsername.setText("");
        tfPassword.setText("");
    }
    
    private void refreshList() {
        // refresh table list
        tabUser = MyDb.setTable("SELECT * FROM `Login` ORDER BY `Username`");
        spUser.setViewportView(tabUser);
        
        // set selection change event for table tabRecipe
        tabUser.getSelectionModel().addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            @Override
            public void valueChanged(javax.swing.event.ListSelectionEvent ev) {
                if (ev.getValueIsAdjusting())
                    return;
//                MsgBox.info("Selection Changed", "Info");
                // set textfields binding
                tfUsername.setText(tabUser.getValueAt(tabUser.getSelectedRow(), 1).toString());
                tfPassword.setText(tabUser.getValueAt(tabUser.getSelectedRow(), 2).toString());
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnUpd;
    private javax.swing.JPanel editPanelGroup;
    private javax.swing.JLabel labPassword;
    private javax.swing.JLabel labUsername;
    private javax.swing.JScrollPane spUser;
    private javax.swing.JTable tabUser;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
