<%-- 
    Document   : cart
    Created on : Apr 19, 2020, 5:00:30 AM
    Author     : noobmaster
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="lk.eShop.dao.Item"%>
   





<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section id="cartSection">
    <div id="cart" class="hideCart test">
        <div>
            <form action="#" method="GET">
                <div class="col s4">
                    <div class="card">
                        <div class="card-image">




                        </div>
                        <div class="card-content">
                            <h6 class="center-align">
                                Your Cart items will show here
                            </h6>
                            
                            <%
                                ArrayList<Item> arrayList = new ArrayList<Item>();
                                if (request.getServletContext().getAttribute("cartItemList") != null) {
                                    arrayList = (ArrayList<Item>)request.getServletContext().getAttribute("cartItemList");
                                }
                                
                                if(!arrayList.isEmpty()){
                                
                                      for(Item item : arrayList){
                                
                               
                                          
                            %>
                            
                            
                            
                            <div id="purchList" style="overflow: show;">
                                <div style="display:table;width: 100%">
                                    
                                    <input style="display: table-cell;" value="<%=item.getItemName() %>">  

                                    <i class="material-icons" id="cartIcon" onclick="aa()"
                                       style="display: table-cell; text-align: right;">edit</i>
                                    <i class="material-icons" id="cartIcon" onclick="aa()"
                                       style="display: table-cell; text-align: right;">delete</i>
                                </div>

                            </div>
                            
                            
                           <%
                           
                                      }
                                      
                                }
                           
                           %>
                            
                           

                            <div style="display: table;padding-top: 20px;" class="teal-text">

                                <div id="total">
                                    <h5 style="display: table-cell; " id="displayPrice"></h5>
                                </div>
                            </div>
                            <div style="text-align: center;padding-top: 20px;">
                                <button class="btn waves-effect waves-light" type="submit" name="action">Check Out
                                    <i class="material-icons right">add_shopping_cart</i>
                                </button>


                            </div>

                        </div>


                    </div>

            </form>
        </div>



</section>
