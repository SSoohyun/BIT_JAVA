<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<%!String background = null;%>
	<%
	String userName = request.getParameter("userName");
	String color = request.getParameter("color");

	if (color.equals("붉은색")) {
		background = "red";
	} else if (color.equals("파란색")) {
		background = "blue";
	} else {
		background = "white";
	}
	%>
</head>
<body bgcolor=<%=background%>>
	<h1>If-else Example</h1>
	<p>
	<%
	request.setCharacterEncoding("utf-8");
	%>

	<strong><%=userName%></strong>님이 좋아하는 색깔은
	<strong><%=color%></strong>입니다.

</body>
</html>