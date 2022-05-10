package build;

import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class userManagement extends javax.swing.JFrame {

    /**
     * Creates new form userManagement
     */
    public userManagement() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bluePanel = new javax.swing.JPanel();
        whitePanel = new javax.swing.JPanel();
        usermanagementHeading = new javax.swing.JLabel();
        userIDLabel = new javax.swing.JLabel();
        namelabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        dobLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        mobileLabel = new javax.swing.JLabel();
        emailLabel1 = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        userIDField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        dobField = new javax.swing.JTextField();
        genderField = new javax.swing.JTextField();
        mobileField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        newUserButton = new javax.swing.JButton();
        editUserButton = new javax.swing.JButton();
        deleteUserButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 700));

        bluePanel.setBackground(new java.awt.Color(0, 51, 102));

        usermanagementHeading.setFont(new java.awt.Font("Lucida Fax", 1, 36)); // NOI18N
        usermanagementHeading.setForeground(new java.awt.Color(0, 51, 102));
        usermanagementHeading.setText("Manage Users_________________________");

        userIDLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        userIDLabel.setForeground(new java.awt.Color(0, 51, 102));
        userIDLabel.setText("userID :");

        namelabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        namelabel.setForeground(new java.awt.Color(0, 51, 102));
        namelabel.setText("Name :");

        addressLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(0, 51, 102));
        addressLabel.setText("Address :");

        dobLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        dobLabel.setForeground(new java.awt.Color(0, 51, 102));
        dobLabel.setText("DOB :");

        genderLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(0, 51, 102));
        genderLabel.setText("Gender :");

        mobileLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        mobileLabel.setForeground(new java.awt.Color(0, 51, 102));
        mobileLabel.setText("Mobile :");

        emailLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        emailLabel1.setForeground(new java.awt.Color(0, 51, 102));
        emailLabel1.setText("Email :");

        passwordLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(0, 51, 102));
        passwordLabel.setText("Password :");

        newUserButton.setBackground(new java.awt.Color(0, 51, 102));
        newUserButton.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        newUserButton.setForeground(new java.awt.Color(204, 204, 204));
        newUserButton.setText("New");
        newUserButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newUserButtonMouseClicked(evt);
            }
        });

        editUserButton.setBackground(new java.awt.Color(0, 51, 102));
        editUserButton.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        editUserButton.setForeground(new java.awt.Color(204, 204, 204));
        editUserButton.setText("Edit");

        deleteUserButton.setBackground(new java.awt.Color(0, 51, 102));
        deleteUserButton.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        deleteUserButton.setForeground(new java.awt.Color(204, 204, 204));
        deleteUserButton.setText("Delete");

        resetButton.setBackground(new java.awt.Color(0, 51, 102));
        resetButton.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        resetButton.setForeground(new java.awt.Color(204, 204, 204));
        resetButton.setText("Reset");

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "UserID", "Name", "Address", "DOB", "Gender", "Mobile", "Email", "Password"
            }
        ));
        jTable1.setRowHeight(20);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout whitePanelLayout = new javax.swing.GroupLayout(whitePanel);
        whitePanel.setLayout(whitePanelLayout);
        whitePanelLayout.setHorizontalGroup(
            whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(whitePanelLayout.createSequentialGroup()
                .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(whitePanelLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(usermanagementHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(whitePanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(whitePanelLayout.createSequentialGroup()
                                .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(128, 128, 128)
                                .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mobileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mobileField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(whitePanelLayout.createSequentialGroup()
                                .addComponent(newUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(editUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(deleteUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 168, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(whitePanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 979, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        whitePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {emailField, passwordField});

        whitePanelLayout.setVerticalGroup(
            whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(whitePanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(usermanagementHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(whitePanelLayout.createSequentialGroup()
                        .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(whitePanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(whitePanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(dobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(whitePanelLayout.createSequentialGroup()
                        .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mobileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mobileField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        whitePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addressField, dobField, nameField, userIDField, userIDLabel});

        whitePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {genderField, genderLabel});

        whitePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {mobileField, mobileLabel});

        whitePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {emailField, emailLabel1, passwordField});

        javax.swing.GroupLayout bluePanelLayout = new javax.swing.GroupLayout(bluePanel);
        bluePanel.setLayout(bluePanelLayout);
        bluePanelLayout.setHorizontalGroup(
            bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bluePanelLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(whitePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        bluePanelLayout.setVerticalGroup(
            bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bluePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whitePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bluePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bluePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newUserButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newUserButtonMouseClicked
        try {
            //Adduser Fucntion
            
            Class.forName("com.mysql.jdbc.Driver");  //Opening the mysql Connection
                try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/techmis?useSSL=false","root","")){
//                if(conn!=null){    //Checking the connection
//                    System.out.println("Connected");
//                }





            } catch (SQLException ex) {
                Logger.getLogger(userManagement.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(userManagement.class.getName()).log(Level.SEVERE, null, ex);
            
        }
                
            
    }//GEN-LAST:event_newUserButtonMouseClicked

    
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
            java.util.logging.Logger.getLogger(userManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new userManagement().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JPanel bluePanel;
    private javax.swing.JButton deleteUserButton;
    private javax.swing.JTextField dobField;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JButton editUserButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel1;
    private javax.swing.JTextField genderField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField mobileField;
    private javax.swing.JLabel mobileLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel namelabel;
    private javax.swing.JButton newUserButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField userIDField;
    private javax.swing.JLabel userIDLabel;
    private javax.swing.JLabel usermanagementHeading;
    private javax.swing.JPanel whitePanel;
    // End of variables declaration//GEN-END:variables
}
