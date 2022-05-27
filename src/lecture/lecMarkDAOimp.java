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
public class lecMarkDAOimp implements lecMarkDAO{
    
    public List<lecMark> List() {
        List<lecMark> list = new ArrayList<>();
        try {
            Connection con = LecturerDB.getConnection();
            String sql = "SELECT * FROM ca_marks";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
           
            while(rs.next()){
                lecMark lec = new lecMark();
                 lec.setSub_id(rs.getString("sub_id"));
                 lec.setStu_id(rs.getString("st_id"));
                 lec.setQ1(rs.getFloat("q1"));
                 lec.setQ2(rs.getFloat("q2"));
                 lec.setQ3(rs.getFloat("q3"));
                 lec.setQ4(rs.getFloat("q4"));
                 lec.setAss1(rs.getFloat("ass1"));
                 lec.setAss2(rs.getFloat("ass2"));
                 lec.setAss3(rs.getFloat("ass3"));
                 lec.setMid(rs.getFloat("mid"));
                 
                list.add(lec);
            }
            
            //final marks table
             
            String sql1 = "SELECT * FROM final_exam_marks";
            PreparedStatement pss = con.prepareStatement(sql1);
            ResultSet rss = pss.executeQuery();
           
            while(rs.next()){
                lecMark lecs = new lecMark();
               /*  lec.setSub_id(rs.getString("sub_id"));
                 lec.setStu_id(rs.getString("st_id"));
                 lec.setQ1(rs.getFloat("q1"));
                 lec.setQ2(rs.getFloat("q2"));
                 lec.setQ3(rs.getFloat("q3"));
                 lec.setQ4(rs.getFloat("q4"));
                 lec.setAss1(rs.getFloat("ass1"));
                 lec.setAss2(rs.getFloat("ass2"));
                 lec.setAss3(rs.getFloat("ass3"));
                 lec.setMid(rs.getFloat("mid"));*/
               lecs.setPracticle(rss.getFloat("practical"));
               lecs.setPracticle(rss.getFloat("theory"));
                 
                list.add(lecs);
            }
            
            
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
        return list;
    }

    @Override
    public List<lecMark> list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void save(lecMark Student) {
      /*try {
            Connection con =  LecturerDB.getConnection();
            String sql = "INSERT INTO ca_marks(sub_id,st_id,q1,q2,q3,q4,ass1,ass2,ass3,mid) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,ca_marks. );
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
        }*/
    }
    
}
