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
		
		
	<div id="textDiv">
		<div><b>Favorite Color:</b> ${favoriteColor} </div>
		<div> <b>Favorite Food:</b>	${favoriteFood } </div>
		<div> <b>Favorite Season:</b> ${favoriteSeason} </div>
	</div>
	
</div>
		
	</body>
</html>