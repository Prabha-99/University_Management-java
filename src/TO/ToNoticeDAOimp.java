/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import lecture.LecturerDB;
/**
 *
 * @author ASUS
 */
public class ToNoticeDAOimp implements ToNoticeDAO{

    @Override
    public ToNotice get(String notice_id) {
         ToNotice n1=new ToNotice();
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
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
        return n1;
  }

    @Override
    public List<ToNotice> list() {
         List<ToNotice> list = new ArrayList<>();
        try {
            Connection con = LecturerDB.getConnection();
            String sql = "SELECT * FROM notice";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
           
            while(rs.next()){
                ToNotice lec = new ToNotice();
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
    }
    

   
    
}
