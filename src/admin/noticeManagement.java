
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


public class noticeManagement extends javax.swing.JFrame {

    /**
     * Creates new form noticeManagement
     */
    public noticeManagement() {
        initComponents();
        displayData();
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
        whitePanel8 = new javax.swing.JPanel();
        coursemanagementHeading7 = new javax.swing.JLabel();
        noticeIDLabel = new javax.swing.JLabel();
        noticeIDField = new javax.swing.JTextField();
        dateLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        titleField = new javax.swing.JTextField();
        newCourseButton7 = new javax.swing.JButton();
        editCourseButton7 = new javax.swing.JButton();
        deleteCourseButton7 = new javax.swing.JButton();
        resetCourseButton7 = new javax.swing.JButton();
        closeButton7 = new javax.swing.JButton();
        NT = new javax.swing.JScrollPane();
        noticeTable = new javax.swing.JTable();
        noticeLabel = new javax.swing.JLabel();
        dateField = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        noticeField = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        coursemanagementHeading7.setFont(new java.awt.Font("Lucida Fax", 1, 36)); // NOI18N
        coursemanagementHeading7.setForeground(new java.awt.Color(0, 51, 102));
        coursemanagementHeading7.setText("Manage Notices");

        noticeIDLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        noticeIDLabel.setForeground(new java.awt.Color(0, 51, 102));
        noticeIDLabel.setText("NoticeNo :");

        dateLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(0, 51, 102));
        dateLabel.setText("Date :");

        titleLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 51, 102));
        titleLabel.setText("Title :");

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
        editCourseButton7.setText("Edit");
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

        noticeTable.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        noticeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NoticeID", "Date", "Title", "Notice"
            }
        ));
        noticeTable.setRowHeight(20);
        noticeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noticeTableMouseClicked(evt);
            }
        });
        NT.setViewportView(noticeTable);

        noticeLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        noticeLabel.setForeground(new java.awt.Color(0, 51, 102));
        noticeLabel.setText("Notice :");

        dateField.setDateFormatString("YYYY-MM-dd");
        dateField.setFont(new java.awt.Font("Lucida Fax", 0, 11)); // NOI18N
        dateField.setMinimumSize(new java.awt.Dimension(25, 17));

        noticeField.setColumns(20);
        noticeField.setRows(5);
        jScrollPane1.setViewportView(noticeField);

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
                        .addContainerGap(59, Short.MAX_VALUE)
                        .addComponent(NT, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(whitePanel8Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(whitePanel8Layout.createSequentialGroup()
                                .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(noticeIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(whitePanel8Layout.createSequentialGroup()
                                        .addComponent(noticeIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(noticeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
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

        whitePanel8Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dateField, noticeIDField});

        whitePanel8Layout.setVerticalGroup(
            whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(whitePanel8Layout.createSequentialGroup()
                .addComponent(closeButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(coursemanagementHeading7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(whitePanel8Layout.createSequentialGroup()
                        .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(noticeIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(noticeIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(noticeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(whitePanel8Layout.createSequentialGroup()
                                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, whitePanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)))
                .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editCourseButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteCourseButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetCourseButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newCourseButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(NT, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        whitePanel8Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dateField, noticeIDField});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(whitePanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whitePanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
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
            if(noticeIDField.getText().isEmpty() ||   titleField.getText().isEmpty() ||    noticeField.getText().isEmpty()){
                JOptionPane.showMessageDialog(this,"Fill the all Fields...!!!");
            }else{
                try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tecmis","root","")){
                    if(conn!=null){    //Checking the connection
                        System.out.println("Connected");
                    }
                                                          
                    //Inserting Data into (course) Table
                    PreparedStatement add= conn.prepareStatement("INSERT INTO notice VALUES(?,?,?,?)");  // Inserting into Users Table
                    
                    add.setString(1,noticeIDField.getText());
                    add.setString(2,dateField.getDateFormatString());
                    add.setString(3,titleField.getText());
                    add.setString(4,noticeField.getText());
                    
                    
                    int row=add.executeUpdate();// Executing the Insert Query
                    JOptionPane.showMessageDialog(this,"New Notice Added Successfully..."); //Success message
                    
                    
                    
                    
                    //Clearing the form for next Entry.
                    noticeIDField.setText("");
                    dateField.setDateFormatString("");
                    titleField.setText("");
                    noticeField.setText("");
                    
                    dispose();
                    new noticeManagement().setVisible(true);
                        
                    
            } catch (SQLException ex) {
                Logger.getLogger(adminManagement.class.getName()).log(Level.SEVERE, null, ex);
            }   
                
       }   
    }//GEN-LAST:event_newCourseButton7ActionPerformed

    private void resetCourseButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetCourseButton7ActionPerformed
        noticeIDField.setText("");
        dateField.setDateFormatString("");
        titleField.setText("");
        noticeField.setText("");
    }//GEN-LAST:event_resetCourseButton7ActionPerformed

    private void deleteCourseButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCourseButton7ActionPerformed
        Connection conn;
        if(noticeIDField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Please Enter the NoticeNo which you need to Delete...!!!");
        }else{
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tecmis","root","");
            
        Statement st=conn.createStatement();
        
        String noticeNo=noticeIDField.getText();
        String sql1="DELETE FROM notice WHERE no='"+noticeNo+"'";  //Deleting from Admin Table
        
        boolean result1=st.execute(sql1); // Executing the Query
        
        
        noticeIDField.setText("");//Clearing text Field
        JOptionPane.showMessageDialog(this,"Notice Deleted Successfully...");
        
        
        dispose();
        new noticeManagement().setVisible(true);
        
        } catch (SQLException ex) {
            Logger.getLogger(adminManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
       } 
    }//GEN-LAST:event_deleteCourseButton7ActionPerformed

    private void noticeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noticeTableMouseClicked
        //Setting Data into the Text Fields when click on a Row
        
        DefaultTableModel model=(DefaultTableModel)noticeTable.getModel();
        
        String tblid=model.getValueAt(noticeTable.getSelectedRow(),0).toString();
        String tbldate=model.getValueAt(noticeTable.getSelectedRow(),1).toString();
        String title=model.getValueAt(noticeTable.getSelectedRow(),2).toString();
        String notice=model.getValueAt(noticeTable.getSelectedRow(),3).toString();
        
        
        noticeIDField.setText(tblid);
        dateField.setDateFormatString(tbldate);
        titleField.setText(title);
        noticeField.setText(notice);
    }//GEN-LAST:event_noticeTableMouseClicked

    private void editCourseButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCourseButton7ActionPerformed
        DefaultTableModel model=(DefaultTableModel)noticeTable.getModel();
        if(noticeTable.getSelectedRowCount()==1){
            
            String id=noticeIDField.getText();
            String date=dateField.getDateFormatString();
            String title=titleField.getText();
            String notice=noticeField.getText();
             
           
            
            //Setting Updated Value at Row
            
            model.setValueAt(id, noticeTable.getSelectedRow(),0);
            model.setValueAt(date, noticeTable.getSelectedRow(),1);
            model.setValueAt(title, noticeTable.getSelectedRow(),2);
            model.setValueAt(notice, noticeTable.getSelectedRow(),3);
            
            
        //Updating into Database
        Connection conn;
        if(noticeIDField.getText().isEmpty() || dateField.getDateFormatString().isEmpty() ||  titleField.getText().isEmpty() ||    noticeField.getText().isEmpty()){
                JOptionPane.showMessageDialog(this,"Fill the all Fields...!!!");
            }else{
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tecmis","root","");
            
        Statement st=conn.createStatement();
        

        String sql1=" UPDATE notice SET no='"+noticeIDField.getText()+"' , date='"+dateField.getDateFormatString()+"' , title='"+titleField.getText()+"' ,notice='"+noticeField.getText()+"' WHERE no='"+id+"'"; //Update into Notice Table
        
        
            int result=st.executeUpdate(sql1);
            
//        boolean result1=st.execute(sql1); // Executing the Query
//        boolean result2=st.execute(sql2);  // Executing the Query
        
        //Clearing text Field
        noticeIDField.setText("");
        dateField.setDateFormatString("");
        titleField.setText("");
        noticeField.setText("");
        
        
        JOptionPane.showMessageDialog(this,"User Updated Successfully...");
        
        
        dispose();
        new noticeManagement().setVisible(true);
        
        } catch (SQLException ex) {
            Logger.getLogger(adminManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
       } 
            
            
        }else{
            if(noticeTable.getSelectedRowCount()==0){
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
                    String sql="SELECT * FROM notice";       //Query to Retrive data from DB
                    ResultSet result=st.executeQuery(sql);  // Executing the Query
                    
                                       
                    //Getting data into String Variables from table until End of Table data
                    while(result.next()){
                        String noticeid=result.getString("no");
                        String date=result.getString("date");
                        String title=result.getString("title");
                        String notice=result.getString("notice");
                        
                        
                        //String Array for Store data into Jtabel
                        String intoJ[]={noticeid,date,title,notice};
                        DefaultTableModel model=(DefaultTableModel)noticeTable.getModel(); //Allows to "insert" a row at a specified location in the model
                        
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
            java.util.logging.Logger.getLogger(noticeManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(noticeManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(noticeManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(noticeManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new noticeManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane NT;
    private javax.swing.JButton closeButton7;
    private javax.swing.JLabel coursemanagementHeading7;
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton deleteCourseButton7;
    private javax.swing.JButton editCourseButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newCourseButton7;
    private javax.swing.JTextArea noticeField;
    private javax.swing.JTextField noticeIDField;
    private javax.swing.JLabel noticeIDLabel;
    private javax.swing.JLabel noticeLabel;
    private javax.swing.JTable noticeTable;
    private javax.swing.JButton resetCourseButton7;
    private javax.swing.JTextField titleField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel whitePanel8;
    // End of variables declaration//GEN-END:variables
}
