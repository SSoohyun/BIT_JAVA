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
	session.setAttribute("userId", "rose");
	session.setAttribute("userPwd", "1234");
	out.println(session.getAttribute("userId"));
	out.println(session.getAttribute("userPwd") + "<br>");
	session.removeAttribute("userPwd"); // 세션 삭제, invalidate()는 모든 세션 삭제
	out.println(session.getAttribute("userId"));
	out.println(session.getAttribute("userPwd"));
	%>
</body>
</html>