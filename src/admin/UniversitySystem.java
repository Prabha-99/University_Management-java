
package build;

import com.sun.jdi.connect.spi.Connection;


public class UniversitySystem extends DBconnect{

    
    public static void main(String[] args) {
        
        //mainInterface.java as the first interface to open
        mainInterface main=new mainInterface();
        main.show();
        
        DBconnect obj=new DBconnect();
        
        obj.connection();
    }
    
}
