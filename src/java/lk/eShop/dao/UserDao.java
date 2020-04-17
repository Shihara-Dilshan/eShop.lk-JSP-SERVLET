
package lk.eShop.dao;
 

interface UserDao {
    
    boolean loginCheck(String name , String password);
    boolean signUp(String name , String password);
    boolean adminLoginCheck(String name , String password);
    
    
}
