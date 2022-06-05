
package admin;




public class adminDashboard extends javax.swing.JFrame {

    public adminDashboard() {
        initComponents();
        loginForm login = new loginForm();
//        login.displayuser();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        adminDashboardHeading = new javax.swing.JLabel();
        newAdmin = new javax.swing.JButton();
        newLecturer = new javax.swing.JButton();
        newStudent = new javax.swing.JButton();
        newTO = new javax.swing.JButton();
        newCourse = new javax.swing.JButton();
        newNotice = new javax.swing.JButton();
        newTT = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        newAdminLabel = new javax.swing.JLabel();
        newLecturerLabel = new javax.swing.JLabel();
        newStudentLabel = new javax.swing.JLabel();
        newTOLabel = new javax.swing.JLabel();
        newCourseLabel = new javax.swing.JLabel();
        newNoticeLabel = new javax.swing.JLabel();
        newTTLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        adminDashboardHeading.setFont(new java.awt.Font("Lucida Fax", 1, 40)); // NOI18N
        adminDashboardHeading.setForeground(new java.awt.Color(204, 204, 204));
        adminDashboardHeading.setText("Welcome to Admin DashBoard");

        newAdmin.setIcon(new javax.swing.ImageIcon("G:\\Uni Works\\Level 2\\Sem 1\\OOD\\Small Projects\\University_Management-java-\\Other Project Materials\\Images\\admin.png")); // NOI18N
        newAdmin.setBorderPainted(false);
        newAdmin.setContentAreaFilled(false);
        newAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAdminActionPerformed(evt);
            }
        });

        newLecturer.setIcon(new javax.swing.ImageIcon("G:\\Uni Works\\Level 2\\Sem 1\\OOD\\Small Projects\\University_Management-java-\\Other Project Materials\\Images\\lecture.png")); // NOI18N
        newLecturer.setBorderPainted(false);
        newLecturer.setContentAreaFilled(false);
        newLecturer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newLecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newLecturerActionPerformed(evt);
            }
        });

        newStudent.setIcon(new javax.swing.ImageIcon("G:\\Uni Works\\Level 2\\Sem 1\\OOD\\Small Projects\\University_Management-java-\\Other Project Materials\\Images\\student.png")); // NOI18N
        newStudent.setBorderPainted(false);
        newStudent.setContentAreaFilled(false);
        newStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStudentActionPerformed(evt);
            }
        });

        newTO.setIcon(new javax.swing.ImageIcon("G:\\Uni Works\\Level 2\\Sem 1\\OOD\\Small Projects\\University_Management-java-\\Other Project Materials\\Images\\technical.png")); // NOI18N
        newTO.setBorderPainted(false);
        newTO.setContentAreaFilled(false);
        newTO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTOActionPerformed(evt);
            }
        });

        newCourse.setIcon(new javax.swing.ImageIcon("G:\\Uni Works\\Level 2\\Sem 1\\OOD\\Small Projects\\University_Management-java-\\Other Project Materials\\Images\\course1.png")); // NOI18N
        newCourse.setBorderPainted(false);
        newCourse.setContentAreaFilled(false);
        newCourse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCourseActionPerformed(evt);
            }
        });

        newNotice.setIcon(new javax.swing.ImageIcon("G:\\Uni Works\\Level 2\\Sem 1\\OOD\\Small Projects\\University_Management-java-\\Other Project Materials\\Images\\notice1.png")); // NOI18N
        newNotice.setBorderPainted(false);
        newNotice.setContentAreaFilled(false);
        newNotice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newNotice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newNoticeActionPerformed(evt);
            }
        });

        newTT.setIcon(new javax.swing.ImageIcon("G:\\Uni Works\\Level 2\\Sem 1\\OOD\\Small Projects\\University_Management-java-\\Other Project Materials\\Images\\time1.png")); // NOI18N
        newTT.setBorderPainted(false);
        newTT.setContentAreaFilled(false);
        newTT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTTActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(51, 51, 51));
        logoutButton.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(204, 204, 204));
        logoutButton.setText("Log Out");
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        newAdminLabel.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        newAdminLabel.setForeground(new java.awt.Color(204, 204, 204));
        newAdminLabel.setText("New Admin");

        newLecturerLabel.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        newLecturerLabel.setForeground(new java.awt.Color(204, 204, 204));
        newLecturerLabel.setText("New Lecturer");

        newStudentLabel.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        newStudentLabel.setForeground(new java.awt.Color(204, 204, 204));
        newStudentLabel.setText("New Student");

        newTOLabel.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        newTOLabel.setForeground(new java.awt.Color(204, 204, 204));
        newTOLabel.setText("New T.Officer");

        newCourseLabel.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        newCourseLabel.setForeground(new java.awt.Color(204, 204, 204));
        newCourseLabel.setText("New Course");

        newNoticeLabel.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        newNoticeLabel.setForeground(new java.awt.Color(204, 204, 204));
        newNoticeLabel.setText("New Notice");

        newTTLabel.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        newTTLabel.setForeground(new java.awt.Color(204, 204, 204));
        newTTLabel.setText("New Time Table");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(adminDashboardHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(newAdminLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(newCourseLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(newLecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(newLecturerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(newStudentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(newStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(newTOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(newTO, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(148, 148, 148))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(newNotice, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(newNoticeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(newTT, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newTTLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74)
                                .addComponent(logoutButton)
                                .addGap(145, 145, 145))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(adminDashboardHeading)
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newTO, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newLecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(newStudentLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(newTT, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(newLecturerLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(newNotice, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(newAdminLabel)
                                .addGap(24, 24, 24)
                                .addComponent(newCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newCourseLabel)
                            .addComponent(newNoticeLabel)
                            .addComponent(newTTLabel))
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(newTOLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        dispose();                          //Closing the Dashboard
        new loginForm().setVisible(true);   //Opening the Login
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void newAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAdminActionPerformed
        dispose();              //Closing the Dashboard
        new adminManagement().setVisible(true);  //opening the management window
    }//GEN-LAST:event_newAdminActionPerformed

    private void newLecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newLecturerActionPerformed
        dispose();              //Closing the Dashboard
        new lecturerManagement().setVisible(true);
    }//GEN-LAST:event_newLecturerActionPerformed

    private void newStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStudentActionPerformed
        dispose();              //Closing the Dashboard
        new studentManagement().setVisible(true);
    }//GEN-LAST:event_newStudentActionPerformed

    private void newTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTOActionPerformed
        dispose();              //Closing the Dashboard
        new technicalOfficerManagement().setVisible(true);
    }//GEN-LAST:event_newTOActionPerformed

    private void newCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCourseActionPerformed
        dispose();         //Closing the Dashboard
        new courseManagement().setVisible(true);
    }//GEN-LAST:event_newCourseActionPerformed

    private void newNoticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newNoticeActionPerformed
        dispose();         //Closing the Dashboard
        new noticeManagement().setVisible(true);
    }//GEN-LAST:event_newNoticeActionPerformed

    private void newTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTTActionPerformed
        dispose();         //Closing the Dashboard
        new timeTableManagement().setVisible(true);
    }//GEN-LAST:event_newTTActionPerformed
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminDashboardHeading;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton newAdmin;
    private javax.swing.JLabel newAdminLabel;
    private javax.swing.JButton newCourse;
    private javax.swing.JLabel newCourseLabel;
    private javax.swing.JButton newLecturer;
    private javax.swing.JLabel newLecturerLabel;
    private javax.swing.JButton newNotice;
    private javax.swing.JLabel newNoticeLabel;
    private javax.swing.JButton newStudent;
    private javax.swing.JLabel newStudentLabel;
    private javax.swing.JButton newTO;
    private javax.swing.JLabel newTOLabel;
    private javax.swing.JButton newTT;
    private javax.swing.JLabel newTTLabel;
    // End of variables declaration//GEN-END:variables
}
