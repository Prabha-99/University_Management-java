/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

/**
 *
 * @author INSIGHT
 */




import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;



public class StudentImp implements StudentIF{
PreparedStatement select;
@Override
    public void Notice(Notice notice){
    

}
 @Override
 public List<Notice> List(){
    List<Notice> list=new ArrayList<>();
     try {
            Connection conn1=DBconnect.getConnection();
             select=conn1.prepareStatement("select *  from notice");
            ResultSet rs= select.executeQuery();

        try {
        } catch (Exception ex) {
            Logger.getLogger(StudentImp.class.getName()).log(Level.SEVERE, null, ex);
        }
           
            while(rs.next()){
                    Notice Nt=new Notice();              
                    Nt.setNoticeId(rs.getInt("no"));
                    Nt.setNoticeNdate(rs.getString("date"));
                    Nt.setNoticeNtitle(rs.getString("title"));
                    list.add(Nt);
 
             }

       } catch (SQLException ex) {
            Logger.getLogger(StudentImp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (Exception ex) {
        Logger.getLogger(StudentImp.class.getName()).log(Level.SEVERE, null, ex);
    }
         return list;   
       }

//    @Override
//    public void Notice(Student.Notice notice) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}


