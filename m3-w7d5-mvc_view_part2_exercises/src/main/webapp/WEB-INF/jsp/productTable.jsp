
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
</c:import>
<link rel="stylesheet" href="css/siteTable.css" />

<div id="bigBigDiv">

	<div id="titleDiv">
	<table id="title-table">
		<tr>
			<td></td>
		</tr>

		<tr>
			<td></td>
		</tr>
		<tr>
			<td>Name</td>
		</tr>
		<tr>
			<td>Rating</td>
		</tr>
		<tr>
			<td>Mfr</td>
		</tr>
		<tr>
			<td>Price</td>
		</tr>
		<tr>
			<td>wt. (in lbs)</td>
		</tr>
	</table>
</div>

<div id="bigDiv">
	<c:forEach var="product" items="${productList}">

		<table id="productTable">
			<tr>
				<td class="1stRowHeight"><div id="imageDiv">
						<a href="/mvc-views-part2-exercises/productDetail?productId=${product.productId}"><img src="img/${product.imageName}" id="mainPicture" /></a>
					</div></td>
			</tr>
			<tr>
				<td class="2ndRowHeight"></td>
			</tr>


			<tr>
				<td class="3rdRowHeight">${product.name}</td>
			</tr>

			<tr>

				<c:choose>

					<c:when test="${product.averageRating == 5}">
						<td class="4thRowHeight" bgcolor="D3D3D3"><img
							src="img/5-star.png" class="stars" /></td>
					</c:when>

					<c:when test="${product.averageRating >= 4}">
						<td class="4thRowHeight" bgcolor="D3D3D3"><img
							src="img/4-star.png" class="stars" /></td>
					</c:when>

					<c:when test="${product.averageRating >= 3}">
						<td class="4thRowHeight" bgcolor="D3D3D3"><img
							src="img/3-star.png" class="stars" /></td>
					</c:when>

					<c:when test="${product.averageRating >= 2}">
						<td class="4thRowHeight" bgcolor="D3D3D3"><img
							src="img/2-star.png" class="stars" /></td>
					</c:when>

					<c:otherwise>
						<td class="4thRowHeight" bgcolor="D3D3D3"><img
							src="img/1-star.png" class="stars" /></td>
					</c:otherwise>

				</c:choose>


			</tr>
			<tr>
				<td class="5thRowHeight">${product.manufacturer}</td>
			</tr>
			<tr>
				<td class="6thRowHeight">$${product.price}</td>
			</tr>
			<tr>
				<td class="7thRowHeight">${product.weightInLbs}</td>
			</tr>


		</table>
	</c:forEach>
	</div>
</div>

</section>
</body>
</html>