<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Bebas+Neue&family=Noto+Serif+KR:wght@300&display=swap" rel="stylesheet">
<style type="text/css">
*{
	/* font-family: font-family: 'Bebas Neue', cursive; */
	font-family: 'Noto Serif KR', serif;
}

</style>
</head>
<body>
	<nav class="navbar navbar-expand navbar-dark bg-dark">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="/ShoppingMall/index.jsp">HOME</a>
			</div>
			
			<c:set var="contextPath" value="<%=request.getContextPath() %>"></c:set>
			
			<div>
				<ul class="navbar-nav mr-auto">
					<% 
					/* String userId = (String) session.getAttribute("userId"); */
					%>
					<c:set var="userId" value="<%=(String)session.getAttribute(\"userId\")%>"/>
					<%-- <c:set var="userId" value="${userId}"/> --%> 
					<c:choose>
						<c:when test="${empty userId}">
							<li class="nav-item"><a class="nav-link" href="${contextPath}/member/loginFrm.jsp">로그인</a></li>
							<li class="nav-item"><a class="nav-link" href="${contextPath}/member/joinFrm.jsp">회원가입</a></li>
						</c:when>
						<c:otherwise>
						<li class="nav-item"><a class="nav-link" href="#">[<c:out value="${userId}"></c:out>]님></a></li>
							<li class="nav-item"><a class="nav-link" href="${contextPath}/member/logoutProc.jsp">로그아웃</a></li>
							 <form name="updateMem" action="updateFrm.jsp">
                        		<li class="nav-item"><a class="nav-link" href="#" onclick="updateMember()">회원수정</a></li>
                        	</form>
						</c:otherwise>
					</c:choose>	
				</ul>
			</div>
			
			<div>
				<ul class="navbar-nav mr-auto">
					<li class="nav-item"><a class="nav-link" href="${contextPath}/ProductList">상품목록</a></li>
					<li class="nav-item"><a class="nav-link" href="${contextPath}/addProduct.jsp">상품등록</a></li>
					<li class="nav-item"><a class="nav-link" href="${contextPath}/deleteProduct.jsp">상품삭제</a></li>
					<li class="nav-item"><a class="nav-link" href="${contextPath}/board/listProc.do">게시판</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<%-- <jsp:include page="index.jsp"></jsp:include>
	<jsp:include page="footer.jsp"></jsp:include> --%>
	
	
	<script type="text/javascript">
    	function updateMember(){
	if(confirm("회원 정보를 수정하시겠습니까?")){
		document.updateMem.submit();
	} else {
		document.updateMem.reset();}
   }
   </script>
	
</body>
</html>