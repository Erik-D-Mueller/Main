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


<c:url value="/Page3" var="formAction" />
	<form method="GET" action="${formAction}">		

	<label for="favoriteFood"></label>
	<h2>What is your favorite food?</h2>
	<input type=text name="favoriteFood" id="favoriteFood">


	<br>
	<input type="submit" value="Next >>>">

	</form>
</div>

</body>
</html>