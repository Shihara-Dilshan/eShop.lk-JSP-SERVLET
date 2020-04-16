
package lk.eShop;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import lk.eShop.dao.signupDao;



@WebServlet(name = "signup", urlPatterns = {"/signup"})
public class signup extends HttpServlet {

    private String Fname;
    private String Password;
    signupDao sdao;

    public signup() {
        sdao = new signupDao();
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
     
     
    
    
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub

         
        this.setFname(request.getParameter("email"));
        this.setPassword(request.getParameter("password"));
          
       
         
        try {  
            if(sdao.check(Fname, Password)){
                HttpSession session = request.getSession();
                session.setAttribute("regsuccess", "yes");
                response.sendRedirect("index.jsp");
                
                
            }
            else{
                response.sendRedirect("login.jsp");
            }  
        } catch (ClassNotFoundException ex) {
           //Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            //Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        }  
        



}


/*

@WebServlet(name = "signup", urlPatterns = {"/signup"})
public class signup extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub


            response.setContentType("text/html");  
            PrintWriter pw = response.getWriter(); 
           
            String sql = "insert into user( id,name,password) values(4,?,?)";
            String url = "jdbc:mysql://localhost:3306/user";
            String DBusername = "root";
            String DBpassword = "classified23";
       

        try{  
          String Fname = request.getParameter("email");  
         
          String Password = request.getParameter("password");  
          

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,DBusername,DBpassword);
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, Fname);
            st.setString(2, Password);
            int i = st.executeUpdate();

          
          //con.commit(); 
          String msg=" ";
          if(i!=0){  
                HttpSession session = request.getSession();
                session.setAttribute("regsuccess", "yes");
                response.sendRedirect("index.jsp");
               

          }  
          else{  
            msg="failed to insert the data";
            pw.println("<font size='6' color=blue>" + msg + "</font>");
           }  
          st.close();
        }  
        catch (Exception e){  
          pw.println(e);  
        }  

}

}
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



*/
