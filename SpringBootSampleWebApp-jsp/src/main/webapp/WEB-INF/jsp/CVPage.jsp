<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


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
<form>
  Upload CV: <input type="file" name="CV">
</form>
</td>
</tr>


</table>
<form method="POST" action="completeApplication">
	<input type="submit" value="Submit Application" />
</form>
