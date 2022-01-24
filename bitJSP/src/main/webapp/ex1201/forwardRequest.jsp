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
	String bt = request.getParameter("bloodType");
	bt += ".jsp";
	%>
	
	<jsp:forward page="<%=bt %>">
		<jsp:param name="name" value='<%=java.net.URLEncoder.encode("코난") %>'/>
	</jsp:forward>
</body>
</html>