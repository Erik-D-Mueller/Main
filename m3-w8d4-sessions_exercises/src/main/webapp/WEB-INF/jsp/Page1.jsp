<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<c:url value="/css/favorites.css" var="cssHref" />
<link rel="stylesheet" href="${cssHref}">

	<head>
		<title></title>
	</head>
	<body>
	<div id="boxDiv">
	
		<h1>Favorite Things Exercise</h1>
		
			
			
	<c:url value="/Page2" var="formAction" />
	<form method="GET" action="${formAction}">		
		
		<label for="favoriteColor"> </label><h2>What is your favorite color?</h2><input type="text" name="favoriteColor" id="favoriteColor">
		

		<br>
		<input type="submit" value = "Next >>>"	>
		
		</FORM>
		
		
		
		
		</div>
	</body>
</html>