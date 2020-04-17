package lk.eShop.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.http.Part;


public class ItemDaoImplement implements ItemDao {
    
    private final String sqlCatInsert = "insert into category( id , Cname,CDescription,CfileName , CfilePath ) values(1,?,?,?,?)";
    
    @Override
    public boolean AddCategory(String Cname , String Cdesc , String fileName , String FilePath ){
    
        
        
            try{
            DataSource source = new DataSource();
            Connection con = source.createConnection();
            PreparedStatement st = con.prepareStatement(sqlCatInsert);
           
            st.setString(1, Cname);
            st.setString(2, Cdesc);
            st.setString(3, fileName);
            st.setString(4, FilePath);
            
            int i = st.executeUpdate();
            
            if(i!=0){
            
                return true;
            
            }
            }catch(ClassNotFoundException | SQLException e){
            
                e.printStackTrace();
            
            }catch(Exception e){
            
                e.printStackTrace();
            
            }
            
            return false;        
    
        
    }
    
}
