<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <%
	response.sendError(404, "요청 페이지를 찾을 수 없음");
	%> --%>
	<%
	response.sendError(500, "실행 오류 발생");
	%>
</body>
</html>