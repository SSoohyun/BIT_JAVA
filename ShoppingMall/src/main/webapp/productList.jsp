<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 목록</h1>
		</div>
	</div>
	<div class="container">
		<div class="row" align="center">
			<c:forEach var="item" items="${pl}">
				<div class="col-md-4">
					<p><img src="<%=request.getContextPath()%>/upload/${item.fileName}" alt="해당 이미지 없음" width="300"></p>
					<h3>${item.proName}</h3>
					<p>${item.description}</p>
					<p>${item.unitPrice}원</p>
					<p><a href="ProductDetail?proId=${item.proId}" class="btn btn-secondary" role="button">상세정보 &raquo;</a>
				</div>
			</c:forEach>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>