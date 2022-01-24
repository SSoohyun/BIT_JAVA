<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.global.beans.MemberDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	String userId = request.getParameter("userId");
	MemberDAO dao = MemberDAO.getInstance();
	if (dao.selectMember(userId) == null) {
		response.sendRedirect("searchFrm.jsp");
	}
	
	request.setAttribute("member", dao.selectMember(userId));
	%>
	
	<h1>회원 정보 조회</h1>
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
		<tr>
			<td>${member.userId}</td>
			<td>${member.userPwd}</td>
			<td>${member.userName}</td>
			<td>${member.phoneNo}</td>
			<td>${member.address}</td>
			<td>${member.email}</td>
			<td>${member.regDate}</td>
		</tr>
	</table>
</body>
</html>