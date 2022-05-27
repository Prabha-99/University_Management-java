/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;


import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetMetaData;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 *
 */
public class Student implements StudentIF{
    
    private Integer id;
    private String name;
    private String address;
    private Vector data;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Vector getData() {
        return data;
    }

    


    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setData(Vector data) {
        this.data = data;
    }

    
    
    

    /*@Override
    public void display() {
        setData(new Vector());
        super.connection();
        
        int rowCounter=0;
        String sql="SELECT *FROM attendance";
        
        try {
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            
                while (rs.next()) {                    
                    rowCounter++;
                    String id=rs.getString("ATDID");
                    String fname=rs.getString("Date");
                    String lname=rs.getString("Status");
                   
                    
                    Vector row=new Vector();
                    row.add(id);
                    row.add(fname);
                    row.add(lname);
                     this.getData().add(row);
                    
                }
                rs.close();
                pst.close();
            
        } catch (Exception e) {
                message(e.getMessage());
        }
    
    
}

    @Override


    private void message(String message) {
       JOptionPane.showMessageDialog(null, message);
    }

    @Override
    public void Notice(Student.Notice notice) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public java.util.List<Student.Notice> List() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/

    @Override
    public void Notice(Student.Notice notice) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public java.util.List<Student.Notice> List() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}