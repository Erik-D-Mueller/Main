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



	<c:url value="/Page4" var="formAction" />
	<form method="GET" action="${formAction}">



		<label for="favoriteSeason"> </label>
		<h2>What is your favorite season?</h2>
		<input type="text" name="favoriteSeason" id="favoriteSeason">



		 <br> <input type="submit" value="Next >>>">

	</FORM>


</div>


</body>
</html>