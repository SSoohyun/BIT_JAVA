<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>---세션 유효 시간 변경 전---</h3>
	<%
	int time = session.getMaxInactiveInterval()/60;
	out.println("세션 유효 시간: " + time + "분<br>");
	session.setMaxInactiveInterval(60 * 60); // 1시간
	%>
	
	<h3>---세션 유효 시간 변경 후---</h3>
	<%
	time = session.getMaxInactiveInterval()/60;
	out.println("세션 유효 시간: " + time + "분<br>");
	%>
	
</body>
</html>