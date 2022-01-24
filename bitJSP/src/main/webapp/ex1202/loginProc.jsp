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
	String id = request.getParameter("adminId");
	String pwd = request.getParameter("adminPwd");
	String chk = request.getParameter("chkbox");
	Cookie cookie = new Cookie("id", id);
	if (chk != null) {
		response.addCookie(cookie);
	} else {
		cookie.setMaxAge(0);
		response.addCookie(cookie);
	}

	if (id.equals(application.getInitParameter("adminId")) && pwd.equals(application.getInitParameter("adminPwd"))) {
	%>
	로그인에 성공했음
	<br>
	<a href="loginFrm.jsp">로그인 폼으로</a>
	<%
	} else if (pwd != application.getInitParameter("adminPwd")) {
	out.println("<script>alert('비밀번호 불일치');</script>");
	}
	%>

</body>
</html>