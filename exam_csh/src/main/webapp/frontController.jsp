<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="<%=request.getContextPath() %>/openAccountFrm.jsp">계좌 개설</a><hr>
	<a href="<%=request.getContextPath() %>/selectFrm.jsp">계좌 조회</a><hr>
	<a href="<%=request.getContextPath() %>/accountJob.jsp">입금/출금/송금</a><hr>
	<a href="<%=request.getContextPath() %>/selectAccountAll.action">모든 계좌 보기</a><hr>
</body>
</html>