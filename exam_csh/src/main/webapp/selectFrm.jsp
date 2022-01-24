<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="selectAccount.action" method="post">
		<h1>계좌 조회</h1>
		계좌번호: <input type="text" name="accountId"><br>
		비밀번호: <input type="password" name="accountPwd"><br>
		<input type="submit" value="조회하기"><br>
	</form>
</body>
</html>