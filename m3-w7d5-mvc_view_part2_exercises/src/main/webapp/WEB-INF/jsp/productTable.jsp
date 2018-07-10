<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width" />
    <title>Product Table View</title>
    <link rel="stylesheet" href="css/siteTable.css" />
</head>
<body>
    <header>
        <h1>MVC Exercises - Views Part 2: Models</h1>        
    </header>
    <nav>
        <ul>
            <li><a href="#">Link 1</a></li>
            <li><a href="#">Link 2</a></li>
        </ul>
        
    </nav>
    <section id="main-content">

<div class="titleDiv">

       <table class="title-table">
				<tr>
					<td><img  src="img/toy-balls.jpg" class="mainPicture width" /></td>
				</tr>
				
				<tr>
					<td><span id="bestSellerHolder" class="width"></span></td>
				</tr>
				<tr>
					<td class="width">Name</td>
				</tr>
				<tr>
					<td class="width">Rating</td>
				</tr>
				<tr>
					<td class="width">Mfr</td>
				</tr>
				<tr>
					<td class="width">Price</td>
				</tr>
				<tr>
					<td class="width">wt. (in lbs)</td>
				</tr>
			</table>
       </div>
       
       
      <div class="productTablesDiv">
      
       <c:forEach var="product" items="${productList}">

				<table class="productTable">
				<tr>
					<td><img  src="img/${product.imageName}" class="mainPicture width" /></td>
				</tr>
				<tr>
					<td class="width"></td>
				</tr>	
				
				
				<tr>
					<td class="width">${product.name}</td>
				</tr>			
					
       			<tr>
       			
					<c:choose>
				
							<c:when test="${product.averageRating == 5}">
								<td bgcolor="D3D3D3"><img src="img/5-star.png" class="stars width"/></td>
							</c:when>

							<c:when test="${product.averageRating >= 4}">
								<td bgcolor="D3D3D3"><img src="img/4-star.png" class="stars width"/></td>
							</c:when>

							<c:when test="${product.averageRating >= 3}">
								<td bgcolor="D3D3D3"><img src="img/3-star.png" class="stars width"/></td>
							</c:when>

							<c:when test="${product.averageRating >= 2}">
								<td bgcolor="D3D3D3"><img src="img/2-star.png" class="stars width"/></td>
							</c:when>

							<c:otherwise>
								<td bgcolor="D3D3D3"><img src="img/1-star.png" class="stars width"/></td>
							</c:otherwise>
						
						</c:choose>
				
						
				</tr>
				<tr>		
					<td>${product.manufacturer}</td>
				</tr>	
				<tr>			
					<td>$${product.price}</td>
				</tr>	
       			<tr>			
					<td>Weight ${product.weightInLbs} lbs</td>
				</tr>
       
     
				</table>
			</c:forEach>
       </div>
              
    </section>
</body>
</html>