<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	td{
		vertical-align: top;
	}
</style>
</head>
<body>
	<table border="1">
		<tr>
			<td colspan="2"><jsp:include page="include/top.jsp" flush="false"></jsp:include></td>
		</tr>
		<tr>
			<td><jsp:include page="include/menu.jsp" flush="false"></jsp:include></td> <!-- 출력 스트림을 여기서 제어: flush="false" -->
			<td>
			
			<% String target = request.getParameter("target"); %>
			<% if (target == null) { %>
				<jsp:include page="main.jsp" flush="false"></jsp:include>
			<% } else {
				target += ".jsp";
				%>
				<jsp:include page="<%=target %>"></jsp:include>
			<% } %>
			</td>
		</tr>
		<tr>
			<td colspan="2"><jsp:include page="include/bottom.jsp" flush="false"></jsp:include></td>
		</tr>
	</table>
</body>
</html>