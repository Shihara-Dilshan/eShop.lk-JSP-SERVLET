<%-- 
    Document   : headerNormal
    Created on : Mar 1, 2020, 3:41:45 PM
    Author     : noobmaster
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--UNREGISTERED USER'S HEADER-->

<script> 
    function showMSG(){
        
        
        var alerted = localStorage.getItem('alerted') || '';
    
   
        localStorage.setItem('alerted','no');
        
    }
    function showMSG2(){
        
        
        var alerted = localStorage.getItem('alerted') || '';
    
   
        localStorage.setItem('alerted','yes');
        
    }




</script>

<div class="navbar-fixed">
<nav class="teal">
    <div class="nav-wrapper">
      <a href="index.jsp" class="brand-logo" onclick="showMSG2()"> eShop.lk</a>
      <a href="#" data-target="mobile-demo" class="sidenav-trigger"><i class="material-icons">menu</i></a>
      <ul class="right hide-on-med-and-down">
       
        <li><a href="index.jsp" onclick="showMSG2()">Home</a></li>
        <li><a href="#search">Search</a></li>
        <li><a href="#">Products</a></li>
        <li><a href="signup.jsp" onclick="showMSG()">Sign up</a></li>
        <li><a href="login.jsp">Login</a></li>
        <li><a href="#" class="btn-floating teal darken-4 z-depth-0">
          <i class="material-icons">add_shopping_cart</i>
        
        </a></li>
        <li>
        <span class="badge white-text red"> in cart
        
        5
        </span>
        </li>
      </ul>
    </div>
  </nav>
</div>
  <ul class="sidenav" id="mobile-demo">
       
         <li><a href="index.jsp" onclick="showMSG2()">Home</a></li>
        <li><a href="#search">Search</a></li>
        <li><a href="#">Products</a></li>
        <li><a href="signup.jsp" onclick="showMSG()">Sign up</a></li>
        <li><a href="login.jsp">Login</a></li>
        <li><a href="https://www.facebook.com" class="btn-floating white darken-4 z-depth-0">
          <i class="material-icons">add_shopping_cart</i>
        
        </a></li>
        <li>
        
        <span class="badge white-text red">5 items in cart
        
        </span>
        </li>
  </ul>

  

	
