
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
</c:import>

<link rel="stylesheet" href="css/detail.css" />


<img src="img/${product.imageName}" id="mainPicture" />
							
<table id="productTable">
			
			<tr>
				<td class="2ndRowHeight"></td>
			</tr>

			<tr>
				<td class="3rdRowHeight">${product.name}</td>
			</tr>

			<tr>
				<td class="5thRowHeight">${product.manufacturer}</td>
			</tr>
			<tr>
				<td id="price">$${product.price}</td>
			</tr>
			<tr>
				<td class="7thRowHeight">Weight ${product.weightInLbs} Lbs</td>
			</tr>

			<tr>

				<c:choose>

					<c:when test="${product.averageRating == 5}">
						<td class="4thRowHeight"><img src="img/5-star.png"
							class="stars" /></td>
					</c:when>

					<c:when test="${product.averageRating >= 4}">
						<td class="4thRowHeight"><img src="img/4-star.png"
							class="stars" /></td>
					</c:when>

					<c:when test="${product.averageRating >= 3}">
						<td class="4thRowHeight"><img src="img/3-star.png"
							class="stars" /></td>
					</c:when>

					<c:when test="${product.averageRating >= 2}">
						<td class="4thRowHeight"><img src="img/2-star.png"
							class="stars" /></td>
					</c:when>

					<c:otherwise>
						<td class="4thRowHeight"><img src="img/1-star.png"
							class="stars" /></td>
					</c:otherwise>

				</c:choose>

			</tr>

		</table>
		<div id="descriptionDiv">
		<P>Description: ${product.description}</P>
		</div>