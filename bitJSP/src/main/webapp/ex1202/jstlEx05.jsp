<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.icarus.beans.BookBean" %>
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
	<%-- <%
	ArrayList<BookBean> bookList = new ArrayList<BookBean>();
	bookList.add(new BookBean("명탐정 홈즈", "코난 도일", "모름"));
	bookList.add(new BookBean("코스모스", "칼 세이건", "모름"));
	
	String[] bookCode = {"소설", "역사", "인문", "정치", "미술", "종교", "여행", "과학", "만화"};
	%>
	<c:set var="list" value="<%=bookList %>"/>
	<c:forEach var="item" items="${list}">
		${item.title}/${item.author}/${item.publisher}<br>
	</c:forEach>
	<hr>
	
	<c:set var="code" value="<%=bookCode %>"/>
	<c:forEach var="item" items="${code}">
		<c:out value="${item}"></c:out>
	</c:forEach> --%>
	
	
	
	
	
	
	<c:forEach var="i" begin="2" end="9">
	<c:forEach var="j" begin="1" end="9">
			${i}*${j}=${i*j}<br>
	</c:forEach>
	</c:forEach>
	<hr>
	<c:forEach var="k" begin="1" end="10" step="2">
		${k}
	</c:forEach>
	
	
	
</body>
</html>