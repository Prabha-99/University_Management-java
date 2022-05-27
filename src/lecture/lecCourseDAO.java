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
public interface lecCourseDAO {
     public void update(lecCourse course);
     public lecCourse get(String subject_id);
    public List<lecCourse> list();
}
