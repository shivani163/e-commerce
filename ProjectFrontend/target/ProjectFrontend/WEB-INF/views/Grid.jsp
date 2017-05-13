<%@include file="Header.jsp" %>
<div class="container">
<div class = "row" style="margin-top:50px;">
   
    <div class = "col-sm-4 col-md-4 ">
      <div class = "thumbnail">
       
          <spring:url value="/resources/im/cos.jpg" var="imgs" /><img height="150vh" max-width="90%" src="${imgs}"/>
         
      </div>
      
      <div class = "caption">
         <h4><strong>COSMETICS</strong></h4>
        
         
         <p>
            <a href = "#" class = "btn btn-primary" role = "button">
            
               BUY NOW
            </a> 
            
            <a href = "#" class = "btn btn-primary" role = "button">
               CANCEL
            </a>
         </p>
         
      </div>
   </div> 
  
   <!-- Strt foeach method -->
    <!--  <h1>${msg}</h1>
    <c:forEach var="pro" items="${pList}" varStatus="status">
    <table>
    <thead>
      <tr>
          <td><h4 style=color:black;>${pro.productid}</h4></td>
          <td><h4 style=color:black;>${pro.productname}</h4></td>
        <td><h4 style=color:black;>${pro.price}</h4></td>
        <td><h4 style=color:black;>${pro.category}</h4></td>
          
          <td>
            <p>
            <a href = "#" class = "btn btn-primary" role = "button">
               EDIT
            </a> 
            
            <a href = "#" class = "btn btn-primary" role = "button">
               DELETE
            </a>
         </p>  
          </td>
      </tr>
      </thead>
      </table>
      </c:forEach> -->
         
 
   
<!--    <c:forEach var="product" items="${pList}" varStatus="status">
   <div class = "col-sm-4 col-md-4 ">
      <div class = "thumbnail">
       
          <spring:url value="/resources/im/${product.productid}.jpg" var="imgs" /><img height="150vh" max-width="90%" src="${imgs}"/>
      </div>
      
      <div class = "caption">
         <h4><strong>${product.productname}</strong></h4>

   
         <p>
            <a href ="prodETAIL?Id=${product.productid}"  class = "btn btn-primary" role = "button">
               VIEW DETAILS
            </a> 
           
         </p>
         
      </div>
   </div>
   </c:forEach>-->
     <!-- Ends foeach method -->
   
    <div class = "col-sm-4 col-md-4 ">
      <div class = "thumbnail">
        
          <spring:url value="/resources/im/saree.jpg" var="imgs" /><img height="150vh" max-width="90%" src="${imgs}"/>
      </div>
      
      <div class = "caption">
         <h4><strong>SAREES</strong></h4>
        
         
         <p>
            <a href = "#" class = "btn btn-primary" role = "button">
               BUY NOW
            </a> 
            
            <a href = "#" class = "btn btn-primary" role =" button">
               CANCEL
            </a>
         </p>
         
      </div>
   </div>
    
    
    <div>
   <div class = "col-sm-4 col-md-4 ">
      <div class = "thumbnail">
        
          <spring:url value="/resources/im/watch1.jpg" var="imgs" /><img height="150vh" max-width="90%" src="${imgs}"/>
      </div>
      
      <div class = "caption">
         <h4><strong>WATCHES</strong></h4>
         
         <p>
            <a href = "#" class = "btn btn-primary" role = "button">
               BUY NOW
            </a> 
            
            <a href = "#" class = "btn btn-primary" role =" button">
               CANCEL
            </a>
         </p>
         
      </div>
   </div>
       <div class = "col-sm-4 col-md-4 ">
      <div class = "thumbnail">
        
          <spring:url value="/resources/im/clutch.jpg" var="imgs" /><img height="150vh" max-width="90%" src="${imgs}"/>
      </div>
      
      <div class = "caption">
         <h4><strong>CLUTCH</strong></h4>
        
         
         <p>
            <a href = "#" class = "btn btn-primary" role="button">
               BUY NOW
            </a> 
            
            <a href = "#" class = "btn btn-primary" role ="button">
               CANCEL
            </a>
         </p>
         
      </div>
   </div>
   
   <div class = "col-sm-4 col-md-4 ">
      <div class = "thumbnail">
        
          <spring:url value="/resources/im/heels.jpg" var="imgs" /><img height="150vh" max-width="90%" src="${imgs}"/>
      </div>
   <div class = "caption">
         <h4><strong>SANDALS</strong></h4>
        
         
         <p>
            <a href = "#" class = "btn btn-primary" role="button">
               BUY NOW
            </a> 
            
            <a href = "#" class = "btn btn-primary" role ="button">
               CANCEL
            </a>
         </p>
         
      </div>
   </div> 
   </div>
</div>
</div>
<%@include file="Footer.jsp" %>
