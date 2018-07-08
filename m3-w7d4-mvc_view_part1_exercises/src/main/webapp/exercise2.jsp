<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 2 - Fibonacci 25</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 2 - Fibonacci 25</h1>
		<ul>
		
		<c:set var="previousPreviousNumber" value="0"/>
		<c:set var="previousNumber" value="1"/>
		<c:set var="output" value="0"/>
		
		<li>0</li>
		<li>1</li>
		
		<c:forEach begin="0" end="25" step="1" var="counter">
		
		<c:set var="output" value="${previousNumber + previousPreviousNumber}"/>
		
		<li>${output}</li>
		
		<c:set var="previousPreviousNumber" value="${previousNumber}"/>
		
		<c:set var="previousNumber" value="${output}"/>
		
		</c:forEach>
		
			 
		</ul>
	</body>
</html>