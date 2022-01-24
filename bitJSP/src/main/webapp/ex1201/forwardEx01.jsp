<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%String p = request.getParameter("p"); %>
	<jsp:forward page="<%=p %>"></jsp:forward> <!-- 실행 후 주소창에 p=hello.jsp 입력(get 방식) -->
</body>
</html>