package lk.eShop;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import lk.eShop.dao.ItemDaoImplement;
import lk.eShop.dao.UserDaoImplement;


@WebServlet(name = "addCategory", urlPatterns = {"/addCategory"})
public class addCategory extends HttpServlet {

    
    private String Cname;
    private String CDescription;

    

    public void setCname(String Bname) {
        this.Cname = Bname;
    }

    public void setCDescription(String BDescription) {
        this.CDescription = BDescription;
    }
   

    
    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        ItemDaoImplement sdao = new ItemDaoImplement();
         
        this.setCname(request.getParameter("bname"));
        this.setCDescription(request.getParameter("bmanufast"));
          
       
         
        if(sdao.AddBrand(Cname, CDescription)){
            
            //HttpSession session = request.getSession();
            //session.setAttribute("additem", "yes");
            response.sendRedirect("adminindex.jsp");
            
            
        }
        else{
            response.sendRedirect("login.jsp");
        }
         
        
    }
}
