<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- 백엔드입니당~ <br>
	<% request.setCharacterEncoding("UTF-8"); %> <!-- 한글 인코딩 -->
	아이디: <%=request.getParameter("userId")%>
	비밀번호: <%=request.getParameter("userPwd")%> --%>
	
	<%
	if (request.getMethod().equals("POST")) {
		request.setCharacterEncoding("UTF-8");
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		
		/* // 아이디와 비밀번호 확인
		if (userId.equals("admin") && userPwd.equals("admin")) {
			response.sendRedirect("loginSuccess.jsp");
		} else {
			response.sendRedirect("loginFail.jsp");
		} */
	
		// 유효성 처리
		if (userId.isEmpty()||userPwd.isEmpty()) {
			RequestDispatcher rd = request.getRequestDispatcher("loginFrm.jsp"); // 원 페이지로 돌아감
			rd.forward(request, response);
			return;
		}
		
		// 로그인 처리
		if (session.isNew() || session.getAttribute("userId") == null) { // 세션이 처음인지 기억된 id가 있는지
			session.setAttribute("userId", userId);
			out.println("로그인 완료되었음");
		} else {
			out.println("이미 로그인 상태임");
		}
		%>
		아이디 : <%=userId %> / 비밀번호 : <%=userPwd %>
	<%
	response.sendRedirect("loginFrm.jsp");
	} else if (request.getMethod().equals("GET")) {
		if (session != null || session.getAttribute("userId") != null) {
			session.invalidate();
			response.sendRedirect("loginFrm.jsp");
			out.print("로그아웃 작업이 완료됨");
		} else {
			out.print("현재 로그인 상태가 아님");
		}
	}
	%>
	
</body>
</html>