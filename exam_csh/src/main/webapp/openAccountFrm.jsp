<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="openAccount.action" method="post">
		<h1>계좌 개설</h1>
		계좌번호: <input type="text" name="accountId"><br>
		비밀번호: <input type="password" name="accountPwd"><br>
		예금주: <input type="text" name="userName"><br>
		잔액: <input type="text" name="balance"><br>
		<input type="submit" value="계좌개설"><br>
	</form>
</body>
</html>