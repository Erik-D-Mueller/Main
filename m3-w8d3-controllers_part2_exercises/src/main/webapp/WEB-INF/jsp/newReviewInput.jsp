<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<c:url value="/css/squirrelCigarParties.css" var="cssHref" />
<link rel="stylesheet" href="${cssHref}">

<head>
<title>Hello Spring MVC</title>
</head>
<div id="contents">

	<div id="mainDiv">

<h2> Enter your review and hit submit!</h2>
		<div id="newReviewForm">

			<c:url value="/home" var="formAction" />
			<form action="${formAction}" method="POST" >

		// title, text and username must match exactly as written in the java class
		<div id="usernameDiv">
			<label for="username">Username</label> 
			<input type="text" name="username" id="username"> 
		</div>
			
			<div id="ratingDiv">
			<label for="rating">Select a rating</label> <select name="rating">
				<option value=1>1</option>
				<option value=2>2</option>
				<option value=3>3</option>
				<option value=4>4</option>
				<option value=5>5</option>
			</select>
			</div>

			<div id="titleDiv">
			<label for="title">Review Title</label>
			<input type="text" name="title" id="title">
			</div>
			
			<div id="textDiv">
			<label for="text">Review Text</label>
			<input type="text" name="text" id="text">
			</div>

		<div id="submitButtonDiv">
		<input id="formSubmitButton" type="submit" value="Submit" />
		</div>
		</form>

		</div>

	</div>
</div>

</html>