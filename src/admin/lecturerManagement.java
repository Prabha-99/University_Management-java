package admin;



import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class lecturerManagement extends javax.swing.JFrame {

    public lecturerManagement() {
        initComponents();
        displayData();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bluePanel1 = new javax.swing.JPanel();
        whitePanel1 = new javax.swing.JPanel();
        lecturermanagementHeading = new javax.swing.JLabel();
        userIDLabel = new javax.swing.JLabel();
        userIDField = new javax.swing.JTextField();
        fnamelabel = new javax.swing.JLabel();
        fnameField = new javax.swing.JTextField();
        lnameLabel = new javax.swing.JLabel();
        lnameField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        dobLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        mobileLabel = new javax.swing.JLabel();
        mobileField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        newUserButton = new javax.swing.JButton();
        editUserButton = new javax.swing.JButton();
        deleteUserButton = new javax.swing.JButton();
        resetUserButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        positionLabel = new javax.swing.JLabel();
        studentsTable = new javax.swing.JScrollPane();
        lecturerTable = new javax.swing.JTable();
        dobField = new com.toedter.calendar.JDateChooser();
        lecturerDepartmentLabe = new javax.swing.JLabel();
        lectureDepartmentField = new javax.swing.JComboBox<>();
        genderField = new javax.swing.JComboBox<>();
        positionField = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bluePanel1.setBackground(new java.awt.Color(0, 51, 102));

        lecturermanagementHeading.setFont(new java.awt.Font("Lucida Fax", 1, 36)); // NOI18N
        lecturermanagementHeading.setForeground(new java.awt.Color(0, 51, 102));
        lecturermanagementHeading.setText("Manage Lecturers_________________________");

        userIDLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        userIDLabel.setForeground(new java.awt.Color(0, 51, 102));
        userIDLabel.setText("userID :");

        fnamelabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        fnamelabel.setForeground(new java.awt.Color(0, 51, 102));
        fnamelabel.setText("First Name :");

        lnameLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        lnameLabel.setForeground(new java.awt.Color(0, 51, 102));
        lnameLabel.setText("Last Name");

        addressLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(0, 51, 102));
        addressLabel.setText("Address :");

        dobLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        dobLabel.setForeground(new java.awt.Color(0, 51, 102));
        dobLabel.setText("DOB :");

        genderLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(0, 51, 102));
        genderLabel.setText("Gender :");

        emailLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(0, 51, 102));
        emailLabel.setText("Email :");

        mobileLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        mobileLabel.setForeground(new java.awt.Color(0, 51, 102));
        mobileLabel.setText("Mobile :");

        passwordLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(0, 51, 102));
        passwordLabel.setText("Password :");

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        newUserButton.setBackground(new java.awt.Color(0, 51, 102));
        newUserButton.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        newUserButton.setForeground(new java.awt.Color(204, 204, 204));
        newUserButton.setText("New");
        newUserButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newUserButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newUserButtonMouseClicked(evt);
            }
        });

        editUserButton.setBackground(new java.awt.Color(0, 51, 102));
        editUserButton.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        editUserButton.setForeground(new java.awt.Color(204, 204, 204));
        editUserButton.setText("Edit");
        editUserButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        deleteUserButton.setBackground(new java.awt.Color(0, 51, 102));
        deleteUserButton.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        deleteUserButton.setForeground(new java.awt.Color(204, 204, 204));
        deleteUserButton.setText("Delete");
        deleteUserButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserButtonActionPerformed(evt);
            }
        });

        resetUserButton.setBackground(new java.awt.Color(0, 51, 102));
        resetUserButton.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        resetUserButton.setForeground(new java.awt.Color(204, 204, 204));
        resetUserButton.setText("Reset");
        resetUserButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetUserButtonActionPerformed(evt);
            }
        });

        closeButton.setBackground(new java.awt.Color(0, 51, 102));
        closeButton.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        closeButton.setForeground(new java.awt.Color(255, 255, 255));
        closeButton.setText("X");
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        positionLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        positionLabel.setForeground(new java.awt.Color(0, 51, 102));
        positionLabel.setText("Position :");

        lecturerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserID", "Department", "FName", "Lname", "Address", "DOB", "Gender", "Mobile", "Email", "Position", "Password"
            }
        ));
        lecturerTable.setRowHeight(20);
        studentsTable.setViewportView(lecturerTable);

        dobField.setDateFormatString("YYYY-MM-DD");

        lecturerDepartmentLabe.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        lecturerDepartmentLabe.setForeground(new java.awt.Color(0, 51, 102));
        lecturerDepartmentLabe.setText("LecDepartment :");

        lectureDepartmentField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "depICT", "depET", "depBST" }));

        genderField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        positionField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HOD", "Senior", "Probationary" }));

        javax.swing.GroupLayout whitePanel1Layout = new javax.swing.GroupLayout(whitePanel1);
        whitePanel1.setLayout(whitePanel1Layout);
        whitePanel1Layout.setHorizontalGroup(
            whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, whitePanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(closeButton))
            .addGroup(whitePanel1Layout.createSequentialGroup()
                .addGroup(whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(whitePanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(studentsTable, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lecturermanagementHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(whitePanel1Layout.createSequentialGroup()
                                .addGroup(whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lecturerDepartmentLabe))
                                .addGap(26, 26, 26)
                                .addGroup(whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lectureDepartmentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(whitePanel1Layout.createSequentialGroup()
                                        .addGroup(whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(mobileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mobileField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(whitePanel1Layout.createSequentialGroup()
                                        .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(passwordField))
                                    .addGroup(whitePanel1Layout.createSequentialGroup()
                                        .addComponent(positionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(positionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(whitePanel1Layout.createSequentialGroup()
                                        .addComponent(dobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(37, 37, 37))))
                    .addGroup(whitePanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(newUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resetUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        whitePanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addressField, dobField, genderField});

        whitePanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lecturerDepartmentLabe, userIDLabel});

        whitePanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lectureDepartmentField, userIDField});

        whitePanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {mobileField, passwordField, positionField});

        whitePanel1Layout.setVerticalGroup(
            whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(whitePanel1Layout.createSequentialGroup()
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(lecturermanagementHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(whitePanel1Layout.createSequentialGroup()
                        .addGroup(whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(233, 233, 233)
                        .addGroup(whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(studentsTable, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                    .addGroup(whitePanel1Layout.createSequentialGroup()
                        .addGroup(whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(whitePanel1Layout.createSequentialGroup()
                                .addGroup(whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(whitePanel1Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addGroup(whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lecturerDepartmentLabe)
                                            .addComponent(lectureDepartmentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(8, 8, 8)
                                        .addGroup(whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(fnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, whitePanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addGroup(whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(8, 8, 8)
                                        .addGroup(whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(mobileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mobileField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(whitePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(positionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(positionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        whitePanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {mobileField, passwordField, positionField});

        whitePanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addressField, dobField, genderField});

        whitePanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lecturerDepartmentLabe, userIDLabel});

        whitePanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lectureDepartmentField, userIDField});

        javax.swing.GroupLayout bluePanel1Layout = new javax.swing.GroupLayout(bluePanel1);
        bluePanel1.setLayout(bluePanel1Layout);
        bluePanel1Layout.setHorizontalGroup(
            bluePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bluePanel1Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(whitePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        bluePanel1Layout.setVerticalGroup(
            bluePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bluePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whitePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bluePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bluePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        setVisible(false);
        new adminDashboard().setVisible(true);
    }//GEN-LAST:event_closeButtonMouseClicked

        //Method for retrieve Table data into Jtable
    public void displayData(){ 
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/techmiss","root","");
            
                    //Retrieveing DB table data into the Jtable
                   
                    Statement st=conn.createStatement();
                    String sql="SELECT * FROM lecturer";       //Query to Retrive data from DB
                    ResultSet result=st.executeQuery(sql);  // Executing the Query
                    
                                       
                    //Getting data into String Variables from table until End of Table data
                    while(result.next()){
                        String userid=result.getString("lec_id");
                        String lecdepartment=result.getString("lec_dept_id");
                        String fname=result.getString("fName");
                        String lname=result.getString("lName");
                        String address=result.getString("address");
                        String dob=result.getString("dob");
                        String gender=result.getString("gender");
                        String mobile=result.getString("mobile");
                        String email=result.getString("email");
                        String position=result.getString("position");
                        String password=result.getString("password");
                        
                        
                        //String Array for Store data into Jtabel
                        String intoJ[]={userid,lecdepartment,fname,lname,address,dob,gender,mobile,email,position,password};
                        DefaultTableModel model=(DefaultTableModel)lecturerTable.getModel(); //Allows to "insert" a row at a specified location in the model
                        
                        model.addRow(intoJ);
                        
                        
                    }
                              
                    } catch (SQLException ex) {
            Logger.getLogger(adminManagement.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    
    
    
    
    
    private void newUserButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newUserButtonMouseClicked
        //Adduser Fucntion
            if(userIDField.getText().isEmpty() ||   fnameField.getText().isEmpty() || lnameField.getText().isEmpty() || addressField.getText().isEmpty() || dobField.getDateFormatString().isEmpty() ||  mobileField.getText().isEmpty() || emailField.getText().isEmpty() || passwordField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this,"Fill the all Fields...!!!");
            }else{
                try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/techmiss","root","")){
                    if(conn!=null){    //Checking the connection
                        System.out.println("Connected");
                    }
                                                          
                    //Inserting Data into (users) Table
                    PreparedStatement add= conn.prepareStatement("INSERT INTO user VALUES(?,?,?,?,?,?,?,?,?)");  // Inserting into Users Table
                    
                    add.setString(1,userIDField.getText());
                    add.setString(2,fnameField.getText());
                    add.setString(3,lnameField.getText());
                    add.setString(4,addressField.getText());
                    add.setString(5,dobField.getDateFormatString());
                    add.setString(6, (String) genderField.getSelectedItem());
                    add.setString(7,mobileField.getText());
                    add.setString(8,emailField.getText());
                    add.setString(9,passwordField.getText());
                    
                    
                    int row=add.executeUpdate();// Executing the Insert Query
                    JOptionPane.showMessageDialog(this,"New User Added Successfully..."); //Success message
                    
                    //Inserting Data into (Lecturer) Table
                    PreparedStatement add2=conn.prepareStatement("INSERT INTO lecturer VALUES(?,?,?,?,?,?,?,?,?,?,?)");  //Inserting Into Admin Table
                    
                    add2.setString(1,userIDField.getText());
                    add2.setString(2, (String) lectureDepartmentField.getSelectedItem());
                    add2.setString(3,fnameField.getText());
                    add2.setString(4,lnameField.getText());
                    add2.setString(5,addressField.getText());
                    add2.setString(6,dobField.getDateFormatString());
                    add2.setString(7, (String) genderField.getSelectedItem());
                    add2.setString(8,mobileField.getText());
                    add2.setString(9,emailField.getText());
                    add2.setString(10,passwordField.getText());
                    add2.setString(11, (String) positionField.getSelectedItem());
                    
                    int row2=add2.executeUpdate();
                    
                    
                    //Clearing the form for next Entry.
                    userIDField.setText("");
                    lectureDepartmentField.setSelectedItem("");
                    fnameField.setText("");
                    lnameField.setText("");
                    addressField.setText("");
                    dobField.setDateFormatString("");
                    genderField.setSelectedItem("");
                    mobileField.setText("");
                    emailField.setText("");
                    passwordField.setText("");
                    positionField.setSelectedItem("");
                    
                        
                    
            } catch (SQLException ex) {
                Logger.getLogger(adminManagement.class.getName()).log(Level.SEVERE, null, ex);
            }   
                
       }   
    }//GEN-LAST:event_newUserButtonMouseClicked

    private void resetUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetUserButtonActionPerformed
        //Clearing the form for next Entry.
            userIDField.setText("");
            lectureDepartmentField.setSelectedItem("");
            fnameField.setText("");
            lnameField.setText("");
            addressField.setText("");
            dobField.setDateFormatString("");
            genderField.setSelectedItem("");
            mobileField.setText("");
            emailField.setText("");
            passwordField.setText("");
            positionField.setSelectedItem("");
    }//GEN-LAST:event_resetUserButtonActionPerformed

    private void deleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserButtonActionPerformed
                Connection conn;
        if(userIDField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Please Enter the UserID which you need to Delete...!!!");
        }else{
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/techmiss","root","");
            
        Statement st=conn.createStatement();
        
        String userid=userIDField.getText();
        String sql1="DELETE FROM lecturer WHERE lec_id='"+userid+"'";  //Deleting from Admin Table
        String sql2="DELETE FROM user WHERE user_id='"+userid+"'"; //Deleteing From User Table
        boolean result1=st.execute(sql1); // Executing the Query
        boolean result2=st.execute(sql2);  // Executing the Query
        
        userIDField.setText("");//Clearing text Field
        JOptionPane.showMessageDialog(this,"User Deleted Successfully...");
        
        } catch (SQLException ex) {
            Logger.getLogger(adminManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
       } 
    }//GEN-LAST:event_deleteUserButtonActionPerformed

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
            java.util.logging.Logger.getLogger(lecturerManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lecturerManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lecturerManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lecturerManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lecturerManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JPanel bluePanel1;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton deleteUserButton;
    private com.toedter.calendar.JDateChooser dobField;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JButton editUserButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField fnameField;
    private javax.swing.JLabel fnamelabel;
    private javax.swing.JComboBox<String> genderField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JComboBox<String> lectureDepartmentField;
    private javax.swing.JLabel lecturerDepartmentLabe;
    private javax.swing.JTable lecturerTable;
    private javax.swing.JLabel lecturermanagementHeading;
    private javax.swing.JTextField lnameField;
    private javax.swing.JLabel lnameLabel;
    private javax.swing.JTextField mobileField;
    private javax.swing.JLabel mobileLabel;
    private javax.swing.JButton newUserButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JComboBox<String> positionField;
    private javax.swing.JLabel positionLabel;
    private javax.swing.JButton resetUserButton;
    private javax.swing.JScrollPane studentsTable;
    private javax.swing.JTextField userIDField;
    private javax.swing.JLabel userIDLabel;
    private javax.swing.JPanel whitePanel1;
    // End of variables declaration//GEN-END:variables
}
