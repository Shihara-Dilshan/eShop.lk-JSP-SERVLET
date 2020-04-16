
package lk.eShop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class addbrandDao extends addDB{

    String sql = "insert into user( id,name,password) values(4,?,?)";
    String url = "jdbc:mysql://localhost:3306/user";
    String DBusername = "root";
    String DBpassword = "classified23"; 
    
    
    
    @Override
    public boolean add() {
      
        
  
       return false;
    }
    
    
    
}
