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
	
	th{
		background-color: skyblue;
	}
	
	th, td{
		width: 120px;
		height: 50px;
	}
</style>


</head>
<body>
	<%
	// 1. JNDI 서버 객체 생성
	InitialContext ic = new InitialContext();
	
	// 2. lookup()
	DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/myoracle");
	
	// 3. Connection()
	Connection conn = ds.getConnection();
	PreparedStatement pstmt = conn.prepareStatement("select * from book");
	ResultSet rs = pstmt.executeQuery();
	
	ArrayList<Book> b = new ArrayList<Book>();
	while (rs.next()) {
		b.add(new Book(rs.getInt("bookid"), rs.getString("bookname"), rs.getString("publisher"), rs.getInt("price")));		
	}
	// 반납
	rs.close(); pstmt.close(); conn.close();
	%>
	
	<c:set var="list" value="<%=b %>"/>
	
	<table border="1">
		<tr>
			<th>BOOKNAME</th>
			<th>PUBLISHER</th>
			<th>PRICE</th>
		</tr>
		<c:forEach var="item" items="${list}">
			<tr>
				<td><a href="bookview.jsp?bn=${item.bookId}">${item.bookName}</a></td> <!-- get방식으로 전달 -->
				<td>${item.publisher}</td>
				<td>${item.price}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>