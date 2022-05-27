/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecture;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class lecStudentDAOimp implements lecStudentDAO{

    
      public List<lecStudent> List() {
        List<lecStudent> list = new ArrayList<>();
        try {
            Connection con = LecturerDB.getConnection();
            String sql = "SELECT * FROM students";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            
            
            while(rs.next()){
                lecStudent lec = new lecStudent();
                 lec.setStuid(rs.getString("SID"));
                 lec.setStu_dept_id(rs.getString("dep_id"));
                 lec.setStu_fname(rs.getString("fname"));
                 lec.setStu_lname(rs.getString("lname"));
                 lec.setStu_dob(rs.getString("dob"));
                 lec.setStu_gender(rs.getString("gender"));
                 lec.setStu_address(rs.getString("address"));
                 lec.setLec_email(rs.getString("email"));
                 lec.setStu_p_no(rs.getInt("mobile"));
                 lec.setLec_password(rs.getString("password"));
                 
                
                 
 
                list.add(lec);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
        return list;
    }
      
    @Override
    public List<lecStudent> list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public lecStudent get(String stu_id) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       
          
          lecStudent s1=new lecStudent();
        try {
            Connection con = LecturerDB.getConnection();
            String sql = "SELECT * FROM students WHERE SID=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, stu_id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                
                s1.setStuid(rs.getString("SID"));
                s1.setStu_dept_id(rs.getString("dep_id"));
                s1.setStu_fname(rs.getString("fname"));
                s1.setStu_lname(rs.getString("lname"));
                s1.setStu_dob(rs.getString("dob"));
                s1.setStu_gender(rs.getString("gender"));
                s1.setStu_address(rs.getString("address"));
                s1.setLec_email(rs.getString("email"));
                s1.setStu_p_no(rs.getInt("mobile"));
                s1.setLec_password(rs.getString("password"));
                
                
        

            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
        return s1;
    }

}
