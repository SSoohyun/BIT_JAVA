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
		/* out.println("데이터베이스 연결 성공"); */
		
		/* sql = "select * from book";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery(); */ %>
		
		<!-- while (rs.next()) {
			out.println(rs.getString(1) + "&nbsp;" + rs.getString(2) + "&nbsp;" + rs.getString(3) + "&nbsp;" +rs.getString(4) + "<br>");
			
		} -->
		
		<!-- 데이터 출력 -->
		<%-- <table border="1">
			<tr>
				<th>BOOKID</th>
				<th>BOOKNAME</th>
				<th>PUBLISHER</th>
				<th>PRICE</th>
			</tr>
			<% while (rs.next()) { %>
			<tr>
				<td><%=rs.getString(1)%></td>
				<td><%=rs.getString(2)%></td>
				<td><%=rs.getString(3)%></td>
				<td><%=rs.getString(4)%></td>
			</tr>
		<% } %>
		</table> --%>
		
		
		
		<%-- <!-- 데이터 수정 후 결과 출력 -->
		<% 
		sql = "update book set bookname = '동전' where bookid = 101"; 
		pstmt = conn.prepareStatement(sql);
		pstmt.executeUpdate();
		
		sql = "select * from book";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		%>
		
		<table border="1">
			<tr>
				<th>BOOKID</th>
				<th>BOOKNAME</th>
				<th>PUBLISHER</th>
				<th>PRICE</th>
			</tr>
			<% while (rs.next()) { %>
			<tr>
				<td><%=rs.getString(1)%></td>
				<td><%=rs.getString(2)%></td>
				<td><%=rs.getString(3)%></td>
				<td><%=rs.getString(4)%></td>
			</tr>
		<% } %>
		</table> --%>
		
		
		<!-- 데이터 삭제 후 결과 출력 -->
		<% 
		sql = "delete from book where bookid = 101"; 
		pstmt = conn.prepareStatement(sql);
		pstmt.executeUpdate();
		
		sql = "select * from book";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		%>
		
		<table border="1">
			<tr>
				<th>BOOKID</th>
				<th>BOOKNAME</th>
				<th>PUBLISHER</th>
				<th>PRICE</th>
			</tr>
			<% while (rs.next()) { %>
			<tr>
				<td><%=rs.getString(1)%></td>
				<td><%=rs.getString(2)%></td>
				<td><%=rs.getString(3)%></td>
				<td><%=rs.getString(4)%></td>
			</tr>
		<% } %>
		</table>
		
		
		
		
		
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