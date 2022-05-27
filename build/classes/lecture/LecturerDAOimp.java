package lecture;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 *
 * @author CHATHURANGA
 */
public class LecturerDAOimp implements LecturerDAO{

    @Override
    public void save(Lecturer lecturer ) {
          try {
            Connection con =  LecturerDB.getConnection();
            String sql = "INSERT INTO lecturer(lec_id,lec_dept_id,fName,lName,dob,address,gender,mobile,email,position,password) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, lecturer.getLec_id());
            ps.setString(2, lecturer.getLec_dept_id());
            ps.setString(3, lecturer.getLec_fname());
            ps.setString(4, lecturer.getLec_lname());
            ps.setString(5, lecturer.getLec_dob());
            ps.setString(6, lecturer.getLec_address());
            ps.setString(7, lecturer.getGender());
             ps.setInt(8, lecturer.getLec_p_no());
            ps.setString(9, lecturer.getLec_email());
            ps.setString(10, lecturer.getLec_position());
             ps.setString(11, lecturer.getLec_password());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saved!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    @Override
    public void update(Lecturer lecturer) {
        
         try {
          
            Connection con = LecturerDB.getConnection();
            String sql = "UPDATE lecturer SET lec_id=?,lec_dept_id=?,fName=?,lName=?,dob=?,address=?,gender=?,mobile=?,email=?,position=? WHERE lec_id=?";
            
            PreparedStatement ps = con.prepareStatement(sql);
             ps.setString(1, lecturer.getLec_id());
            ps.setString(2, lecturer.getLec_dept_id());
            ps.setString(3, lecturer.getLec_fname());
            ps.setString(4, lecturer.getLec_lname());
            ps.setString(5, lecturer.getLec_dob());
            ps.setString(6, lecturer.getLec_address());
            ps.setString(7, lecturer.getGender());
             ps.setInt(8, lecturer.getLec_p_no());
            ps.setString(9, lecturer.getLec_email());
            ps.setString(10, lecturer.getLec_position());
             ps.setString(11, lecturer.getLec_id());
            ps.executeUpdate();
            
  
        
            JOptionPane.showMessageDialog(null, "Updated!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
        
    }

    @Override
    public void delete(Lecturer lecturer) {
        
        try {
          
            Connection con = LecturerDB.getConnection();
            String sql = "delete from lecturer  WHERE lec_id=?";
            PreparedStatement ps = con.prepareStatement(sql);  
            ps.setString(1, lecturer.getLec_id());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleteddd!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
        
    }

    @Override
    public Lecturer get(String lect_id) {
       
          Lecturer lec = new Lecturer();
        try {
            Connection con = LecturerDB.getConnection();
            String sql = "SELECT * FROM lecturer WHERE lec_id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, lect_id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                
                lec.setLec_id(rs.getString("lec_id"));
                lec.setLec_dept_id(rs.getString("lec_dept_id"));
                lec.setLec_fname(rs.getString("fName")); 
                 lec.setLec_lname(rs.getString("lName"));
                 lec.setLec_dob(rs.getString("dob"));
                lec.setLec_address(rs.getString("address"));
                 lec.setGender(rs.getString("gender"));
                lec.setLec_p_no(rs.getInt("mobile"));
                lec.setLec_email(rs.getString("email"));
                lec.setLec_position(rs.getString("position"));
               lec.setLec_password(rs.getString("password"));
        

            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
        return lec;
        
    }

    public List<Lecturer> List() {
        List<Lecturer> list = new ArrayList<>();
        try {
            Connection con = LecturerDB.getConnection();
            String sql = "SELECT * FROM lecturer";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            
            
            while(rs.next()){
                Lecturer lec = new Lecturer();
                 lec.setLec_id(rs.getString("lec_id"));
                lec.setLec_dept_id(rs.getString("lec_dept_id"));
                lec.setLec_fname(rs.getString("fName"));
                 lec.setLec_lname(rs.getString("lName"));
                 lec.setLec_dob(rs.getString("dob"));
                lec.setLec_address(rs.getString("address"));
                 lec.setGender(rs.getString("gender"));
                lec.setLec_p_no(rs.getInt("mobile"));
                lec.setLec_email(rs.getString("email"));
                lec.setLec_position(rs.getString("position"));
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
    public List<Lecturer> list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
