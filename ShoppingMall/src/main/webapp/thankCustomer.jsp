<%@page import="java.net.URLDecoder"%>
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
	request.setCharacterEncoding("utf-8");
	String shippingCartId = "";
	String shippingName = "";
	String shippingDate = "";
	String shippingCountry = "";
	String shippingZipcode = "";
	String shippingAddress = "";
	
	Cookie[] cookies = request.getCookies();
	if (cookies != null) {
		for (Cookie cookie : cookies) {
			Cookie thisCookie = cookie;
			String name = thisCookie.getName(); // 쿠키 이름
			if (name.equals("shippingCartId")) {
				shippingCartId = URLDecoder.decode(thisCookie.getValue(), "UTF-8");
			} else if (name.equals("shippingName")) {
				shippingName = URLDecoder.decode(thisCookie.getValue(), "UTF-8");
			} else if (name.equals("shippingDate")) {
				shippingDate = URLDecoder.decode(thisCookie.getValue(), "UTF-8");
			} else if (name.equals("shippingCountry")) {
				shippingCountry = URLDecoder.decode(thisCookie.getValue(), "UTF-8");
			} else if (name.equals("shippingZipcode")) {
				shippingZipcode = URLDecoder.decode(thisCookie.getValue(), "UTF-8");
			} else if (name.equals("shippingAddress")) {
				shippingAddress = URLDecoder.decode(thisCookie.getValue(), "UTF-8");
			}
		}	
	}
	%>
	
	<jsp:include page="/menu.jsp"></jsp:include>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">주문 완료</h1>
		</div>
	</div>
	<div class="container">
		<h2 class="alert alert-danger">주문해주셔서 감사합니다</h2>
		<p>주문은 <%=shippingDate %>에 배송될 예정입니다.
		<p>주문번호: <%=shippingCartId %>
		<p>이름: <%=shippingName %>
	</div>
	<div class="container">
		<p><a href="ProductList" class="btn btn-secondary">&laquo;상품 목록</a>
	</div>
	
	<%
	// 카트 리스트 제거
	session.removeAttribute("cartList");
	
	// 쿠키 제거
	for (Cookie cookie : cookies) {
		if(cookie.getName().startsWith("shipping")) {
			cookie.setMaxAge(0);
			response.addCookie(cookie);			
		}
	}
	%>
</body>
</html>