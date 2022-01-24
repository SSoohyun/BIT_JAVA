<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ page errorPage="error/div_error.jsp" %> --%> <!-- 에러 처리 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 입력값을 처리 -->
	<%
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	%>
	<%=num1 %> / <%=num2 %> = <%=(double) num1 / (double) num2 %>
	<br>
	<a href="div.html">back</a>
</body>
</html>