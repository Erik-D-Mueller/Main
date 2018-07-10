<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<!DOCTYPE html>

<html>
<head>
<meta name="viewport" content="width=device-width" />
<title>Product List View</title>
<link rel="stylesheet" href="css/siteList1.css" />
</head>
<body>
	<header>
		<h1>MVC Exercises - Views Part 2: Models</h1>
	</header>
	<nav>
		<ul>
			<li><a href="#">List Layout</a></li>
			<li><a href="#">Tile Layout</a></li>
			<li><a href="#">Table Layout</a></li>
		</ul>

	</nav>
	<section id="main-content">

		<h3>Toy Department</h3>

        <table>

			<c:forEach var="product" items="${productList}">

				<tr>

					<td>
					     <img src="img/${product.imageName}" id="mainPicture" />
					</td>
					
					
					
					<td>
					   <table>
						<tr>
						   <td>
							<c:if test="${product.topSeller}">

								<p id="bestSeller">Best Seller!</p>

							</c:if>
							</td>
						</tr>

						<tr>
							<td>${product.manufacturer}</td>
						</tr>	
						<tr>
							<td><p id="price">$${product.price}</p></td>
						</tr>
							<!--  one of the dollar signs actually displays -->
							<!--   <p id="weight"> Weight ${product.weightInLbs} lbs </p>-->
						<tr>
						       <td>
									<c:choose>
										<c:when test="${product.averageRating == 5}">
											<img src="img/5-star.png" class="stars below" />
										</c:when>

										<c:when test="${product.averageRating >= 4}">
											<img src="img/4-star.png" class="stars below" />
										</c:when>

										<c:when test="${product.averageRating >= 3}">
											<img src="img/3-star.png" class="stars below" />
										</c:when>

										<c:when test="${product.averageRating >= 2}">
											<img src="img/2-star.png" class="stars below" />
										</c:when>

										<c:otherwise>
											<img src="img/1-star.png" class="stars below" />
										</c:otherwise>
									</c:choose>
						     </td>
					   </tr>
			          </table>
		
				   </td>

				</tr>
				<tr>
				  <td colspan="2"><hr></td>
			    </tr>
	     
			</c:forEach>

            </table>


	</section>
</body>
</html>