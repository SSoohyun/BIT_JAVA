<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>계좌 조회</h1>
	
	<table border="1">
		<tr>
			<th>Account ID</th>
			<th>Account Password</th>
			<th>User Name</th>
			<th>Balance</th>
		</tr>
		
		<tr>
			<td>${account.accountId}</td>
			<td>${account.accountPwd}</td>
			<td>${account.userName}</td>
			<td>${account.balance}</td>
		</tr>
		<tr>
			<td colspan="4"><a href="frontController.jsp">&lt;&lt;이전</a></td>
		</tr>
	</table>
</body>
</html>