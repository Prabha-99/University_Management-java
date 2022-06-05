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
    public void save(lecMark ca) {
      try {
            Connection con =  LecturerDB.getConnection();
            String sql = "INSERT INTO ca_marks(sub_id,st_id,q1,q2,q3,q4,ass1,ass2,ass3,mid) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,ca.getSub_id() );
            ps.setString(2,ca.getStu_id());
            ps.setFloat(3, ca.getQ1());
            ps.setFloat(4,ca.getQ2());
            ps.setFloat(5,ca.getQ3());
            ps.setFloat(6, ca.getQ4());
            ps.setFloat(7,ca.getAss1());
             ps.setFloat(8,ca.getAss2());
            ps.setFloat(9,ca.getAss3());
            ps.setFloat(10,ca.getMid());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saved!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    @Override
    public List<lecMark> list1() {
            List<lecMark> list1 = new ArrayList<>();
        try {
            Connection con = LecturerDB.getConnection();
            String sql1 = "SELECT * FROM final_exam_marks";
            PreparedStatement pss = con.prepareStatement(sql1);
            ResultSet rss = pss.executeQuery();
           
            while(rss.next()){
                lecMark lec1 = new lecMark();
                 lec1.setSub_id(rss.getString("sub_id"));
                 lec1.setStu_id(rss.getString("st_id"));
                 lec1.setPracticle(rss.getFloat("practical"));
                 lec1.setTheory(rss.getFloat("theory"));
                 
                list1.add(lec1);
            }
           
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
        return list1;
    }
    
}
