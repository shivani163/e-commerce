<%@include file="Header.jsp"%>
<body style="background-color:#76D7C4;">
<div class="container">
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">MobiDeal</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">Cart</a></li>
    
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Out</a></li>
      
    </ul>
  </div>
</nav>

<div class="row">
    <div class="col-lg-4">
                         
    <spring:url value="/resources/im/shop2.jpg" var="imgs" /><img height="150vh" max-width="90%" src="${imgs}"/>
     </div>
     <div class="column-lg-8">
     <h1 style="color:black" font-weight:100%;><strong>SHOPPING CART</strong></h1>
     </div>
       
    <div class="row">
<div class="page-header">
<div>
<h2 style="color:black;" font-weight:100%;><strong>SIGN IN FORM</strong></h2>
</div>
</div>
</div>

<form name='loginForm' action="<c:url value='/j_spring_security_check' />" method='POST'>

			<table>
				<tr>
					<td><strong>User Name:</strong></td>
					<td><input type='text' name='username' id='name'></td>
					</tr>
				<tr>
					<td><strong>Password:</strong></td>
					<td><input type='password' name='password' id='password' /></td>
				</tr>
				<tr>
					<td colspan='2'><input name="submit" type="submit" value="submit" /></td>
				</tr>
			</table>

			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />

		</form>
		
        </div>
        <%-- <h1> message ${msg}</h1>
        <c:if test="${msg == true}"> --%>
    </div>

<%@include file="Header.jsp"%>