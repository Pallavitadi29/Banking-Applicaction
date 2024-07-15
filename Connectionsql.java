package banking.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
/**
 *
 * @author Adarsh Kunal
 */





public class ConnectionSql
{
    Connection c;
    Statement s;
    
    public ConnectionSql() {
        try {
            
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "Pranu@123");
            s = c.createStatement();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}


    
   


 