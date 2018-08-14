<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<c:url value="/css/style.css" var="cssHref" />
<link rel="stylesheet" href="${cssHref}">

<head>
<title>Hello Spring MVC</title>
</head>
<div id="contents">

	<div id="infoDiv">




<h2> Please enter your information:</h2>
		<div id="newReviewForm">

			<c:url value="/CV" var="formAction" />
			<form action="${formAction}" method="POST" >




		<div id="firstName">
			<label for="firstName">First Name</label> 
			<input name="firstName" id="firstName"> 
		</div>
			
			<div id="lastName">
			<label for="lastName">Last Name</label> 
			<input type="text" name="lastName" id="lastName"> 
		</div>
			
			
			<div id="countryDiv">
			<label for="country">Country</label> <select name="country">
				<option value="Andorra">Andorra</option>
					<option value="Bangledash">Bangledash</option>
					<option value="Brazil">Brazil</option>
					<option value="China">China</option>
					<option value="Congo-DRC">Congo-DRC</option>
					<option value="Egypt">Egypt</option>
					<option value="Ethiopia">Ethiopia</option>
					<option value="Germany">Germany</option>
					<option value="India">India</option>
					<option value="Indonesia">Indonesia</option>
					<option value="Iran">Iran</option>
					<option value="Japan">Japan</option>
					<option value="Mexico">Mexico</option>
					<option value="Nigeria">Nigeria</option>
					<option value="Pakistan">Pakistan</option>
					<option value="Philippines">Philippines</option>
					<option value="Russia">Russia</option>
					<option value="Thailand">Thailand</option>
					<option value="Turkey">Turkey</option>
					<option value="United States">United States</option>
					<option value="Vietnam">Vietnam</option>
			</select>
			</div>

			
		<div id="userDate">
		<input type="date" name="userDate">
		</div>	

		<div id="submitButtonDiv">
		<input id="formSubmitButton" type="submit" value="Submit" />
		</div>
		</form>

		</div>

	</div>
</div>

</html>