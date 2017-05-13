<%@include file="Header.jsp" %>
<body style="background-color:plum;">
<div class="container">

  <div class="row">
<div class="page-header">
<div>
<h2 style="color:black" font-weight:100%;><strong>PRODUCT DETAILS TABLE</strong></h2>
</div>
</div>
</div>
  <table class="table table-bordered style=color:black;">
    <thead>
      <tr>
        <th><h3 style=color:black;><strong>PRODUCT ID</strong></h3></th> 
          <th><h3 style=color:black;><strong>PRODUCT NAME</strong></h3></th> 
        <th><h3 style=color:black;><strong>PRODUCT PRICE</strong></h3></th>
        <th><h3 style=color:black;><strong>PRODUCT CATEGORY</strong></h3></th>
        <th></th>
      </tr>
    </thead>
    <tbody>
    
     <c:forEach var="product" items="${pList}" varStatus="status">
      <tr>
          <td><h4 style=color:black;>${product.productid}</h4></td>
          <td><h4 style=color:black;>${product.productname}</h4></td>
        <td><h4 style=color:black;>${product.price}</h4></td>
        <td><h4 style=color:black;>${product.category}</h4></td>
          <td>
            <p>
            <a href = "delprod?id=${product.productid}" class = "btn btn-primary" role = "button">
               DELETE
            </a> 
            
            <a href = "editprod?id=${product.productid}" class = "btn btn-primary" role = "button">
               EDIT
            </a>
         </p>  
          </td>
      </tr>
      
      </c:forEach>
    </tbody>
  </table>
</div>



<%@include file="Footer.jsp" %>