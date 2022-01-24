<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	// 주문 과정에서 생긴 쿠키 삭제
	Cookie[] cookies = request.getCookies();
	if (cookies != null) {
		for (Cookie cookie : cookies) {
			if(cookie.getName().startsWith("shipping")) {
				cookie.setMaxAge(0);
				response.addCookie(cookie);			
			}
		}
	}
	%>
	<jsp:include page="/menu.jsp"></jsp:include>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">주문 취소</h1>
		</div>
	</div>
	<div class="container">
		<div class="col" align="center">
			<div class="alert alert-danger" role="alert">
				<h3>주문이 취소되었습니다</h3>
			</div>
		</div>
		<a href="ProductList" class="btn btn-secondary">&laquo; 상품 목록</a>
	</div>
</body>
</html>