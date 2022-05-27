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
public class lecCourseDAOimp implements lecCourseDAO{

    @Override
    public void update(lecCourse course) {
        try {
          
            Connection con = LecturerDB.getConnection();
            String sql = "UPDATE subjects SET sub_d_id=?,sub_id=?,sub_co_id=?,sub_name=?,lec_id=? WHERE sub_id=?";
            
            PreparedStatement ps = con.prepareStatement(sql);
             ps.setString(1, course.getDep_id());
            ps.setString(2, course.getSub_id());
            ps.setString(3, course.getCo_id());
            ps.setString(4, course.getSub_name());
            ps.setString(5, course.getLec_id());
           
             ps.setString(6, course.getSub_id());
            ps.executeUpdate();
            
  
        
            JOptionPane.showMessageDialog(null, "Updated!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
   
    @Override
    public lecCourse get(String subject_id) {
        
        lecCourse lec = new lecCourse();
        try {
            Connection con = LecturerDB.getConnection();
            String sql = "SELECT * FROM subjects WHERE sub_id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,subject_id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                
                lec.setDep_id(rs.getString("sub_d_id"));
                lec.setSub_id(rs.getString("sub_id"));
                lec.setCo_id(rs.getString("sub_co_id"));
                lec.setSub_name(rs.getString("sub_name"));
                lec.setLec_id(rs.getString("lec_id"));
               
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
        return lec;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public List<lecCourse > List() {
        List<lecCourse> list = new ArrayList<>();
        try {
            Connection con = LecturerDB.getConnection();
            String sql = "SELECT * FROM subjects";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            
            
            while(rs.next()){
                lecCourse lec = new lecCourse ();
                
                lec.setDep_id(rs.getString("sub_d_id"));
                lec.setSub_id(rs.getString("sub_id"));
                lec.setCo_id(rs.getString("sub_co_id"));
                lec.setSub_name(rs.getString("sub_name"));
                lec.setLec_id(rs.getString("lec_id"));
                
       
 
                list.add(lec);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
        return list;
    }

    @Override
    public List<lecCourse> list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
