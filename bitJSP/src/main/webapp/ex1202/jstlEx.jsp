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
	<c:set var="name" value="amy"/> <!-- 변수 name=amy -->
	<c:out value="${name}"/><br> <!-- 출력 -->
	<c:remove var="name"/>  <!-- 변수 삭제 -->
	<c:out value="${name}"/>
	
	<%
	BookBean book1 = new BookBean("명탐점 홈즈", "코난 도일", "모름");
	request.setAttribute("bookOne", book1);
	%>
	
	<c:set var="title" value="${bookOne.title}"/>
	<c:out value="${title}"></c:out>
	<c:set var="author" value="<%=book1.getAuthor() %>"/>
	<c:out value="${author}"/><hr>
	
	
	<c:set var="name">Wilde</c:set>
	<c:out value="${name}"></c:out> <br>
	
	<%
	BookBean book2 = new BookBean("도리안 그레이의 초상", "오스카 와일드", "모름");
	request.setAttribute("bookTwo", book2);
	%>
	
	<c:set var="title" value="${bookTwo.title}"/>
	<c:out value="${title}"></c:out>
	<c:set var="author" value="<%=book2.getAuthor() %>"/>
	<c:out value="${author}"/><hr>
		
</body>
</html>