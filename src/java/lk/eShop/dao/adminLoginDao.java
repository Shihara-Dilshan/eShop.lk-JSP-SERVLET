
package lk.eShop.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;





public class adminLoginDao implements loginDB{

    
    String sql = "select * from admin where name=? and password=?";
    String url = "jdbc:mysql://localhost:3306/user";
    String DBusername = "root";
    String DBpassword = "classified23";
    
    @Override
    public boolean check(String name , String password) throws ClassNotFoundException, SQLException {
    
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,DBusername,DBpassword);
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, name);
            st.setString(2, password);
            ResultSet rs =st.executeQuery();
            
            if(rs.next()){
            
                return true;
            
            }
            }catch(Exception e){
            
                e.printStackTrace();
            
            }
            
            return false;
    }
    

}
