<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>

<c:url value="/css/squirrelCigarParties.css" var="cssHref" />
<link rel="stylesheet" href="${cssHref}">

<head>
<title>Hello Spring MVC</title>
</head>
<body>

	<div id="mainDiv">

		<div id="pictureDiv">
			<img src="/img/forDummies.png">
		</div>

		<h1>Welcome to the Squirrel Cigar Parties for Dummies website</h1>


		<!-- why is the dollar sign below necessary? 
		Why do I need the cout?  Why can't I just put it
		directly into the html, like other times?
		-->
		<c:forEach items="${reviews}" var="review">
		
		<hr/>
		<h3>
		<c:out value="${review.title}"/> 
		</h3>
		
		<h3>
		<c:out value="${review.dateSubmitted}"/> 
		</h3>
		
		<h3>
		I would give it <c:out value="${review.rating}"/> stars.
		</h3>
		
		<h3>
		<c:out value="${review.text}"/> 
		</h3>
		

		</c:forEach>
		
		
	</div>
</body>
</html>