/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TO;

import java.util.List;

/**
 *
 * @author ASUS
 */
public interface ToNoticeDAO {
    public ToNotice get(String notice_id);
    public List<ToNotice> list();
}
