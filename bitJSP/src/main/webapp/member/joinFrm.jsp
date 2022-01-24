<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table{
		border-collapse: collapse;
		border-color: skyblue;
	}
	
	td{
		text-align: center;
	}
	
</style>
</head>
<body>
	<form action="joinProc.do" method="post">
		<table border="1">
			<tr>
				<th>아이디</th>
				<td><input type="text" name="userId"></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="userPwd"></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="userName"></td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td><input type="text" name="phoneNo"></td>
			</tr>
			<tr>
				<th>주소</th>
				<td><input type="text" name="address"></td>
			</tr>
			<tr>
				<th>이메일</th>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="회원가입"></td>
			</tr>
		</table>
	</form>
</body>
</html>