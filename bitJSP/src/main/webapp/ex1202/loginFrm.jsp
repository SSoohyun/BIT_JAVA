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
	request.setCharacterEncoding("utf-8");
	String cookie = "";
	Cookie[] cookies = request.getCookies();
	if (cookies != null && cookies.length > 0) {
		for (int i = 0; i < cookies.length; i++) {
			if (cookies[i].getName().equals("id")) {
				cookie = cookies[i].getValue();
			}
		}
	}
	%>

	관리자 로그인
	<form action="loginProc.jsp" method="post">
		아뒤: <input type="text" name="adminId" value="<%=cookie%>"> 
		<input type="checkbox" name="chkbox">아이디 기억<br /> 
		비번 : <input type="password" name="adminPwd"> 
		<input type="submit" value="전송">
	</form>
</body>
</html>