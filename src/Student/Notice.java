/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

/**
 *
 * @author INSIGHT
 */
public class Notice {
    
    public  int Nid;
    public  String NDate;
    public  String Ntitle;
    
    
    public void setNoticeId(int Nid){
        this.Nid=Nid;
        
    }
    
    public int getNoticeId(){
        return Nid;
        
    }
    
    
    public void setNoticeNdate(String NDate){
        this.NDate=NDate;
    }
    
     public String getNoticeNdate(){
        return NDate;
        
    }
     
     public void setNoticeNtitle(String Ntitle){
        this.Ntitle=Ntitle;
    }
     
     public String getNoticeNtitle(){
         return Ntitle;
     }
     
       
    
}

