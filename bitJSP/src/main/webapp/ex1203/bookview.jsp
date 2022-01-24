<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, javax.sql.*, javax.naming.*" %>
<%@ page import="org.icarus.beans.Book" %>
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
<style>
	table{
		border-color: skyblue;
	}
	
	td{
		width: 100px;
		height: 50px;
	}
	a{
		color: black;
	}
	.list{
		text-align: right;
	}
	
</style>

</head>
<body>
	<%
	// 1. JNDI 서버 객체 생성
	InitialContext ic = new InitialContext();
	
	// 2. lookup()
	DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/myoracle");
	
	int bn = Integer.parseInt(request.getParameter("bn"));
	
	// 3. Connection()
	Connection conn = ds.getConnection();
	PreparedStatement pstmt = conn.prepareStatement("select * from book where bookid = ?");
	pstmt.setInt(1, bn);
	ResultSet rs = pstmt.executeQuery();
	
	rs.next();
	Book b = new Book(rs.getString("bookname"), rs.getString("publisher"), rs.getInt("price"));
	request.setAttribute("book", b);
	
	// 반납
	rs.close(); pstmt.close(); conn.close();
	%>

	<table border="1">
		<tr>
			<td>책 제 목</td>
			<td>${book.bookName}</td>
		</tr>
		<tr>
			<td>출 판 사</td>
			<td>${book.publisher}</td>
		</tr>
		<tr>
			<td>가 격</td>
			<td>${book.price}</td>
		</tr>
		<tr>
			<td class="list" colspan="2"><a href="booklist.jsp">목록</a></td>
		</tr>
	</table>
</body>
</html>