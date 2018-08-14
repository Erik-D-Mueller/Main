<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>

<link href="<c:url value="/css/style.css"/>" rel="stylesheet" type="text/css" />

<script src="/js/run.js"></script>

<body>

<h2>CV Page</h2>

<table>
	<tr>
		<th>First Name:</th>
		<td><c:out value="${candidateInfo.firstName}" /></td>
	</tr>
	<tr>
		<th>Last Name:</th>
		<td><c:out value="${candidateInfo.lastName}" /></td>
	</tr>
	<tr>
		<th>Country:</th>
		<td><c:out value="${candidateInfo.country}" /></td>
	</tr>
	<tr>
		<th>Date:</th>
		<td><c:out value="${candidateInfo.date}" /></td>
	</tr>
<tr>

<td>

 <div id="wrapper">
 <input type="file" accept="image/*" onchange="preview_image(event)">
 <img id="output_image"/>
 </div>
 
 
 

</td>
</tr>


</table>
<form method="POST" action="completeApplication">
	<input type="submit" value="Submit Application" />
</form>
</body>
</html>
