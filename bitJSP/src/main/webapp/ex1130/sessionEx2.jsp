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
	request.setCharacterEncoding("utf-8");
	String season = request.getParameter("season");
	String fruit = request.getParameter("fruit");
	
	String userId = (String) session.getAttribute("userId"); // Object타입으로 userId 받음 -> String으로 casting
	String sessionId = session.getId(); // 세션 ID
	int intervalTime = session.getMaxInactiveInterval();
	
	if (userId != null) {
		%>
		<h1>Session 예제</h1>
		<b><%=userId %></b>님이 좋아하는 계절과 과일은
		<b><%=season %></b>과
		<b><%=fruit %></b>입니다.
		<p>
		세션 ID: <%=sessionId %> <p>
		세션 유지 시간: <%=intervalTime %>초 <p>
	<% 
		// session.invalidate(); // 세션 무효 
		// out.println((String)session.getAttribute("userId"));
	} else {
		out.println("세션의 시간이 경과되었거나 다른 이유로 연결할 수 없음");
	}
	%>
</body>
</html>