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
	String userId = request.getParameter("userId");
	String userPwd = request.getParameter("userPwd");
	session.setAttribute("userId", "conan"); // userId라는 이름으로 userId 보냄
	session.setMaxInactiveInterval(60 * 3);	// 60초 지나면 값 무효
	%>
	<h1>Session 예제</h1>
	<form action="sessionEx2.jsp" method="post">
	1. 가장 좋아하는 계절은? <br>
	<input type="radio" name="season" value="봄">봄
	<input type="radio" name="season" value="여름">여름
	<input type="radio" name="season" value="가을">가을
	<input type="radio" name="season" value="겨울">겨울
	<p>
	2. 가장 좋아하는 과일은? <br>
	<input type="radio" name="fruit" value="수박">수박
	<input type="radio" name="fruit" value="사과">사과
	<input type="radio" name="fruit" value="복숭아">복숭아
	<input type="radio" name="fruit" value="딸기">딸기
	<p>
	<input type="submit" value="결과보기">
	</form>
</body>
</html>