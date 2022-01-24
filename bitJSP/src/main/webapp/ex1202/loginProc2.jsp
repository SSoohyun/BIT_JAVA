<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	// 관리자
	String adminId = application.getInitParameter("adminId");
	String adminPwd = application.getInitParameter("adminPwd");
	
	String userId = request.getParameter("adminId");
	String userPwd = request.getParameter("adminPwd");
	
	// 아이디와 비밀번호 확인
	if (userId.equals(adminId) && userPwd.equals(adminPwd)) {
		if (session.isNew() || session.getAttribute("userId") == null) {
			session.setAttribute("userId", userId);
			%>로그인에 성공했음<br>
			<a href="loginChk.jsp">로그인 정보 확인</a>
	<% } %>
	<%} else { %>
		<!-- <script>
			alert('비밀번호 불일치');
		</script> -->
		<% response.sendRedirect("loginFrm2.jsp");
	} %>
</body>
</html>