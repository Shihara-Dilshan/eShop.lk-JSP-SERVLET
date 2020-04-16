
package lk.eShop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;


public class signupDao{
    
            String sql = "insert into user( id,name,password) values(4,?,?)";
            String url = "jdbc:mysql://localhost:3306/user";
            String DBusername = "root";
            String DBpassword = "classified23";
   
    public boolean check(String name , String password)  throws ClassNotFoundException, SQLException{
    
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,DBusername,DBpassword);
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, name);
            st.setString(2, password);
            int i = st.executeUpdate();
            
            if(i!=0){
            
                return true;
            
            }
            }catch(Exception e){
            
                e.printStackTrace();
            
            }
            
            return false;
    }
    
}
