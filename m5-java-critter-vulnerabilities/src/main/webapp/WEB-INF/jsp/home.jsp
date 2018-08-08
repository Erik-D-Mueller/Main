<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/header.jsp" />

<h2>Latest Messages</h2>
<ol class="message-list">


	<c:forEach items="${messages}" var="message">
		
		
		<li class="message">
		
		
			<c:url var="messageHref" value="/messages">
			<!--  The below "inserts" this parameter into the URL? 
			We sandwich it like this if we want to insert a parameter?
			-->
				<c:param name="userName" value="${message.fromUsername}" />
			</c:url>
		
			<!--  
			
			The c:outs below are to prevent someone from inserting browser side code as a 
			message or username value into the database, then when the website goes to printthat code getting executed the next time that record
			that username or message, it actually executes the code instead.  The c:out pretty
			much guarantees that it only displays the value, and doesn't execute it.
			
			-->
			<span class="username"><a href="${messageHref}">   <c:out value = "${message.fromUsername}"/> </a></span>
		
			<span class="message-text"> <c:out value = "${message.text}"> </c:out></span>
		
			<time class="timeago" datetime="${message.createTime}">${message.createTime}</time>
		
		<c:if test="${currentUser == message.fromUsername }">
			
			
		<!--  So the above sets it as a parameter, but here it inserts into the URL directly, but not as a parameter? -->
		<c:url var="deleteAction" value="/delete/${message.id}" />
		<li><a href="${deleteAction}">Delete message</a></li>
		</c:if>
		
	</c:forEach>


</ol>
		
<c:import url="/WEB-INF/jsp/footer.jsp" />
		