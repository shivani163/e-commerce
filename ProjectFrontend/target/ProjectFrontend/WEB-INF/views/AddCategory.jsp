<%@include file="Header.jsp" %>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<body style="background-color:plum;">
<div class="container">
<div class="row">
    <div class="col-lg-4">
                         
    <spring:url value="/resources/im/bag2.jpg" var="imgs" /><img height="150vh" max-width="90%" src="${imgs}"/>
     </div>
     <div class="column-lg-8">
     <h1 style="color:black" font-weight:100%;><strong>SHOPPING CART</strong></h1>
     </div>
     </div>
    <div class="row">
<div class="page-header">
<div>
<h2 style="color:black;" font-weight:100%;><strong>CATEGORY FORM</strong></h2>
</div>
</div>
</div>

<form:form modelAttribute="category"  cssClass="form-horizontal" action="saveCategory" method="POST">
  <div class="form-group">
    <label class="control-label col-sm-2" for="email"><h4 style="color:Black;" ><strong>Category ID:</strong></h4></label>
    <div class="col-sm-4">
      <form:input class="form-control" path="categoryId" value="${category.categoryid}"/>
    </div>
  </div>
    <div class="form-group">
    <label class="control-label col-sm-2" for="email"><h4 style="color:Black;" ><strong>Category:</strong></h4></label>
    <div class="col-sm-4">
      <form:input class="form-control" path="category" value="${category.category}"/>
    </div>
  </div>
  
    <div class="form-group"> 
    <div class="col-sm-offset-2 col-sm-4">
      <button type="submit" class="btn btn-warning" data-toggle="modal" data-target=".bs-example-modal-lg"><strong style="color:Black;">SUBMIT</strong></button>
         <button type="submit" class="btn btn-warning" ><strong style="color:Black;">BACK</strong></button>
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
