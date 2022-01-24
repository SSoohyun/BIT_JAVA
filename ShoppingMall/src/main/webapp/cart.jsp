<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@page import="com.conan.vo.Products" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%String cartId = session.getId(); %>
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">장바구니</h1>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<table width="100%">
				<tr>
					<td align="left"><a href="DeleteCart?cartId=<%=cartId %>" class="btn btn-danger">삭제하기</a></td>
					<td align="right"><a href="shippingInfo.jsp?cartId=<%=cartId %>" class="btn btn-success">주문하기</a></td>
				</tr>
			</table>
		</div>
		<div style="padding-top: 50px">
			<table class="table table-hover">
				<tr>
					<th>상품</th>
					<th>가격</th>
					<th>수량</th>
					<th>소계</th>
					<th>비고</th>
				</tr>
				
				<!-- c:set -->
				<%
				ArrayList<Products> p = (ArrayList<Products>) session.getAttribute("cartList");
				%>
				<c:set var="p" value="<%=p%>"/>
				<c:set var="sum" value="0"/>
				<c:forEach var="product" items="${p}">
					<tr>
						<td>${product.proId}-${product.proName}</td>
						<td><fmt:formatNumber value="${product.unitPrice}" pattern="#,###"/> 원</td>
						<td>${product.quantity}</td>
						<c:set var="total" value="${product.unitPrice*product.quantity}"/>
						<c:set var="sum" value="${sum+total}"/>
						<td><fmt:formatNumber value="${total}" pattern="#,###"/> 원</td>
						<td><a href="RemoveCart?proId=${product.proId}" class="badge badge-danger">삭제</a></td>
					</tr>
				</c:forEach>
				<tr>
					<th></th>
					<th></th>
					<th>총액</th>
					<th><fmt:formatNumber value="${sum}" pattern="#,###"/> 원</th>
					<th></th>
				</tr>			
				
				
				<!-- for문 -->
				<%-- <%
				int sum = 0;
				int total = 0;
				ArrayList<Products> p = (ArrayList<Products>) session.getAttribute("cartList");
				
				if (p != null) {
					for (Products product : p) {
						total = product.getUnitPrice() * product.getQuantity();
					%>
				 	<tr>
						<td><%=product.getProId() %>-<%=product.getProName() %></td>
						<td><%=product.getUnitPrice() %></td>
						<td><%=product.getQuantity() %></td>
						<td><%=total %></td>
						<td><a href="removeCart.jsp?proId=${product.proId}" class="badge badge-danger">삭제</a></td>
					</tr>
					<% 	
						sum += total;
					} 
				} %>
				<tr>
					<th></th>
					<th></th>
					<th>총액</th>
					<th><%=sum %></th>
					<th></th>
				</tr>			 --%>
			
			
			
			</table>
			<a href="ProductList" class="btn btn-secondary">&laquo; 쇼핑 계속하기</a>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>