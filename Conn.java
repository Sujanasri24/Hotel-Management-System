
package hotel.management.system;

import java.sql.*;


//5 steps for JDBC connectivity
//1. Register the Driver Class (Here MySQL driver)
//2. a. Create Connection and b. connection string
//3.create a statement (helps to execute mysql queries)
//4.executing mysql queries

public class Conn {
    
    Connection c;  //[2a]
    Statement s;  //[3], this is interface

    Conn() {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //[1] since this is an external entity there might be error, so keep in try catch
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagementsystem", "root", "");  //[2b]. The url is the connection string.
            s = c.createStatement();
        
        }
        catch (Exception e){
            e.printStackTrace();
        
    }
        
    }
    
    
    
}
