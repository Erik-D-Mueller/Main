<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<c:set var="pageTitle" value="login" />


<h2>Login</h2>

<c:url value="confirmation" var="confirmationURL" />



<form:form action="${confirmationURL}" method="POST"
	modelAttribute="signup">

	<div>
		<label for="email">Email</label>
		<form:input path="email" />
		<form:errors path="email" cssClass="error" />
	</div>


	<label for="password">Password</label>
	<input type="submit" value="Submit" />

</form:form>


<%@include file="common/footer.jspf"%>
