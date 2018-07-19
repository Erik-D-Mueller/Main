
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
</c:import>

<link rel="stylesheet" href="css/siteList.css" />

<c:forEach var="product" items="${productList}">

	<div id="mainDiv">

		<div id="imageDiv">
			<a href="/mvc-views-part2-exercises/productDetail?productId=${product.productId}"><img src="img/${product.imageName}" id="mainPicture" /></a>
		</div>

		<!--  the maindDiv and the detailsDiv somtimes directly overlap each other -->

		<div id="detailsDiv">

			<c:if test="${product.topSeller}">

				<p id="bestSeller">Best Seller!</p>

			</c:if>

			<p id="name">${product.name}</p>

			<p>${product.manufacturer}</p>

			<p id="price">$${product.price}</p>

			<p id="weight">Weight ${product.weightInLbs} Lbs</p>


			<c:choose>
				<c:when test="${product.averageRating == 5}">
					<img src="img/5-star.png" class="stars" />
				</c:when>

				<c:when test="${product.averageRating >= 4}">
					<img src="img/4-star.png" class="stars" />
				</c:when>

				<c:when test="${product.averageRating >= 3}">
					<img src="img/3-star.png" class="stars" />
				</c:when>

				<c:when test="${product.averageRating >= 2}">
					<img src="img/2-star.png" class="stars" />
				</c:when>

				<c:otherwise>
					<img src="img/1-star.png" class="stars below" />
				</c:otherwise>
			</c:choose>
		</div>

	</div>

	<hr>

</c:forEach>

</section>
</body>
</html>