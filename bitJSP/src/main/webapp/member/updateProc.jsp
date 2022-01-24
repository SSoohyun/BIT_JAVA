<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
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
		
		// 수정을 위해 입력한 데이터
		String userId = request.getParameter("userId"); 
		String userPwd = request.getParameter("userPwd");
		String userName = request.getParameter("userName");
		String phoneNo = request.getParameter("phoneNo");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		%>
		
		<%-- 수정하기 위해 입력한 데이터<br>
		<table border="1">
			<tr>
				<td>아이디</td>
				<td><%=userId %></td>
				<td>비밀번호</td>
				<td><%=userPwd %></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><%=userName %></td>
				<td>전화번호</td>
				<td><%=phoneNo %></td>
			</tr>
			<tr>
				<td>주소</td>
				<td><%=address %></td>
				<td>이메일</td>
				<td><%=email %></td>
			</tr>
		</table>
		<hr> --%>
		
		<%
		// 데이터 업데이트
		sql = "update members set userpwd = ?, username = ?, phoneno = ?, address = ?, email =? where userid = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userPwd);
		pstmt.setString(2, userName);
		pstmt.setString(3, phoneNo);
		pstmt.setString(4, address);
		pstmt.setString(5, email);
		pstmt.setString(6, userId);
		int i = pstmt.executeUpdate(); 
		
		if (i > 0) {
			response.sendRedirect("updateResult.jsp");
		} else {
			response.sendRedirect("updateFrm.jsp");
		}
		
		
		/* sql = "select * from members where userid = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userId);
		rs = pstmt.executeQuery(); 
		rs.next(); */
		%>
		
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