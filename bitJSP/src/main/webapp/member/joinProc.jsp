<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="org.icarus.beans.Members" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
	String userId = request.getParameter("userId"); 
	String userPwd = request.getParameter("userPwd");
	String userName = request.getParameter("userName");
	String phoneNo = request.getParameter("phoneNo");
	String address = request.getParameter("address");
	String email = request.getParameter("email");
	
	Members member = new Members(userId, userPwd, userName, phoneNo, address, email);
	request.setAttribute("mem", member);
	%>
	
	<%-- 사용자가 입력한 데이터<br>
	<table border="1">
		<tr>
			<td>아이디</td>
			<td>${mem.userId}</td>
			<td>비밀번호</td>
			<td>${mem.userPwd}</td>
		</tr>
		<tr>
			<td>이름</td>
			<td>${mem.userName}</td>
			<td>전화번호</td>
			<td>${mem.phoneNo}</td>
		</tr>
		<tr>
			<td>주소</td>
			<td>${mem.address}</td>
			<td>이메일</td>
			<td>${mem.email}</td>
		</tr>
	</table>
	<hr> --%>
	
	<%
	String url = "jdbc:mysql://localhost:3306/scottdb?useSSL=false";
	String dbId = "scott";
	String dbPwd = "tiger";
	Connection conn = null;
	String sql = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url, dbId, dbPwd);
		
		// 데이터 저장
		sql = "insert into members(userid, userpwd, username, phoneno, address, email) values(?, ?, ?, ?, ?, ?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userId);
		pstmt.setString(2, userPwd);
		pstmt.setString(3, userName);
		pstmt.setString(4, phoneNo);
		pstmt.setString(5, address);
		pstmt.setString(6, email);
		int i = pstmt.executeUpdate();
		
		if (i > 0) {
			response.sendRedirect("joinResult.jsp");
		} else {
			response.sendRedirect("joinFrm.jsp");
			/* Response.Write("<script>alert('존재하는 아이디입니다.');</script>");
			Response.Write("<script>location.href='joinFrm.jsp';</script>"); */
		}
		%>
		
		<%-- <%
		sql = "select * from members where regdate >= (select max(regdate) from members)";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery(); 
		rs.next();
		%> --%>
		
		<%-- 테이블에서 읽어온 데이터<br>
		<table border="1">
			<tr>
				<td>아이디</td>
				<td><%=rs.getString(1) %></td>
				<td>비밀번호</td>
				<td><%=rs.getString(2) %></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><%=rs.getString(3) %></td>
				<td>전화번호</td>
				<td><%=rs.getString(4) %></td>
			</tr>
			<tr>
				<td>주소</td>
				<td><%=rs.getString(5) %></td>
				<td>이메일</td>
				<td><%=rs.getString(6) %></td>
			</tr>
			<tr>
				<td>가입일</td>
				<td colspan="3"><%=rs.getString(7) %></td>
		</table> --%>
		
	<%} catch (ClassCastException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	finally {
		conn.close();
	}
	%>

</body>
</html>