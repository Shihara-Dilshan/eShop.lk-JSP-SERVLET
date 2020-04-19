
package lk.eShop;

import com.sun.xml.internal.ws.api.message.Packet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lk.eShop.dao.Item;

@WebServlet(name = "addItemToCart", urlPatterns = {"/addItemToCart"})
public class addItemToCart extends HttpServlet {

    private String Iname;
    private String Iprice;

    public void setIname(String Iname) {
        this.Iname = Iname;
    }

    public void setIprice(String Iprice) {
        this.Iprice = Iprice;
    }
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException  {
        response.setContentType("text/html;charset=UTF-8");
       
            this.setIname(request.getParameter("item"));
            this.setIprice(request.getParameter("price"));
        
            Item item = new Item();
            item.setItemName(Iname);
            
            try{
                item.setItemPrice(Integer.parseInt(Iprice));
            }catch(NumberFormatException e){
            
                e.printStackTrace();
            }
            
            
            
            
            ArrayList<Item> arrayList = new ArrayList<Item>();
            arrayList.add(item);
            
            if(request.getServletContext().getAttribute("cartItemList") != null){
            
                arrayList = (ArrayList<Item>) request.getServletContext().getAttribute("cartItemList");
                arrayList.add(item);
                request.getServletContext().setAttribute("cartItemList", arrayList);
                
            }else{
            
                request.getServletContext().setAttribute("cartItemList", arrayList);
                
            }
            response.sendRedirect("item.jsp?show=Laptops");
        
        }
    

}


 

