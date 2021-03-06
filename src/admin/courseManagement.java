/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class courseManagement extends javax.swing.JFrame {

    
    public courseManagement() {
        initComponents();
        displayData();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        whitePanel8 = new javax.swing.JPanel();
        coursemanagementHeading7 = new javax.swing.JLabel();
        courseIDLabel = new javax.swing.JLabel();
        courseIDField = new javax.swing.JTextField();
        departmentLabel = new javax.swing.JLabel();
        courseLabel = new javax.swing.JLabel();
        courseField = new javax.swing.JTextField();
        newCourseButton7 = new javax.swing.JButton();
        editCourseButton7 = new javax.swing.JButton();
        deleteCourseButton7 = new javax.swing.JButton();
        resetCourseButton7 = new javax.swing.JButton();
        closeButton7 = new javax.swing.JButton();
        CT = new javax.swing.JScrollPane();
        courseTable = new javax.swing.JTable();
        departmentField = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        coursemanagementHeading7.setFont(new java.awt.Font("Lucida Fax", 1, 36)); // NOI18N
        coursemanagementHeading7.setForeground(new java.awt.Color(0, 51, 102));
        coursemanagementHeading7.setText("Manage Courses");

        courseIDLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        courseIDLabel.setForeground(new java.awt.Color(0, 51, 102));
        courseIDLabel.setText("CourseID :");

        departmentLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        departmentLabel.setForeground(new java.awt.Color(0, 51, 102));
        departmentLabel.setText("Department :");

        courseLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        courseLabel.setForeground(new java.awt.Color(0, 51, 102));
        courseLabel.setText("Course :");

        newCourseButton7.setBackground(new java.awt.Color(0, 51, 102));
        newCourseButton7.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        newCourseButton7.setForeground(new java.awt.Color(204, 204, 204));
        newCourseButton7.setText("New");
        newCourseButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newCourseButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCourseButton7ActionPerformed(evt);
            }
        });

        editCourseButton7.setBackground(new java.awt.Color(0, 51, 102));
        editCourseButton7.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        editCourseButton7.setForeground(new java.awt.Color(204, 204, 204));
        editCourseButton7.setText("Update");
        editCourseButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editCourseButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCourseButton7ActionPerformed(evt);
            }
        });

        deleteCourseButton7.setBackground(new java.awt.Color(0, 51, 102));
        deleteCourseButton7.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        deleteCourseButton7.setForeground(new java.awt.Color(204, 204, 204));
        deleteCourseButton7.setText("Delete");
        deleteCourseButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteCourseButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCourseButton7ActionPerformed(evt);
            }
        });

        resetCourseButton7.setBackground(new java.awt.Color(0, 51, 102));
        resetCourseButton7.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        resetCourseButton7.setForeground(new java.awt.Color(204, 204, 204));
        resetCourseButton7.setText("Reset");
        resetCourseButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetCourseButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetCourseButton7ActionPerformed(evt);
            }
        });

        closeButton7.setBackground(new java.awt.Color(0, 51, 102));
        closeButton7.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        closeButton7.setForeground(new java.awt.Color(255, 255, 255));
        closeButton7.setText("X");
        closeButton7.setBorderPainted(false);
        closeButton7.setFocusPainted(false);
        closeButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButton7MouseClicked(evt);
            }
        });

        courseTable.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        courseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CourseID", "Department", "Course"
            }
        ));
        courseTable.setRowHeight(20);
        courseTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                courseTableMouseClicked(evt);
            }
        });
        CT.setViewportView(courseTable);

        departmentField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "depICT", "depET", "depBST" }));

        javax.swing.GroupLayout whitePanel8Layout = new javax.swing.GroupLayout(whitePanel8);
        whitePanel8.setLayout(whitePanel8Layout);
        whitePanel8Layout.setHorizontalGroup(
            whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, whitePanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(closeButton7))
            .addGroup(whitePanel8Layout.createSequentialGroup()
                .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, whitePanel8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CT, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(whitePanel8Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(whitePanel8Layout.createSequentialGroup()
                                .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(departmentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(courseIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(courseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(courseField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(courseIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(departmentField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(whitePanel8Layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(newCourseButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(editCourseButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(deleteCourseButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(resetCourseButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(coursemanagementHeading7, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        whitePanel8Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {courseIDField, departmentField});

        whitePanel8Layout.setVerticalGroup(
            whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(whitePanel8Layout.createSequentialGroup()
                .addComponent(closeButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(coursemanagementHeading7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departmentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departmentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editCourseButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteCourseButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetCourseButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newCourseButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(CT, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        whitePanel8Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {courseIDField, departmentField});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(whitePanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whitePanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void closeButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButton7MouseClicked
        setVisible(false);
        new adminDashboard().setVisible(true);
    }//GEN-LAST:event_closeButton7MouseClicked

    private void newCourseButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCourseButton7ActionPerformed
        
        //Adduser Fucntion
            if(courseIDField.getText().isEmpty() ||   courseField.getText().isEmpty()){
                JOptionPane.showMessageDialog(this,"Fill the all Fields...!!!");
            }else{
                try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tecmis","root","")){
                    if(conn!=null){    //Checking the connection
                        System.out.println("Connected");
                    }
                                                          
                    //Inserting Data into (course) Table
                    PreparedStatement add= conn.prepareStatement("INSERT INTO course VALUES(?,?,?)");  // Inserting into Users Table
                    
                    add.setString(1,courseIDField.getText());
                    add.setString(2, (String) departmentField.getSelectedItem());
                    add.setString(3,courseField.getText());
                    
                    
                    int row=add.executeUpdate();// Executing the Insert Query
                    JOptionPane.showMessageDialog(this,"New Course Added Successfully..."); //Success message
                    
                    
                    
                    
                    //Clearing the form for next Entry.
                    courseIDField.setText("");
                    departmentField.setSelectedItem("");
                    courseField.setText("");
                    
                    
                    dispose();
                    new courseManagement().setVisible(true);    
                    
            } catch (SQLException ex) {
                Logger.getLogger(adminManagement.class.getName()).log(Level.SEVERE, null, ex);
            }   
                
       }   
    }//GEN-LAST:event_newCourseButton7ActionPerformed

    private void resetCourseButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetCourseButton7ActionPerformed
        courseIDField.setText("");
        departmentField.setSelectedItem("");
        courseField.setText("");
    }//GEN-LAST:event_resetCourseButton7ActionPerformed

    private void courseTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseTableMouseClicked
        //Setting Data into the Text Fields when click on a Row
        
        DefaultTableModel model=(DefaultTableModel)courseTable.getModel();
        
        String tblid=model.getValueAt(courseTable.getSelectedRow(),0).toString();
        String department=model.getValueAt(courseTable.getSelectedRow(),1).toString();
        String course=model.getValueAt(courseTable.getSelectedRow(),2).toString();
        
        
        courseIDField.setText(tblid);
        departmentField.setSelectedItem(department);
        courseField.setText(course);
       
        
        
    }//GEN-LAST:event_courseTableMouseClicked

    private void deleteCourseButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCourseButton7ActionPerformed
        Connection conn;
        if(courseIDField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Please Enter the CourseID which you need to Delete...!!!");
        }else{
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tecmis","root","");
            
        Statement st=conn.createStatement();
        
        String courseid=courseIDField.getText();
        String sql1="DELETE FROM course WHERE co_id='"+courseid+"'";  //Deleting from Admin Table
        
        boolean result1=st.execute(sql1); // Executing the Query
        
        
        courseIDField.setText("");//Clearing text Field
        JOptionPane.showMessageDialog(this,"Course Deleted Successfully...");
        
        
        dispose();
        new courseManagement().setVisible(true);
        
        } catch (SQLException ex) {
            Logger.getLogger(adminManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
       }    
    }//GEN-LAST:event_deleteCourseButton7ActionPerformed

    private void editCourseButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCourseButton7ActionPerformed
        DefaultTableModel model=(DefaultTableModel)courseTable.getModel();
        if(courseTable.getSelectedRowCount()==1){
            
            String id=courseIDField.getText();
            String department=(String) departmentField.getSelectedItem();
            String course=courseField.getText();
             
           
            
            //Setting Updated Value at Row
            
            model.setValueAt(id, courseTable.getSelectedRow(),0);
            model.setValueAt(department, courseTable.getSelectedRow(),1);
            model.setValueAt(course, courseTable.getSelectedRow(),2);
            
            
        //Updating into Database
        Connection conn;
        if(courseIDField.getText().isEmpty() || departmentField.getSelectedItem().equals(evt) ||  courseField.getText().isEmpty()){
                JOptionPane.showMessageDialog(this,"Fill the all Fields...!!!");
            }else{
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tecmis","root","");
            
        Statement st=conn.createStatement();
        

        String sql1=" UPDATE course SET co_id='"+courseIDField.getText()+"' , co_dept_id='"+departmentField.getSelectedItem()+"' ,co_name='"+courseField.getText()+"' WHERE co_id='"+id+"'"; //Update into Admin Table
        
        
            int result=st.executeUpdate(sql1);
            
//        boolean result1=st.execute(sql1); // Executing the Query
//        boolean result2=st.execute(sql2);  // Executing the Query
        
        //Clearing text Field
        courseIDField.setText("");
        departmentField.setSelectedItem("");
        courseField.setText("");
        
        JOptionPane.showMessageDialog(this,"User Updated Successfully...");
        
        
        dispose();
        new courseManagement().setVisible(true);
        
        } catch (SQLException ex) {
            Logger.getLogger(adminManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
       } 
            
            
        }else{
            if(courseTable.getSelectedRowCount()==0){
                JOptionPane.showMessageDialog(this,"Table is Empty...");
            }else{
               JOptionPane.showMessageDialog(this,"Please Select a Single Row.!!!"); 
            }
        }
    }//GEN-LAST:event_editCourseButton7ActionPerformed

    public void displayData(){ 
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tecmis","root","");
            
                    //Retrieveing DB table data into the Jtable
                   
                    Statement st=conn.createStatement();
                    String sql="SELECT * FROM course";       //Query to Retrive data from DB
                    ResultSet result=st.executeQuery(sql);  // Executing the Query
                    
                                       
                    //Getting data into String Variables from table until End of Table data
                    while(result.next()){
                        String userid=result.getString("co_id");
                        String department=result.getString("co_dept_id");
                        String cname=result.getString("co_name");
                        
                        
                        //String Array for Store data into Jtabel
                        String intoJ[]={userid,department,cname};
                        DefaultTableModel model=(DefaultTableModel)courseTable.getModel(); //Allows to "insert" a row at a specified location in the model
                        
                        model.addRow(intoJ);
                        
                        
                    }
                              
                    } catch (SQLException ex) {
            Logger.getLogger(adminManagement.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    
    
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
            java.util.logging.Logger.getLogger(courseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(courseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(courseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(courseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new courseManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane CT;
    private javax.swing.JButton closeButton7;
    private javax.swing.JTextField courseField;
    private javax.swing.JTextField courseIDField;
    private javax.swing.JLabel courseIDLabel;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JTable courseTable;
    private javax.swing.JLabel coursemanagementHeading7;
    private javax.swing.JButton deleteCourseButton7;
    private javax.swing.JComboBox<String> departmentField;
    private javax.swing.JLabel departmentLabel;
    private javax.swing.JButton editCourseButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton newCourseButton7;
    private javax.swing.JButton resetCourseButton7;
    private javax.swing.JPanel whitePanel8;
    // End of variables declaration//GEN-END:variables
}
