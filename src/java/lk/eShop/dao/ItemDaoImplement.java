package lk.eShop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ItemDaoImplement implements ItemDao {
    
    private final String sqlCatInsert = "insert into category( Cname,CDesc) values(?,?)";
    
    @Override
    public boolean AddBrand(String Cname , String Cdesc ){
    
        
        
            try{
            DataSource source = new DataSource();
            Connection con = source.createConnection();
            PreparedStatement st = con.prepareStatement(sqlCatInsert);
            st.setString(1, Cname);
            st.setString(2, Cdesc);
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
