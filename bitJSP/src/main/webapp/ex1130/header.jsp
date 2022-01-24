<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	h1{
		font-weight: bold;
		background-color: yellow;
	}
</style>

</head>
<body>
	
	<h1>Header임!!</h1>
	<%!
		int count = 0;
	%>
	<br>
	<%
	out.println(++count + "번째 방문입니다");
	%>
</body>
</html>