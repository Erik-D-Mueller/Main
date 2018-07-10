<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 3 - Echo</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 3 - Echo</h1>
		
		
		<c:choose>
			<c:when test="${empty param.word }" >
			<c:set var="word" value="venus"/>
			</c:when>

			<c:otherwise>
				<c:set var="word" value="${param.word}" />
			</c:otherwise>
			
		</c:choose>			
		
		<c:choose>
			<c:when test="${empty param.count }" >
			<c:set var="count" value="20"/>
			</c:when>

			<c:otherwise>
				<c:set var="count" value="${param.count}" />
			</c:otherwise>
			
		</c:choose>		
		
		
		<ul>
		
		<c:forEach var="number" begin="0" end="${count}">
		<li style="font-size: ${count-number}pt;">${word}</li>
		</c:forEach>
		
		</ul>
		
	</body>
</html>
		
