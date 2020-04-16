
package lk.eShop.dao;

import java.sql.SQLException;


interface loginDB {
    
    boolean check(String name , String password) throws SQLException , ClassNotFoundException;
    
    
}
