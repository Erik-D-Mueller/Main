<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
ExpressionParser parser= new SpelExpressionParser();


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
		
		<ul>
		
		<c:set var="word" value="Word"/>
		<c:set var="count" value="20"/>
		
		<c:foreach begin="${count}" end=0 step="-1" var="font">
		
				
		


		
		</c:foreach>
		

		</ul>
		
	</body>
</html>