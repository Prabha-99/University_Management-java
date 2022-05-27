/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lecture;

import java.util.List;

/**
 *
 * @author ASUS
 */
public interface lecStudentDAO {
    public lecStudent get(String stu_id);
    public List<lecStudent> list();
    
}
