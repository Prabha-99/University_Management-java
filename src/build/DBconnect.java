/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package build;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class DBconnect {

    public static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    Connection con;
    
    public Connection getCon(){
        return con;
    }
    
   public void setCon(Connection con){
       this.con=con;
   }
   
   private static final String _URL_="jdbc:mysql://localhost/techmis";
   private static final String _DRIVER_="com.mysql.cj.jdbc.Driver";
   
   public void connection(){
       
   synchronized(_URL_){
          try {
           Class.forName(_DRIVER_);
           setCon(DriverManager.getConnection(_URL_,"root",""));
           JOptionPane.showMessageDialog(null, "Database connection success!");
       } catch (Exception e) {
              JOptionPane.showMessageDialog(null, e);
       }
 
           
       }    
   
    }
   
    public static void main(String[] args) {
        
            DBconnect obj=new DBconnect();
        
        obj.connection();
    }

    
}