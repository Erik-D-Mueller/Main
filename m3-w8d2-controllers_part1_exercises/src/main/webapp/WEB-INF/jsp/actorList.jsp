<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="All Actors List" />

<%@include file="common/header.jspf"%>


<c:url value="/actorList" var="formAction"/> 
<form action="${formActon}" method="POST">


	<div id="name">
		 <input type="text" name="name"
			id="name">
	</div>

	<div id="submitButton">
		<input id="submitButton" type="submit" value="Submit">
	</div>


</form>



<table class="table">

	<tr>
		<th>Name</th>
	</tr>

	<c:forEach items="${actors}" var="actor">
		<tr>
			<!-- What do we print here for each actor? -->
		</tr>
	</c:forEach>
</table>


<%@include file="common/footer.jspf"%>