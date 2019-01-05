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
        
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/javapos","root","Asiri#Iroshan#1996");
        } catch(ClassNotFoundException | SQLException ex){
            System.out.println(ex.getMessage());
        }
        
        return con;
        
    }
    
}
