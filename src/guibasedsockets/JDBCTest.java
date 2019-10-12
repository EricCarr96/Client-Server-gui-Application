/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guibasedsockets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class JDBCTest {
    
    public static void main(String[] arg) throws SQLException 
    {
            final String DB_URL = "jdbc:mysql://localhost/ctuonline";
            try(Connection connection = (Connection) DriverManager.getConnection(DB_URL, "ctuonline", "student")){
                try(PreparedStatement statement = connection.prepareStatement("Select * from CUSTOMER");
                    ResultSet rs = statement.executeQuery()){
                    while(rs.next()){
                        System.out.println(rs.getInt(1));
                         System.out.println(rs.getString("first_name"));
                        System.out.println(rs.getString("last_name"));
                        System.out.println(rs.getString("address"));
                        
                } 
                }
                
                catch (SQLException ex) {
                    ex.printStackTrace();
                }
                
            
            
            }
    
         
            
            
            
            
    }   
    
}
