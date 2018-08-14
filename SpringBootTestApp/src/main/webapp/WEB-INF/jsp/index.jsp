<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="pageTitle" value="Survey" />
<%@include file="common/header.jspf"%>


<br />
<h2 class="text-center">Vote For Your Favorite Park!</h2>

<c:url value="survey" var="surveyUrl" />
<div class="row justify-content-md-center">
	<div class="col-md-6">
		<form:form action="${surveyUrl}" method="POST" modelAttribute="survey">
			<hr />
			<br />

			<div>
				<label for="firstName">First Name</label>
				<form:input path="firstName" class="form-control" />
				<form:errors path="firstName" cssClass="error" />
				<br />
			</div>
			<div>
				<label for="emailAddress">First Name</label>
				<form:input type="email" path="emailAddress" class="form-control" />
				<form:errors path="emailAddress" cssClass="error" />
				<br />
			</div>

			<div>
				<label for="country">Your Country</label>
				<form:select class="form-control" id="country" path="country">

					<form:option value="Andorra">Andorra</form:option>
					<form:option value="Bangledash">Bangledash</form:option>
					<form:option value="Brazil">Brazil</form:option>
					<form:option value="China">China</form:option>
					<form:option value="Congo-DRC">Congo-DRC</form:option>
					<form:option value="Egypt">Egypt</form:option>
					<form:option value="Ethiopia">Ethiopia</form:option>
					<form:option value="Germany">Germany</form:option>
					<form:option value="India">India</form:option>
					<form:option value="Indonesia">Indonesia</form:option>
					<form:option value="Iran">Iran</form:option>
					<form:option value="Japan">Japan</form:option>
					<form:option value="Mexico">Mexico</form:option>
					<form:option value="Nigeria">Nigeria</form:option>
					<form:option value="Pakistan">Pakistan</form:option>
					<form:option value="Philippines">Philippines</form:option>
					<form:option value="Russia">Russia</form:option>
					<form:option value="Thailand">Thailand</form:option>
					<form:option value="Turkey">Turkey</form:option>
					<form:option value="United States">United States</form:option>
					<form:option value="Vietnam">Vietnam</form:option>

				</form:select>
				<form:errors path="country" cssClass="error" />
				<br />
			</div>
			<div>
				<label for="activityLevel">Your Activity Level</label>
				<form:select class="form-control" id="activityLevel"
					path="activityLevel">
					<form:option value="inactive">Inactive</form:option>
					<form:option value="sedentary">Sedentary</form:option>
					<form:option value="active">Active</form:option>
					<form:option value="extremely active">Extremely Active</form:option>
				</form:select>
				<form:errors path="activityLevel" cssClass="error" />
				<br />
			</div>
			<div>
				<br /> <input type="submit" class="btn btn-success btn-block"
					value="Submit" />
			</div>
		</form:form>
	</div>
	<div class="col-sm-12">
		<br />
		<hr />
	</div>
</div>

<%@include file="common/footer.jspf"%>