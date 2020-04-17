<%-- 
    Document   : AddCat
    Created on : Apr 17, 2020, 3:09:17 PM
    Author     : noobmaster
--%>
     
    <%
        if(session.getAttribute("adminemail") == null){
        
            response.sendRedirect("adminlogin.jsp");
       
        }
            
    %>
    
    

<%@page contentType="text/html" pageEncoding="UTF-8"%>

  <!DOCTYPE html>
  <html>
    <head>
      
     <link href="css/eShop.css" rel="stylesheet"> 
      <link href="css/fontawesome-free-5.12.1-web/css/all.css" rel="stylesheet"> <!--load all styles -->
      <!--Import Google Icon Font-->
      <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
      <!--Import materialize.css-->
      <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>

      <!--Let browser know website is optimized for mobile-->
      <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
      
      
    </head>
    
    
    

    <body id="Home" class="scrollspy test" background="image/gray-and-black-hive-printed-textile-691710.jpg">
   <!--UNREGISTERED USER'S HEADER-->

    

   
   
    
   
     <%@ include file="includes\adminheaderNormal.jsp"  %>  
            
     
      <form action="addCategory" method="post" enctype="multipart/form-data">  
      <div class="container" id="myForm" >
      
      <div class="card-panel z-depth-3">
        <div class="row">
        <div class="col s12">
            <div class="card-title center-align teal-text">
                <h4>Add a Category</h4>
            </div>
        </div>
      </div>
      <div class="row">
        <div class="input-field col s12">
          <input id="name" type="text" class="validate" name="bname">
          <label for="name">Category Name</label>
        </div>
      </div>
  
      <div class="row">
          
      
      <div class="row">
        <div class="input-field col s12">
          <textarea id="textarea" class="materialize-textarea" name="bmanufast"></textarea>
          <label for="bmanufast">Description</label>
        </div>
      </div>
      <br>
      <div class="row">
          <div class="input-feild col s12 ">  
               <label for="bimage">Select an image</label>
              <input type="file" name="bimage" >
              
             
          </div>
      </div>
      <br><br>
      
      
      <div class="row">
        <div class="col s12">
        <input type="submit" value="Submit" class="btn" style="width:100%;">
        
        </div>
      
      </div>
    </form>
  </div>
  </div>
      
      </div>
      </form>
      <!--JavaScript at end of body for optimized loading-->
      <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
      <script type="text/javascript" src="js/materialize.min.js"></script>
      <script type="text/javascript" src="js/removeVal.js"></script>
      <script>
          $(document).ready(function(){
          $('.sidenav').sidenav();
        
          });

          $(document).ready(function(){
          $('.slider').slider({indicators: false, height: 350, transition : 500,interval : 6000});
          });

          $(document).ready(function(){
          $('.materialboxed').materialbox();
          });
         
          
      </script>
      

       <%@ include file="includes\adminfooter.jsp"  %> 
    </body>
  </html>