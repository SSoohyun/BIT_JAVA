<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	td{
		text-align: center;
	}
</style>
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
		
		// 데이터 불러오기
		sql = "select * from members where userid = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, session.getAttribute("userId").toString());
		rs = pstmt.executeQuery(); 
		rs.next();
		%>
		
		<form method="post" action="updateProc.jsp">
			<table border="1">
				<tr>
					<td>아이디</td>
					<td><input type="text" name="userId" value="<%=rs.getString(1) %>" readonly></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="userPwd" value="<%=rs.getString(2) %>"></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="userName" value="<%=rs.getString(3) %>"></td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td><input type="text" name="phoneNo" value="<%=rs.getString(4) %>"></td>
				</tr>
				<tr>
					<td>주소</td>
					<td><input type="text" name="address" value="<%=rs.getString(5) %>"></td>
				</tr>
				<tr>
					<td>이메일</td>
					<td><input type="text" name="email" value="<%=rs.getString(6) %>"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="수정하기"></td>
				</tr>
			</table>
		</form>
	<% } catch(ClassNotFoundException e) { 
		e.printStackTrace();
	} catch(SQLException e){
		e.printStackTrace();
	}
	finally {
		conn.close();
	}
	%> 
</body>
</html>