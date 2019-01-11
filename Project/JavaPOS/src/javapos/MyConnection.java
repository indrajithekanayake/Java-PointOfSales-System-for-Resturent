package javapos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author USER
 */
public class MyConnection {
    
    
    public static Connection getConnection(){
        
        
        try{
            Connection con=null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/javapos","root","");
            return con;
            
        } catch(ClassNotFoundException | SQLException ex){
            System.out.println(ex.getMessage());
        }
        
        return null;
        
    }
    
    
}
