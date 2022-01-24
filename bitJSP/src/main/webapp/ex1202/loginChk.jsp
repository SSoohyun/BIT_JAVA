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
	if (session != null && session.getAttribute("userId") != null) { // 세션이 처음인지 기억된 id가 있는지
		out.println("아이디 " + session.getAttribute("userId") + "으로 로그인한 상태"); %>
		<br><a href="logout.jsp">로그아웃</a>
	<% } else {
		out.println("로그인 상태가 아님");
	} %>
</body>
</html>