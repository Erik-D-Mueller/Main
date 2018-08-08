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
		
			
			<span class="username"><a href="${messageHref}">${message.fromUsername}</a></span>
		
			<span class="message-text">${message.text}</span>
		
			<time class="timeago" datetime="${message.createTime}">${message.createTime}</time>
		
		<c:if test="${currentUser == message.fromUsername }">
			
			
		<!--  So the above sets it as a parameter, but here it inserts into the URL directly, but not as a parameter? -->
		<c:url var="deleteAction" value="/delete/${message.id}" />
		<li><a href="${deleteAction}">Delete message</a></li>
		</c:if>
		
	</c:forEach>


</ol>
		
<c:import url="/WEB-INF/jsp/footer.jsp" />
		