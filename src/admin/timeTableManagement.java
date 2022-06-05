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
public class timeTableManagement extends javax.swing.JFrame {

 
    public timeTableManagement() {
        initComponents();
        displayData();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        whitePanel8 = new javax.swing.JPanel();
        coursemanagementHeading7 = new javax.swing.JLabel();
        timeTableLabel = new javax.swing.JLabel();
        timeTableField = new javax.swing.JTextField();
        departmentLabel = new javax.swing.JLabel();
        levelLabel = new javax.swing.JLabel();
        newTimetableButton = new javax.swing.JButton();
        editTimetableButton = new javax.swing.JButton();
        deleteTimetableButton7 = new javax.swing.JButton();
        resetTimetableButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        CT = new javax.swing.JScrollPane();
        timetableTable = new javax.swing.JTable();
        dayField = new javax.swing.JComboBox<>();
        dayLabel = new javax.swing.JLabel();
        departmentField = new javax.swing.JComboBox<>();
        semesterLabel1 = new javax.swing.JLabel();
        semesterField = new javax.swing.JComboBox<>();
        levelField = new javax.swing.JComboBox<>();
        subjectLabel = new javax.swing.JLabel();
        subjectField = new javax.swing.JTextField();
        startTimeLabel = new javax.swing.JLabel();
        startTimeField = new javax.swing.JTextField();
        endTimeLabel = new javax.swing.JLabel();
        endTimeField = new javax.swing.JTextField();
        locationLabel = new javax.swing.JLabel();
        locationField = new javax.swing.JComboBox<>();
        typeLabel = new javax.swing.JLabel();
        typeField = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        coursemanagementHeading7.setFont(new java.awt.Font("Lucida Fax", 1, 36)); // NOI18N
        coursemanagementHeading7.setForeground(new java.awt.Color(0, 51, 102));
        coursemanagementHeading7.setText("Manage Time Tables");

        timeTableLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        timeTableLabel.setForeground(new java.awt.Color(0, 51, 102));
        timeTableLabel.setText("T_TableID :");

        departmentLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        departmentLabel.setForeground(new java.awt.Color(0, 51, 102));
        departmentLabel.setText("Department :");

        levelLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        levelLabel.setForeground(new java.awt.Color(0, 51, 102));
        levelLabel.setText("Level :");

        newTimetableButton.setBackground(new java.awt.Color(0, 51, 102));
        newTimetableButton.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        newTimetableButton.setForeground(new java.awt.Color(204, 204, 204));
        newTimetableButton.setText("New");
        newTimetableButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newTimetableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTimetableButtonActionPerformed(evt);
            }
        });

        editTimetableButton.setBackground(new java.awt.Color(0, 51, 102));
        editTimetableButton.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        editTimetableButton.setForeground(new java.awt.Color(204, 204, 204));
        editTimetableButton.setText("Update");
        editTimetableButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editTimetableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTimetableButtonActionPerformed(evt);
            }
        });

        deleteTimetableButton7.setBackground(new java.awt.Color(0, 51, 102));
        deleteTimetableButton7.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        deleteTimetableButton7.setForeground(new java.awt.Color(204, 204, 204));
        deleteTimetableButton7.setText("Delete");
        deleteTimetableButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteTimetableButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTimetableButton7ActionPerformed(evt);
            }
        });

        resetTimetableButton.setBackground(new java.awt.Color(0, 51, 102));
        resetTimetableButton.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        resetTimetableButton.setForeground(new java.awt.Color(204, 204, 204));
        resetTimetableButton.setText("Reset");
        resetTimetableButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetTimetableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetTimetableButtonActionPerformed(evt);
            }
        });

        closeButton.setBackground(new java.awt.Color(0, 51, 102));
        closeButton.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        closeButton.setForeground(new java.awt.Color(255, 255, 255));
        closeButton.setText("X");
        closeButton.setBorderPainted(false);
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

        timetableTable.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        timetableTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TimetableID", "Department", "Level", "Semester", "Date", "Subject", "Start_Time", "End_Time", "Location", "Type"
            }
        ));
        timetableTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timetableTableMouseClicked(evt);
            }
        });
        CT.setViewportView(timetableTable);

        dayField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednsday", "Thursday", "Friday" }));
        dayField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayFieldActionPerformed(evt);
            }
        });

        dayLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        dayLabel.setForeground(new java.awt.Color(0, 51, 102));
        dayLabel.setText("Day :");

        departmentField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ICT", "BST", "ET" }));

        semesterLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        semesterLabel1.setForeground(new java.awt.Color(0, 51, 102));
        semesterLabel1.setText("Semester : ");

        semesterField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        semesterField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterFieldActionPerformed(evt);
            }
        });

        levelField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        levelField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelFieldActionPerformed(evt);
            }
        });

        subjectLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        subjectLabel.setForeground(new java.awt.Color(0, 51, 102));
        subjectLabel.setText("Subject :");

        startTimeLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        startTimeLabel.setForeground(new java.awt.Color(0, 51, 102));
        startTimeLabel.setText("Start_Time :");

        endTimeLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        endTimeLabel.setForeground(new java.awt.Color(0, 51, 102));
        endTimeLabel.setText("End_Time :");

        locationLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        locationLabel.setForeground(new java.awt.Color(0, 51, 102));
        locationLabel.setText("Location :");

        locationField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NBLLT", "NBSLT", "Lab11", "Lab12", "LabII", "ILT", " " }));
        locationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationFieldActionPerformed(evt);
            }
        });

        typeLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        typeLabel.setForeground(new java.awt.Color(0, 51, 102));
        typeLabel.setText("Day :");

        typeField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "theory", "Practical" }));
        typeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout whitePanel8Layout = new javax.swing.GroupLayout(whitePanel8);
        whitePanel8.setLayout(whitePanel8Layout);
        whitePanel8Layout.setHorizontalGroup(
            whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, whitePanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(closeButton))
            .addGroup(whitePanel8Layout.createSequentialGroup()
                .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(whitePanel8Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(whitePanel8Layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(newTimetableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(editTimetableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(deleteTimetableButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(resetTimetableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(coursemanagementHeading7, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(whitePanel8Layout.createSequentialGroup()
                                .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(departmentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(timeTableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(levelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(semesterLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dayField, 0, 91, Short.MAX_VALUE)
                                    .addComponent(timeTableField, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                    .addComponent(departmentField, 0, 91, Short.MAX_VALUE)
                                    .addComponent(semesterField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(levelField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, whitePanel8Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(startTimeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(endTimeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(endTimeField)
                                            .addComponent(startTimeField, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)))
                                    .addGroup(whitePanel8Layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(whitePanel8Layout.createSequentialGroup()
                                                .addComponent(subjectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(subjectField, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(whitePanel8Layout.createSequentialGroup()
                                                .addComponent(locationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(locationField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(whitePanel8Layout.createSequentialGroup()
                                                .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(typeField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addGap(18, 18, 18))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, whitePanel8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CT, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        whitePanel8Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dayField, departmentField, levelField, semesterField, subjectField, timeTableField});

        whitePanel8Layout.setVerticalGroup(
            whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(whitePanel8Layout.createSequentialGroup()
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(coursemanagementHeading7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeTableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeTableField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subjectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subjectField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departmentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departmentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(endTimeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(levelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(levelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(endTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semesterLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semesterField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(typeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(whitePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editTimetableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteTimetableButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetTimetableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newTimetableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(CT, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        whitePanel8Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dayField, departmentField, endTimeField, levelField, locationField, semesterField, startTimeField, subjectField, timeTableField, typeField});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(whitePanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(whitePanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void displayData(){ 
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tecmis","root","");
            
                    //Retrieveing DB table data into the Jtable
                   
                    Statement st=conn.createStatement();
                    String sql="SELECT * FROM time_table";       //Query to Retrive data from DB
                    ResultSet result=st.executeQuery(sql);  // Executing the Query
                    
                                       
                    //Getting data into String Variables from table until End of Table data
                    while(result.next()){
                        String id=result.getString("Time_Table_id");
                        String stddepartment=result.getString("Department_ID");
                        String level=result.getString("Level");
                        String semester=result.getString("Semester");
                        String date=result.getString("Date");
                        String subject=result.getString("Subject_Name");
                        String starttime=result.getString("Start_time");               
                        String endtime=result.getString("End_time");
                        String location=result.getString("Location");                                           
                        String type=result.getString("Type");
                        
                        
                        //String Array for Store data into Jtabel
                        String intoJ[]={id,stddepartment,level,semester,date,subject,starttime,endtime,location,type};
                        DefaultTableModel model=(DefaultTableModel)timetableTable.getModel(); //Allows to "insert" a row at a specified location in the model
                        
                        model.addRow(intoJ);
                        
                        
                    }
                              
                    } catch (SQLException ex) {
            Logger.getLogger(adminManagement.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    
    
    
    
    private void newTimetableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTimetableButtonActionPerformed

        //Adduser Funcntion
        if(timeTableField.getText().isEmpty() ||  departmentField.getSelectedItem().equals(evt) || levelField.getSelectedItem().equals(evt) || semesterField.getSelectedItem().equals(evt) || dayField.getSelectedItem().equals(evt) || subjectField.getText().isEmpty() ||  startTimeField.getText().isEmpty() || endTimeField.getText().isEmpty()  || locationField.getSelectedItem().equals(evt) || typeField.getSelectedItem().equals(evt)) {
                JOptionPane.showMessageDialog(this,"Fill the all Fields...!!!");
            }else{
            try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tecmis","root","")){
                if(conn!=null){    //Checking the connection
                    System.out.println("Connected");
                }

                //Inserting Data into (course) Table
                PreparedStatement add= conn.prepareStatement("INSERT INTO time_table VALUES(?,?,?,?,?,?,?,?,?,?)");  // Inserting into Timetable Table

                add.setString(1,timeTableField.getText());
                add.setString(2, (String) departmentField.getSelectedItem());
                add.setString(3, (String) levelField.getSelectedItem());
                add.setString(4, (String) semesterField.getSelectedItem());
                add.setString(5, (String) dayField.getSelectedItem());
                add.setString(6,subjectField.getText());
                add.setString(7,startTimeField.getText());
                add.setString(8,endTimeField.getText());
                add.setString(9, (String) locationField.getSelectedItem());
                add.setString(10, (String) typeField.getSelectedItem());
                
                

                int row=add.executeUpdate();// Executing the Insert Query
                JOptionPane.showMessageDialog(this,"New Time_Table Added Successfully..."); //Success message

                //Clearing the form for next Entry.
                timeTableField.setText("");
                departmentField.setSelectedItem("");
                levelField.setSelectedItem("");
                semesterField.setSelectedItem("");
                dayField.setSelectedItem("");
                subjectField.setText("");
                startTimeField.setText("");
                endTimeField.setText("");
                locationField.setSelectedItem("");
                typeField.setSelectedItem("");
                

                dispose();
                new timeTableManagement().setVisible(true);

            } catch (SQLException ex) {
                Logger.getLogger(adminManagement.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_newTimetableButtonActionPerformed

    private void editTimetableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTimetableButtonActionPerformed
        DefaultTableModel model=(DefaultTableModel)timetableTable.getModel();
        if(timetableTable.getSelectedRowCount()==1){

            String id=timeTableField.getText();
            String department=(String) departmentField.getSelectedItem();
            String level=(String) levelField.getSelectedItem();
            String semester=(String) semesterField.getSelectedItem();
            String day=(String) dayField.getSelectedItem();
            String subject=subjectField.getText();
            String starttime=startTimeField.getText();
            String endtime=endTimeField.getText();
            String location=(String) locationField.getSelectedItem();
            String type=(String) typeField.getSelectedItem();

            //Setting Updated Value at Row

            model.setValueAt(id, timetableTable.getSelectedRow(),0);
            model.setValueAt(department, timetableTable.getSelectedRow(),1);
            model.setValueAt(level, timetableTable.getSelectedRow(),2);
            model.setValueAt(semester, timetableTable.getSelectedRow(),3);
            model.setValueAt(day, timetableTable.getSelectedRow(),4);
            model.setValueAt(subject, timetableTable.getSelectedRow(),5);
            model.setValueAt(starttime, timetableTable.getSelectedRow(),6);
            model.setValueAt(endtime, timetableTable.getSelectedRow(),7);
            model.setValueAt(location, timetableTable.getSelectedRow(),8);
            model.setValueAt(type, timetableTable.getSelectedRow(),9);
            


            //Updating into Database
            Connection conn;
            if(timeTableField.getText().isEmpty() ||  departmentField.getSelectedItem().equals(evt) || levelField.getSelectedItem().equals(evt) || semesterField.getSelectedItem().equals(evt) || dayField.getSelectedItem().equals(evt) || subjectField.getText().isEmpty() ||  startTimeField.getText().isEmpty() || endTimeField.getText().isEmpty()  || locationField.getSelectedItem().equals(evt) || typeField.getSelectedItem().equals(evt)) {
                JOptionPane.showMessageDialog(this,"Fill the all Fields...!!!");
            }else{
                try {
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tecmis","root","");

                    Statement st=conn.createStatement();

                    String sql1=" UPDATE time_table SET Time_Table_id='"+timeTableField.getText()+"' , Department_ID='"+departmentField.getSelectedItem()+"' ,Level='"+levelField.getSelectedItem()+"' ,Semester='"+semesterField.getSelectedItem()+"' ,Date='"+dayField.getSelectedItem()+"' ,Subject_Name='"+subjectField.getText()+"' ,Start_time='"+startTimeField.getText()+"' ,End_time='"+endTimeField.getText()+"' ,Location='"+locationField.getSelectedItem()+"' ,Type='"+typeField.getSelectedItem()+"' WHERE Time_Table_id= '"+id+"' "; //Update into time_tableTable

                    int result=st.executeUpdate(sql1);

                    //        boolean result1=st.execute(sql1); // Executing the Query
                    //        boolean result2=st.execute(sql2);  // Executing the Query

                    //Clearing text Field
                        timeTableField.setText("");
                        departmentField.setSelectedItem("");
                        levelField.setSelectedItem("");
                        semesterField.setSelectedItem("");
                        dayField.setSelectedItem("");
                        subjectField.setText("");
                        startTimeField.setText("");
                        endTimeField.setText("");
                        locationField.setSelectedItem("");
                        typeField.setSelectedItem("");

                    JOptionPane.showMessageDialog(this,"Time_Table Updated Successfully...");

                    dispose();
                    new timeTableManagement().setVisible(true);

                } catch (SQLException ex) {
                    Logger.getLogger(adminManagement.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }else{
            if(timetableTable.getSelectedRowCount()==0){
                JOptionPane.showMessageDialog(this,"Table is Empty...");
            }else{
                JOptionPane.showMessageDialog(this,"Please Select a Single Row.!!!");
            }
        }
    }//GEN-LAST:event_editTimetableButtonActionPerformed

    private void deleteTimetableButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTimetableButton7ActionPerformed
        Connection conn;
        if(timeTableField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Please Enter the Time_Table ID which you need to Delete...!!!");
        }else{
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tecmis","root","");

                Statement st=conn.createStatement();

                String id=timeTableField.getText();
                String sql1="DELETE FROM course WHERE co_id='"+id+"'";  //Deleting from TimeTable Table

                boolean result1=st.execute(sql1); // Executing the Query

                timeTableField.setText("");//Clearing text Field
                JOptionPane.showMessageDialog(this,"Time Table Deleted Successfully...");

                dispose();
                new timeTableManagement().setVisible(true);

            } catch (SQLException ex) {
                Logger.getLogger(adminManagement.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_deleteTimetableButton7ActionPerformed

    private void resetTimetableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetTimetableButtonActionPerformed
        timeTableField.setText("");
        departmentField.setSelectedItem("");
        levelField.setSelectedItem("");
        semesterField.setSelectedItem("");
        dayField.setSelectedItem("");
        subjectField.setText("");
        startTimeField.setText("");
        endTimeField.setText("");
        locationField.setSelectedItem("");
        typeField.setSelectedItem("");
    }//GEN-LAST:event_resetTimetableButtonActionPerformed

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        setVisible(false);
        new adminDashboard().setVisible(true);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void timetableTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timetableTableMouseClicked
        //Setting Data into the Text Fields when click on a Row

        DefaultTableModel model=(DefaultTableModel)timetableTable.getModel();

        String id=model.getValueAt(timetableTable.getSelectedRow(),0).toString();
        String department=model.getValueAt(timetableTable.getSelectedRow(),1).toString();
        String level=model.getValueAt(timetableTable.getSelectedRow(),2).toString();
        String semester=model.getValueAt(timetableTable.getSelectedRow(),3).toString();
        String day=model.getValueAt(timetableTable.getSelectedRow(),4).toString();
        String subject=model.getValueAt(timetableTable.getSelectedRow(),5).toString();
        String starttime=model.getValueAt(timetableTable.getSelectedRow(),6).toString();
        String endtime=model.getValueAt(timetableTable.getSelectedRow(),7).toString();
        String location=model.getValueAt(timetableTable.getSelectedRow(),8).toString();
        String type=model.getValueAt(timetableTable.getSelectedRow(),9).toString();
        
        

        timeTableField.setText(id);
        departmentField.setSelectedItem(department);
        levelField.setSelectedItem(level);
        semesterField.setSelectedItem(semester);
        dayField.setSelectedItem(day);
        subjectField.setText(subject);
        startTimeField.setText(starttime);
        endTimeField.setText(endtime);
        locationField.setSelectedItem(location);
        typeField.setSelectedItem(type);

    }//GEN-LAST:event_timetableTableMouseClicked

    private void semesterFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semesterFieldActionPerformed

    private void dayFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayFieldActionPerformed

    private void levelFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_levelFieldActionPerformed

    private void locationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationFieldActionPerformed

    private void typeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeFieldActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
       
    }//GEN-LAST:event_closeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(timeTableManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(timeTableManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(timeTableManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(timeTableManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new timeTableManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane CT;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel coursemanagementHeading7;
    private javax.swing.JComboBox<String> dayField;
    private javax.swing.JLabel dayLabel;
    private javax.swing.JButton deleteTimetableButton7;
    private javax.swing.JComboBox<String> departmentField;
    private javax.swing.JLabel departmentLabel;
    private javax.swing.JButton editTimetableButton;
    private javax.swing.JTextField endTimeField;
    private javax.swing.JLabel endTimeLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> levelField;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JComboBox<String> locationField;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JButton newTimetableButton;
    private javax.swing.JButton resetTimetableButton;
    private javax.swing.JComboBox<String> semesterField;
    private javax.swing.JLabel semesterLabel1;
    private javax.swing.JTextField startTimeField;
    private javax.swing.JLabel startTimeLabel;
    private javax.swing.JTextField subjectField;
    private javax.swing.JLabel subjectLabel;
    private javax.swing.JTextField timeTableField;
    private javax.swing.JLabel timeTableLabel;
    private javax.swing.JTable timetableTable;
    private javax.swing.JComboBox<String> typeField;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JPanel whitePanel8;
    // End of variables declaration//GEN-END:variables
}
