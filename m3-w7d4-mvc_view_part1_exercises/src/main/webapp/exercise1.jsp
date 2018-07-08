<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 1 - FizzBuzz</title>
		<style>
			li {
				list-style-type: none;
			}
			
			.fizz {
				color: blue;
			}
			
			.buzz {
				color: red;
			}
			
			.fizzbuzz {
				color: purple;
				font-size: 150%;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 1 - FizzBuzz</h1>
		<ul>
		
			 
		<c:set var="output" value="" />
		<c:set var="classAttribute" value="" />
		
		
		<c:forEach begin="1" end="100" var="number">	 
			 
			 <c:choose>
			 
			 	<c:when test="${ number%3==0 && number%5==0}">
			 		<li class="fizzbuzz">FizzBuzz</li>
			 	</c:when>
			 	
			 	<c:when test="${ number%3==0}">
			 		<li class="fizz">Fizz</li>
			 	</c:when>
			 	
			 	<c:when test = "${number%5==0}">
			 		<li class="buzz">Buzz</li>
			 	</c:when>
			 	
			 	<c:otherwise>
			 	    <li>${number}</li>
			 	
			 	</c:otherwise>
			 

			 
			 </c:choose>
			 
			 
			 </c:forEach>
			 
			 
		</ul>
	</body>
</html>