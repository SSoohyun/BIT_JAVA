<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action=loginProc.do method="post">
		로그인<br>
		아이디: <input type="text" name="userId"><br>
		비밀번호: <input type="password" name="userPwd">
		<input type="submit" value="로그인">
	</form>
</body>
</html>