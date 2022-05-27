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
public class lecNoticeDAOimp implements lecNoticeDAO{

    
    
    public List<lecNotice> List() {
        
          List<lecNotice> list = new ArrayList<>();
        try {
            Connection con = LecturerDB.getConnection();
            String sql = "SELECT * FROM notice";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            
            
            while(rs.next()){
                lecNotice lec = new lecNotice();
                 lec.setNotice_id(rs.getString("no"));
                lec.setNotice_date(rs.getString("date"));
                lec.setNotice_title(rs.getString("title"));
                 lec.setNotice_content(rs.getString("notice"));
                 
 
                list.add(lec);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
        return list;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<lecNotice> list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public lecNotice get(String notice_id) {
        
         lecNotice n1=new lecNotice();
        try {
            Connection con = LecturerDB.getConnection();
            String sql = "SELECT * FROM notice WHERE no=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, notice_id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                
                n1.setNotice_date(rs.getString("date"));
                n1.setNotice_title(rs.getString("title"));
                n1.setNotice_content(rs.getString("notice"));
                
                /*s1.setStuid(rs.getString("SID"));
                s1.setStu_dept_id(rs.getString("dep_id"));
                s1.setStu_fname(rs.getString("fname"));
                s1.setStu_lname(rs.getString("lname"));
                s1.setStu_dob(rs.getString("dob"));
                s1.setStu_gender(rs.getString("gender"));
                s1.setStu_address(rs.getString("address"));
                s1.setLec_email(rs.getString("email"));
                s1.setStu_p_no(rs.getInt("mobile"));
                s1.setLec_password(rs.getString("password"));*/
                
                
        

            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
        return n1;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
