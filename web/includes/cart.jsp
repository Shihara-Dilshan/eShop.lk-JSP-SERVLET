<%-- 
    Document   : cart
    Created on : Apr 19, 2020, 5:00:30 AM
    Author     : noobmaster
--%>

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
                            <div id="purchList" style="overflow: show;">
                                <li id="plist">

                                </li>

                            </div>
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
