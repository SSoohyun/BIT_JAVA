<%@page import="java.util.Enumeration"%>
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
	session.setAttribute("userId", "rose");
	session.setAttribute("userPwd", "1234");
	String name, value;
	int i = 0;
	
	// 다중 세션 정보 얻기
	Enumeration en = session.getAttributeNames();
	while (en.hasMoreElements()) {
		i++;
		name = en.nextElement().toString();
		value = session.getAttribute(name).toString();
		out.println("설정된 세션의 속성 이름[" + i + "]: " + name + "<br>");
		out.println("설정된 세션의 속성 값[" + i + "]: " + value + "<br>");
	}
	
	
	%>
</body>
</html>