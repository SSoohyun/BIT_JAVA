<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, javax.sql.*, javax.naming.*" %>
<%@ page import="org.icarus.beans.Members" %>
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
	<%
	// 1. JNDI 서버 객체 생성
	InitialContext ic = new InitialContext();
	
	// 2. lookup()
	DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/myoracle");
	
	// 3. Connection()
	Connection conn = ds.getConnection();
	PreparedStatement pstmt = conn.prepareStatement("select userid, userpwd, username from members where userid = ? and userpwd = ?");
	
	// 사용자 아이디, 비번
	String userId = request.getParameter("userId");
	String userPwd = request.getParameter("userPwd");
	pstmt.setString(1, userId);
	pstmt.setString(2, userPwd);
	ResultSet rs = pstmt.executeQuery();
		
	if (rs.next() == false) {
		response.sendRedirect("loginFrm.jsp");
	}
	
	// 반납
	rs.close(); pstmt.close(); conn.close();
	%>
	
	<%
	if (session.isNew() || session.getAttribute("userId") == null) {
		session.setAttribute("userId", userId);
		response.sendRedirect("loginResult.jsp");		
	} else { %>
		<script>
			alert('이미 로그인 했습니다.')
		</script>
	<% } %>
	
</body>
</html>