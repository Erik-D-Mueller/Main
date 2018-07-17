<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="common/header.jspf"%>

<c:set var="pageTitle" value="registration" />


<h2>New User Registration</h2>

<c:url value="/registration" var="registrationUrl" />

<form:form action="${registrationUrl}" method="POST" modelAttribute="registration">

		<label for="firstName">First Name</label>
		<form:input path="firstName"/>
		<form:errors path="firstName" cssClass="error"/>
		
		<label for="lastName">Last Name</label>
		<form:input type="text" path="lastName"/>
		<form:errors path="lastName" cssClass="error"/>

		<label for="email">Email</label>
		<form:input type="text" path="email"/>
		<form:errors path="email" cssClass="error" />
		<form:errors path="emailMatching" cssClass="error"/> 

		<label for="verifyEmail">Confirm Email</label>
		<form:input type="text" path="verifyEmail" />
		<form:errors path="verifyEmail" cssClass="error" />
	
		<label for="password">Password</label>
		<form:input type="text" path="password" />
		<form:errors path="password" cssClass="error" />
		<form:errors path="passwordMatching" cssClass="error"/> 
		
		<label for="verifyPassword">Confirm</label>
		<form:input type="text" path="verifyPassword" />
		<form:errors path="verifyPassword" cssClass="error" />
	
		<label for="birthday">Birthday</label>
		<form:input type="text" path="birthday" />
		<form:errors path="birthday" cssClass="error" />
	
		<label for="tickets"># of Tickets</label>
		<form:input type="text" path="tickets" />
		<form:errors path="tickets" cssClass="error" />
	
	<div>
		<input type="submit" value="Submit" />
	</div>

</form:form>


<%@include file="common/footer.jspf"%>
