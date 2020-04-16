package lk.eShop;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "addBrand", urlPatterns = {"/addBrand"})
public class addBrand extends HttpServlet {

    private String brandName;
    private String manufacture;
    

    public addBrand() {
    }
    
    
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

   
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        this.setBrandName(request.getParameter("bname"));
        this.setManufacture(request.getParameter("bmanufast"));
    
        if(1==1){
        
        
        }else{
        
        
        }
    
    
    }
}
