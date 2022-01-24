<%@page import="java.util.ArrayList"%>
<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page import="com.conan.vo.Products" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String cartId = session.getId(); // 세션 아이디
	String shippingCartId = "";
	String shippingName = "";
	String shippingDate = "";
	String shippingCountry = "";
	String shippingZipcode = "";
	String shippingAddress = "";
	
	Cookie[] cookies = request.getCookies(); // 쿠키 받아오기
	if (cookies != null) {
		for (int i = 0; i < cookies.length; i++) {
			Cookie thisCookie = cookies[i];
			String name = thisCookie.getName(); // 쿠키 이름 받아와서 이름으로 찾기
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
			<h1 class="display-3">주문</h1>
		</div>
	</div>
	<div class="container col-8 alert alert-info">
		<div class="text-center">
			<h1>영수증</h1>
		</div>
		<div class="row justify-content-between">
			<div class="col-4" align="left">
				<strong>배송주소</strong>
				<br>이름: <%=shippingName %>
				<br>우편번호: <%=shippingZipcode %>
				<br>주소: <%=shippingAddress %>(<%=shippingCountry %>)<br>
			</div>
			<div class="col-4" align="left">
				<p><em>배송일: <%=shippingDate %></em>
			</div>
		</div>
			
		<div>
			<table class="table table-hover">
				<tr>
					<th class="text-center">상품</th>
					<th class="text-center">#</th>
					<th class="text-center">가격</th>
					<th class="text-center">소계</th>
				</tr>
				<%
				ArrayList<Products> p = (ArrayList<Products>) session.getAttribute("cartList");
				%>
				<c:set var="p" value="<%=p%>"/>
				<c:set var="sum" value="0"/>
				<c:forEach var="product" items="${p}">
					<tr>
						<td class="text-center"><em>${product.proName}</em></td>
						<td class="text-center"><em>${product.quantity}</em></td>
						<td class="text-center"><em><fmt:formatNumber value="${product.unitPrice}" pattern="#,###"/> 원</em></td>
						<c:set var="total" value="${product.quantity*product.unitPrice}"></c:set>
						<c:set var="sum" value="${sum+total}"></c:set>
						<td class="text-center"><em><fmt:formatNumber value="${total}" pattern="#,###"/> 원</em></td>
					</tr>
				</c:forEach>
				<tr>
					<td></td>
					<td></td>
					<td class="text-right"><strong>총액: </strong></td>
					<td class="text-center text-danger"><strong><fmt:formatNumber value="${sum}" pattern="#,###"/> 원</strong></td>
				</tr>			
			</table>
		</div>
		<a href="shippingInfo.jsp?cartId=<%=shippingCartId %>" class="btn btn-secondary" role="button">이전</a>
		<a href="thankCustomer.jsp" class="btn btn-success" role="button">주문 완료</a>
		<a href="checkoutCancelled.jsp" class="btn btn-secondary" role="button">취소</a>	
	</div>
</body>
</html>