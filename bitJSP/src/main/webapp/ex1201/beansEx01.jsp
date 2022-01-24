<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 자바 빈즈 사용 예 -->
	<jsp:useBean class="org.global.beans.HelloBean" id="hello"> <!-- id는 reference -->
		<jsp:getProperty property="name" name="hello"/> <!-- 여기서는 name이 reference -->
		<jsp:getProperty property="number" name="hello"/>
		<hr>
		
		<jsp:setProperty property="name" name="hello" value="conan"/>
		<jsp:getProperty property="name" name="hello"/>
		<jsp:setProperty property="number" name="hello" value="010-1111-1111"/> <!-- 번호 바꿈 -->
		<jsp:getProperty property="number" name="hello"/>
		
		<!-- parmam을 이용하여 값 설정(GET) -->
		<jsp:setProperty property="name" name="hello" param="name"/>
		<jsp:setProperty property="number" name="hello" param="number"/>
		<hr>
		<jsp:getProperty property="name" name="hello"/>
		<jsp:getProperty property="number" name="hello"/>
	</jsp:useBean>
</body>
</html>