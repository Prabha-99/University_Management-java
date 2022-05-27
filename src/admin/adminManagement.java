package admin;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class adminManagement extends javax.swing.JFrame {
    
    public adminManagement() { //Creates new form adminManagement
        
        initComponents();  
        displayData(); //Calling displayData() method
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bluePanel = new javax.swing.JPanel();
        whitePanel = new javax.swing.JPanel();
        adminmanagementHeading = new javax.swing.JLabel();
        userIDLabel = new javax.swing.JLabel();
        fnamelabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        dobLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        mobileLabel = new javax.swing.JLabel();
        emailLabel1 = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        userIDField = new javax.swing.JTextField();
        fnameField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        mobileField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        newUserButton = new javax.swing.JButton();
        editUserButton = new javax.swing.JButton();
        deleteUserButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        SP = new javax.swing.JScrollPane();
        adminsTable = new javax.swing.JTable();
        closeButton = new javax.swing.JButton();
        lnameLabel = new javax.swing.JLabel();
        lnameField = new javax.swing.JTextField();
        dobField = new com.toedter.calendar.JDateChooser();
        genderField = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bluePanel.setBackground(new java.awt.Color(0, 51, 102));

        adminmanagementHeading.setFont(new java.awt.Font("Lucida Fax", 1, 36)); // NOI18N
        adminmanagementHeading.setForeground(new java.awt.Color(0, 51, 102));
        adminmanagementHeading.setText("Manage Admins_________________________");

        userIDLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        userIDLabel.setForeground(new java.awt.Color(0, 51, 102));
        userIDLabel.setText("userID :");

        fnamelabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        fnamelabel.setForeground(new java.awt.Color(0, 51, 102));
        fnamelabel.setText("First Name :");

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
        newUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUserButtonActionPerformed(evt);
            }
        });

        editUserButton.setBackground(new java.awt.Color(0, 51, 102));
        editUserButton.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        editUserButton.setForeground(new java.awt.Color(204, 204, 204));
        editUserButton.setText("Edit");
        editUserButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserButtonActionPerformed(evt);
            }
        });

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

        resetButton.setBackground(new java.awt.Color(0, 51, 102));
        resetButton.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        resetButton.setForeground(new java.awt.Color(204, 204, 204));
        resetButton.setText("Reset");
        resetButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        adminsTable.setBorder(new javax.swing.border.MatteBorder(null));
        adminsTable.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        adminsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserID", "fname", "lname", "Address", "DOB", "Gender", "Mobile", "Email", "Password"
            }
        ));
        adminsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminsTableMouseClicked(evt);
            }
        });
        SP.setViewportView(adminsTable);

        closeButton.setBackground(new java.awt.Color(0, 51, 102));
        closeButton.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        closeButton.setForeground(new java.awt.Color(255, 255, 255));
        closeButton.setText("X");
        closeButton.setBorderPainted(false);
        closeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeButton.setFocusPainted(false);
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        lnameLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        lnameLabel.setForeground(new java.awt.Color(0, 51, 102));
        lnameLabel.setText("Last Name");

        dobField.setDateFormatString("YYYY-MM-dd");
        dobField.setFont(new java.awt.Font("Lucida Fax", 0, 11)); // NOI18N
        dobField.setMinimumSize(new java.awt.Dimension(25, 17));

        genderField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Femal" }));

        javax.swing.GroupLayout whitePanelLayout = new javax.swing.GroupLayout(whitePanel);
        whitePanel.setLayout(whitePanelLayout);
        whitePanelLayout.setHorizontalGroup(
            whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(whitePanelLayout.createSequentialGroup()
                .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(whitePanelLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(adminmanagementHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(whitePanelLayout.createSequentialGroup()
                        .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(whitePanelLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(whitePanelLayout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(newUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(whitePanelLayout.createSequentialGroup()
                                        .addComponent(editUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(deleteUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(whitePanelLayout.createSequentialGroup()
                                        .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(userIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(121, 121, 121)
                                        .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(whitePanelLayout.createSequentialGroup()
                                                .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(mobileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(emailLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(mobileField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(whitePanelLayout.createSequentialGroup()
                                                .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 129, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, whitePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(closeButton))
            .addGroup(whitePanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(SP, javax.swing.GroupLayout.PREFERRED_SIZE, 1069, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        whitePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {emailField, genderField, passwordField});

        whitePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dobField, dobLabel, lnameField});

        whitePanelLayout.setVerticalGroup(
            whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(whitePanelLayout.createSequentialGroup()
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(whitePanelLayout.createSequentialGroup()
                        .addComponent(adminmanagementHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(whitePanelLayout.createSequentialGroup()
                                .addComponent(userIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(whitePanelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(mobileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mobileField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(whitePanelLayout.createSequentialGroup()
                        .addComponent(userIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(SP, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        whitePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addressField, fnameField, fnamelabel, userIDField, userIDLabel});

        whitePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {emailField, emailLabel1, genderField, passwordField});

        whitePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dobField, dobLabel});

        javax.swing.GroupLayout bluePanelLayout = new javax.swing.GroupLayout(bluePanel);
        bluePanel.setLayout(bluePanelLayout);
        bluePanelLayout.setHorizontalGroup(
            bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bluePanelLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(whitePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        bluePanelLayout.setVerticalGroup(
            bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bluePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(whitePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Method for retrieve Table data into Jtable
    public void displayData(){ 
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tecmis","root","");
            
                    //Retrieveing DB table data into the Jtable
                   
                    Statement st=conn.createStatement();
                    String sql="SELECT * FROM admin";       //Query to Retrive data from DB
                    ResultSet result=st.executeQuery(sql);  // Executing the Query
                    
                                       
                    //Getting data into String Variables from table until End of Table data
                    while(result.next()){
                        String userid=result.getString("AID");
                        String fname=result.getString("fName");
                        String lname=result.getString("lName");
                        String address=result.getString("address");
                        String dob=result.getString("dob");
                        String gender=result.getString("gender");
                        String mobile=result.getString("mobile");
                        String email=result.getString("email");
                        String password=result.getString("password");
                        
                        //String Array for Store data into Jtabel
                        String intoJ[]={userid,fname,lname,address,dob,gender,mobile,email,password};
                        DefaultTableModel model=(DefaultTableModel)adminsTable.getModel(); //Allows to "insert" a row at a specified location in the model
                        
                        model.addRow(intoJ);
                        
                        
                    }
                              
                    } catch (SQLException ex) {
            Logger.getLogger(adminManagement.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    
    
    
    private void newUserButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newUserButtonMouseClicked

            //Adduser Fucntion
            if(userIDField.getText().isEmpty() ||  fnameField.getText().isEmpty() || lnameField.getText().isEmpty() || addressField.getText().isEmpty() || dobField.getDateFormatString().isEmpty() || genderField.getSelectedItem().equals(evt) || mobileField.getText().isEmpty() || emailField.getText().isEmpty() || passwordField.getText().isEmpty()){
                JOptionPane.showMessageDialog(this,"Fill the all Fields...!!!");
            }else{
                try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tecmis","root","")){
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
                    
                    //Inserting Data into (Admin) Table
                    PreparedStatement add2=conn.prepareStatement("INSERT INTO admin VALUES(?,?,?,?,?,?,?,?,?)");  //Inserting Into Admin Table
                    
                    add2.setString(1,userIDField.getText());
                    add2.setString(2,fnameField.getText());
                    add2.setString(3,lnameField.getText());
                    add2.setString(4,addressField.getText());
                    add2.setString(5,dobField.getDateFormatString());
                    add2.setString(6, (String) genderField.getSelectedItem());
                    add2.setString(7,mobileField.getText());
                    add2.setString(8,emailField.getText());
                    add2.setString(9,passwordField.getText());
                    
                    int row2=add2.executeUpdate();
                    
                    
                    //Clearing the form for next Entry.
                    userIDField.setText("");
                    fnameField.setText("");
                    lnameField.setText("");
                    addressField.setText("");
                    dobField.setDateFormatString("");
                    genderField.setSelectedItem("");
                    mobileField.setText("");
                    emailField.setText("");
                    passwordField.setText("");
                    displayData();
                    
                    dispose();
                    new adminManagement().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(adminManagement.class.getName()).log(Level.SEVERE, null, ex);
            }   
                
       }   
    }//GEN-LAST:event_newUserButtonMouseClicked

    
    
    //Close Button Function
    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        setVisible(false);
        new adminDashboard().setVisible(true);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
       
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_closeButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        
        //Resetting Fields
        userIDField.setText("");
        fnameField.setText("");
        lnameField.setText("");
        addressField.setText("");
        dobField.setDateFormatString("");
        genderField.setSelectedItem("");
        mobileField.setText("");
        emailField.setText("");
        passwordField.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void newUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUserButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newUserButtonActionPerformed

    
    //User Deletion Method
    private void deleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserButtonActionPerformed
        Connection conn;
        if(userIDField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Please Enter the UserID which you need to Delete...!!!");
        }else{
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tecmis","root","");
            
        Statement st=conn.createStatement();
        
        String userid=userIDField.getText();
        String sql1="DELETE FROM admin WHERE AID='"+userid+"'";  //Deleting from Admin Table
        String sql2="DELETE FROM user WHERE user_id='"+userid+"'"; //Deleteing From User Table
        boolean result1=st.execute(sql1); // Executing the Query
        boolean result2=st.execute(sql2);  // Executing the Query
        
        userIDField.setText("");//Clearing text Field
        JOptionPane.showMessageDialog(this,"User Deleted Successfully...");
        
        
        dispose();
        new adminManagement().setVisible(true);
        
        } catch (SQLException ex) {
            Logger.getLogger(adminManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
       }    
        
    }//GEN-LAST:event_deleteUserButtonActionPerformed

    private void editUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserButtonActionPerformed
        DefaultTableModel model=(DefaultTableModel)adminsTable.getModel();
        if(adminsTable.getSelectedRowCount()==1){
            
            String id=userIDField.getText();
            String fname=fnameField.getText();
            String lname=lnameField.getText();
            String address=addressField.getText();
            String dob=dobField.getDateFormatString();
            String gender= (String) genderField.getSelectedItem();
            String mobile=mobileField.getText();
            String email=emailField.getText();
            String password=passwordField.getText(); 
           
            
            //Setting Updated Value at Row
            
            model.setValueAt(id, adminsTable.getSelectedRow(),0);
            model.setValueAt(fname, adminsTable.getSelectedRow(),1);
            model.setValueAt(lname, adminsTable.getSelectedRow(),2);
            model.setValueAt(address, adminsTable.getSelectedRow(),3);
            model.setValueAt(dob, adminsTable.getSelectedRow(),4);
            model.setValueAt(gender, adminsTable.getSelectedRow(),5);
            model.setValueAt(mobile, adminsTable.getSelectedRow(),6);
            model.setValueAt(email, adminsTable.getSelectedRow(),7);
            model.setValueAt(password, adminsTable.getSelectedRow(),8);
            
        //Updating into Database
        Connection conn;
        if(userIDField.getText().isEmpty() ||  fnameField.getText().isEmpty() || lnameField.getText().isEmpty() || addressField.getText().isEmpty() || dobField.getDateFormatString().isEmpty() || genderField.getSelectedItem().equals(evt) || mobileField.getText().isEmpty() || emailField.getText().isEmpty() || passwordField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Please Click on the field that you want to Update...!!!");
        }else{
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tecmis","root","");
            
        Statement st=conn.createStatement();
        

        String sql1=" UPDATE admin SET AID='"+userIDField.getText()+"' , fname='"+fnameField.getText()+"' ,lname='"+lnameField.getText()+"' ,address='"+addressField.getText()+"' ,dob='"+dobField.getDateFormatString()+"' ,gender='"+genderField.getSelectedItem()+"' ,mobile='"+mobileField.getText()+"' ,email='"+emailField.getText()+"' ,password='"+passwordField.getText()+"' WHERE AID= '"+id+"' "; //Update into Admin Table
        String sql2=" UPDATE user SET user_id='"+userIDField.getText()+"' , fname='"+fnameField.getText()+"' ,lname='"+lnameField.getText()+"' ,address='"+addressField.getText()+"' ,dob='"+dobField.getDateFormatString()+"' ,gender='"+genderField.getSelectedItem()+"' ,mobile='"+mobileField.getText()+"' ,email='"+emailField.getText()+"' ,password='"+passwordField.getText()+"' WHERE user_id= '"+id+"' "; //Update into User Table
        
            int result=st.executeUpdate(sql1);
            int result2=st.executeUpdate(sql2);
//        boolean result1=st.execute(sql1); // Executing the Query
//        boolean result2=st.execute(sql2);  // Executing the Query
        
        //Clearing text Field
        userIDField.setText("");    
        fnameField.setText("");
        lnameField.setText("");
        addressField.setText("");
        dobField.setDateFormatString("");
        genderField.setSelectedItem("");
        mobileField.setText("");
        emailField.setText("");
        passwordField.setText("");
        JOptionPane.showMessageDialog(this,"User Updated Successfully...");
        
        
        dispose();
        new adminManagement().setVisible(true);
        
        } catch (SQLException ex) {
            Logger.getLogger(adminManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
       } 
            
            
        }else{
            if(adminsTable.getSelectedRowCount()==0){
                JOptionPane.showMessageDialog(this,"Table is Empty...");
            }else{
               JOptionPane.showMessageDialog(this,"Please Select a Single Row.!!!"); 
            }
        }
    }//GEN-LAST:event_editUserButtonActionPerformed

    private void adminsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminsTableMouseClicked
        //Setting Data into the Text Fields when click on a Row
        
        DefaultTableModel model=(DefaultTableModel)adminsTable.getModel();
        
        String tblid=model.getValueAt(adminsTable.getSelectedRow(),0).toString();
        String tblfname=model.getValueAt(adminsTable.getSelectedRow(),1).toString();
        String tbllname=model.getValueAt(adminsTable.getSelectedRow(),2).toString();
        String tbladdress=model.getValueAt(adminsTable.getSelectedRow(),3).toString();
        String tbldob=model.getValueAt(adminsTable.getSelectedRow(),4).toString();
        String tblgender=model.getValueAt(adminsTable.getSelectedRow(),5).toString();
        String tblmobile=model.getValueAt(adminsTable.getSelectedRow(),6).toString();
        String tblemail=model.getValueAt(adminsTable.getSelectedRow(),7).toString();
        String tblpassword=model.getValueAt(adminsTable.getSelectedRow(),8).toString();
        
        userIDField.setText(tblid);
        fnameField.setText(tblfname);
        lnameField.setText(tbllname);
        addressField.setText(tbladdress);
        dobField.setDateFormatString(tbldob);
        genderField.setSelectedItem(tblgender);
        mobileField.setText(tblmobile);
        emailField.setText(tblemail);
        passwordField.setText(tblpassword);
        
        
    }//GEN-LAST:event_adminsTableMouseClicked

    
    
    
    
    public static void main(String args[]) throws SQLException {
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
            java.util.logging.Logger.getLogger(adminManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane SP;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel adminmanagementHeading;
    private javax.swing.JTable adminsTable;
    private javax.swing.JPanel bluePanel;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton deleteUserButton;
    private com.toedter.calendar.JDateChooser dobField;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JButton editUserButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel1;
    private javax.swing.JTextField fnameField;
    private javax.swing.JLabel fnamelabel;
    private javax.swing.JComboBox<String> genderField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField lnameField;
    private javax.swing.JLabel lnameLabel;
    private javax.swing.JTextField mobileField;
    private javax.swing.JLabel mobileLabel;
    private javax.swing.JButton newUserButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField userIDField;
    private javax.swing.JLabel userIDLabel;
    private javax.swing.JPanel whitePanel;
    // End of variables declaration//GEN-END:variables
}
