<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%request.setAttribute("cnt", 3); %>
	<%=request.getAttribute("cnt") %>
	${cnt} <!-- 가져와서 화면에 출력 -->
	
	<%String[] strArray = {"1", "2", "3"};
	List<String> list = Arrays.asList(strArray);
	request.setAttribute("list", list);
	%>
	<%=((List)request.getAttribute("list")).get(0) %>
	${list[0]}

	
	<%
	Map<String, String> map = new HashMap<String, String>();
	map.put("name", "코난");
	request.setAttribute("map", map);
	%>
	<%=((Map)request.getAttribute("map")).get("name") %>
	
	${map.name}
	
	
	<%-- ${cookie.ID.value} cookie에서 getID, getValue --%>
</body>
</html>