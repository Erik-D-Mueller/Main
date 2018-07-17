<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="common/header.jspf"%>

<c:set var="pageTitle" value="login" />


<h2>Login</h2>

<c:url value="/login" var="loginUrl" />

<form:form action="${loginURL}" method="POST" modelAttribute="login">

		<label for="email">Email</label>
		<form:input type="text" path="email" />
		<form:errors path="email" cssClass="error" />


	
		<label for="password">Password</label>
		<form:input type="text" path="password" />
		<form:errors path="password" cssClass="error" />
	
	<div>
		<input type="submit" value="LOG ME IN! " />
	</div>

</form:form>


<%@include file="common/footer.jspf"%>
