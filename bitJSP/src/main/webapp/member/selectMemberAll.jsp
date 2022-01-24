<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="x" uri="http://java.sun.com/jstl/xml"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">	
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>전화번호</th>
			<th>주소</th>
			<th>이메일</th>
			<th>가입일</th>
		</tr>
		<c:forEach var="item" items="${member}">
			<tr>
				<td>${item.userId}</td>
				<td>${item.userPwd}</td>
				<td>${item.userName}</td>
				<td>${item.phoneNo}</td>
				<td>${item.address}</td>
				<td>${item.email}</td>
				<td>${item.regDate}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>