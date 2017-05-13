<%@include file="Header.jsp" %>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<body style="background-color:#76D7C4;">
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
<h2 style="color:black;" font-weight:100%;><strong>SHIPPING DETAILS FORM</strong></h2>
</div>
</div>
</div>

<form:form modelAttribute="shipping"  cssClass="form-horizontal" action="saveUserDetail" method="POST">
 <%--<div class="form-group">
    <label class="control-label col-sm-2" for="email"><h4 style="color:Black;" ><strong>Shipping ID:</strong></h4></label>
    <div class="col-sm-4">
      <form:input class="form-control" path="shippingid" value="${shipping.shippingid}"/>
    </div>
  </div> --%>
  <div class="form-group">
    <label class="control-label col-sm-2" for="email"><h4 style="color:Black;" ><strong>User ID:</strong></h4></label>
    <div class="col-sm-4">
      <form:input class="form-control" path="userid" value="${shipping.userid}"/>
    </div>
  </div>
    <div class="form-group">
    <label class="control-label col-sm-2" for="email"><h4 style="color:Black;" ><strong>First Name:</strong></h4></label>
    <div class="col-sm-4">
      <form:input class="form-control" path="firstname" value="${shipping.firstname }"/>
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="price"><h4 style="color:black;"><strong>Last Name:</strong></h4></label>
    <div class="col-sm-4"> 
      <form:input class="form-control" path="lastname" value="${shipping.lastname}" />
    </div>
  </div>
  
<!--    <div class="form-group"> -->
<!--     <label class="control-label col-sm-2" for="category"><h4 style="color:black;"><strong>Login Id:</strong></h4></label> -->
<!--     <div class="col-sm-4">  -->
<%--       <form:input class="form-control" path="loginId" value="${shipping.loginid }"/> --%>
<!--     </div> -->
<!--   </div>  -->
  
   <div class="form-group">
    <label class="control-label col-sm-2" for="category"><h4 style="color:black;"><strong>Contact:</strong></h4></label>
    <div class="col-sm-4"> 
      <form:input class="form-control" path="contact" value="${shipping.contact }"/>
    </div>
  </div> 
  
   <div class="form-group">
    <label class="control-label col-sm-2" for="category"><h4 style="color:black;"><strong>Shipping:</strong></h4></label>
    <div class="col-sm-4"> 
      <form:input class="form-control" path="shipping" value="${shipping.shipping }"/>
    </div>
  </div> 
  
   <div class="form-group">
    <label class="control-label col-sm-2" for="category"><h4 style="color:black;"><strong>Area:</strong></h4></label>
    <div class="col-sm-4"> 
      <form:input class="form-control" path="area" value="${shipping.area}"/>
    </div>
  </div> 
  
   <div class="form-group">
    <label class="control-label col-sm-2" for="category"><h4 style="color:black;"><strong>City:</strong></h4></label>
    <div class="col-sm-4"> 
      <form:input class="form-control" path="city" value="${shipping.city }"/>
    </div>
  </div> 
  
   <div class="form-group">
    <label class="control-label col-sm-2" for="category"><h4 style="color:black;"><strong>Pin code:</strong></h4></label>
    <div class="col-sm-4"> 
      <form:input class="form-control" path="pincode" value="${shipping.pincode }"/>
    </div>
  </div> 
  
    <div class="form-group"> 
    <div class="col-sm-offset-2 col-sm-4">
    
      <button type="submit" class="btn btn-warning" data-toggle="modal" data-target=".bs-example-modal-lg"><strong style="color:Black;">SUBMIT</strong></button>
        <a href="tocarttable" class="btn btn-warning" role="button"><strong style="color:Black;">Back</strong></a>
          <a href="gotopayment" class="btn btn-warning" role="button"><strong style="color:Black;">Next</strong></a>
    </div>
  </div>
    
</form:form>
<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
  <div class="modal-dialog modal-lg">
    <div class="modal-content">
    
      <div class="modal-body">
     
      <h1>"${success}"</h1>
     
      </div>
    </div>
  </div>
</div>

    </div>



<%@include file="Footer.jsp" %>
