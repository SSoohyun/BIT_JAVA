<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
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
	InitialContext ic = null;
	DataSource ds = null;
	Connection conn = null;
	
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try {
		ic = new InitialContext();
		ds = (DataSource) ic.lookup("java:comp/env/jdbc/myoracle");
		conn = ds.getConnection();
		
		pstmt = conn.prepareStatement("select bookid, bookname from book where bookid = ?");
		String val = request.getParameter("val");
		if (val != null) {
			pstmt.setInt(1, Integer.parseInt(val));
			rs = pstmt.executeQuery();
			rs.next();
			out.print(rs.getInt(1) + " : " + rs.getString(2));
		}
		
		rs.close(); pstmt.close(); conn.close();
	} catch (SQLException e) {
		
	} catch (NullPointerException e) {
		
	} catch (NumberFormatException e) {
		
	}
	%>
</body>
</html>