<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="bcProc.jsp" method="get">
		<h1>If-else Example</h1>
		이름: <input type="text" name="userName"> <p> 
		좋아하는 색깔: 
		<select name="color">
			<option value="붉은색">붉은색</option>
			<option value="파란색">파란색</option>
			<option value="흰색">흰색</option>
		</select> 
		<p>
		<input type="submit" value="보내기">
	</form>
</body>
</html>