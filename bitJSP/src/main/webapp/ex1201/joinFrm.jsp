<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	td{
		text-align: center;
	}
</style>
</head>
<body>
	<%request.setCharacterEncoding("utf-8"); %>
	<form method="get" action="joinProc.jsp">
		<table border="1">
			<tr>
				<td colspan="4">회원 가입 정보</td>
			</tr>
			<tr>
				<td>아이디</td>		
				<td><input type="text" name="userId"></td>
				<td>비밀번호</td>
				<td><input type="password" name="userPwd"></td>
			</tr>
			<tr>
				<td>이름</td>		
				<td><input type="text" name="name"></td>
				<td>이메일</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td colspan="4"><input type="submit" value="회원가입"></td>
		</table>
	</form>
</body>
</html>