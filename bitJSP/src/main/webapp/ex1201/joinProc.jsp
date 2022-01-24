<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="member" scope="application" class="org.global.beans.Members">
	<jsp:setProperty name="member" property="userId" param="userId"/>
	<jsp:setProperty name="member" property="userPwd" param="userPwd"/>
	<jsp:setProperty name="member" property="name" param="name"/>
	<jsp:setProperty name="member" property="email" param="email"/>
	
	
	<%request.setCharacterEncoding("utf-8"); %>
	<table border="1">
		<tr>
			<tr>
				<td>아이디</td>		
				<td><jsp:getProperty name="member" property="userId"/></td>
				<td>비밀번호</td>
				<td><jsp:getProperty name="member" property="userPwd"/></td>
			</tr>
			<tr>
				<td>이름</td>		
				<td><jsp:getProperty name="member" property="name"/></td>
				<td>이메일</td>
				<td><jsp:getProperty name="member" property="email"/></td>
			</tr>
	</table>
	
	</jsp:useBean>
</body>
</html>