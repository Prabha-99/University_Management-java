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
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
        return list;
    }

    @Override
    public List<lecMark> list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
