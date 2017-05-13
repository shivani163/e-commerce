

<body style="background-color:plum;">
<div class="container">
 <div class="row">
    <div class="col-lg-4">
                         
    <spring:url value="/resources/im/shop.jpg" var="imgs" /><img height="150vh" max-width="90%" src="${imgs}"/>
     </div>
     <div class="column-lg-8">
     <h1 style="color:black" font-weight:100%;><strong>SHOPPING CART</strong></h1>
     </div>                      
      </div> 
<div class="row">
<div class="page-header">
<div>
<h2 style="color:black" font-weight:100%;><strong>PRODUCT DETAILS</strong></h2>
</div>
</div>

</div>
   
<div class = "col-sm-4 col-md-4 ">
      <div class = "thumbnail">
        
        <spring:url value="/resources/im/${product.productid}.jpg" var="imgs" /><img height="150vh" max-width="90%" src="${imgs}"/>
      </div>
</div>
   <div class="row"> 
          <div class="col-sm-7 col-md-7">
              <p><strong><h4 style="color:black">ID:${product.productid}</h4></strong></p> 
           <p><strong><h4 style="color:black">Name:${product.productname}</h4></strong></p> 
            <p><strong><h4 style="color:black">Price:${product.price}</h4></strong></p>
              <p>
            <a href = "addCart?Id=${product.productid}" class = "btn btn-primary" role = "button">
               ADD TO CART
            </a> 
             <a href = "backtoHome" class = "btn btn-primary" role = "button">
               BACK
            </a> 
           
         </p>   

          </div>
    </div>
    <div>
              
        
    </div>

    </div>



