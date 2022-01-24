<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- <style>
	.msg{
		background-color: pink;
		border-radius: 5px;
		height: 50px;
		line-height: 50px;
	}
</style> -->
</head>
<body>
	<jsp:include page="/menu.jsp"></jsp:include>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">회원 정보</h1>
		</div>
	</div>
	<div class="container">
		<div class="col" align="center">
		<%-- <%
		request.setCharacterEncoding("utf-8");
		String msg = (String) request.getAttribute("msg");
		%> --%>
		<div class="alert alert-danger" role="alert">
			<h3>${msg}</h3>
		</div>
		</div>
	</div>
</body>
</html>