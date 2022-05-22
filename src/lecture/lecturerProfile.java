
package lecture;

import admin.DBconnect;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class lecturerProfile {
     
    private static String id=null;
    private String fname=null;
    private String lname=null;
    private String add=null;
    private String email=null;
    private String gender=null;
    private String dob=null;
    private String pno=null;
    
    
     public void setFname(String fname) {
        this.fname = fname;
    }
     
     public String getFname() {
        return fname;
    }
     
     public void setLname(String lname) {
        this.lname = lname;
    }
     
     public String getLname() {
        return lname;
    }
     
      public void setDOB(String dob) {
        this.dob = dob;
    }
     
     public String getDOB() {
        return dob;
    }
     
    public void setGender(String gender) {
        this.gender = gender;
    }
     
     public String getGender() {
        return gender;
    } 

     
    public void setAddress(String add) {
        this.add = add;
    }
     
     public String getAddress() {
        return add;
    } 
     
     public void setEmail(String email) {
        this.email = email;
    }
     
     public String getEmail() {
        return email;
    } 


    public void setPno(String pno) {
        this.pno = pno;
    }
    
    public String getPno() {
        return pno;
    }
    
    
    public static void setId(String tId) {
        id = tId;
    }
    
    public static String getId() {
        return id;
    }
    
    
      public void editProfile()
    {
        java.sql.Connection con = null;
        
        try
        {
            con = DBconnect.getConnection();
           
            String result = "update lecturer set fName='"+ getFname()+"',IName='"+ getLname()+"',DOB='"+ getDOB()+"',Gender='"+ getGender()+"',Address='"+ getAddress()+"',Email='"+ getEmail()+"',Mobile='"+ getPno()+"' where LID='"+ getId()+"'";
            PreparedStatement ps = con.prepareStatement(result);
            ps.execute();
         
            javax.swing.JOptionPane.showMessageDialog(null, "Data update successfully");
            
            
        }
        
        catch(HeadlessException | SQLException e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
    }

    void setName(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    
}
