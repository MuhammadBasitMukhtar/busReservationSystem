/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busreservationsystem;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Smart pc
 */
public class Conn {

    public static com.mysql.jdbc.PreparedStatement prepareStatement(String sql, int RETURN_GENERATED_KEYS) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    PreparedStatement statement;
    public Connection c;
    public Statement s;
    public Conn(){  
        //this.statement =  c.prepareStatement(sql);
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            c = DriverManager.getConnection("jdbc:mysql:///busreservation","root","");    
            s =c.createStatement(); 
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}
