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
	if (session != null && session.getAttribute("userId") != null) {
		session.invalidate();
		out.println("로그아웃 완료."); %>
		<br><a href="loginFrm2.jsp">로그인 화면으로</a>
	<% } else {
		out.print("현재 로그인 상태가 아님");
	} %>
</body>
</html>