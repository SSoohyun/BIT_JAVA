<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>모든 계좌 조회</h1>
	
	<table border="1">
		<tr>
			<th>Account ID</th>
			<th>Account Password</th>
			<th>User Name</th>
			<th>Balance</th>
		</tr>
		
		<c:forEach var="ac" items="${account}">
			<tr>
				<td>${ac.accountId}</td>
				<td>${ac.accountPwd}</td>
				<td>${ac.userName}</td>
				<td>${ac.balance}</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="4"><a href="frontController.jsp">&lt;&lt;이전</a></td>
		</tr>
	</table>
</body>
</html>