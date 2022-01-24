<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <h3>first page임</h3> <!-- 버퍼로 들어감 -->
	<jsp:forward page="second.jsp"/> <!-- 액션태그 실행 전 생성했던 출력 결과는 모두 제거 (버퍼 비움) -->
	<p>======first.jsp 페이지=======</p> --%>
	
	<h3>first page임</h3> <!-- 버퍼로 들어감 -->
	<jsp:include page="second.jsp" flush="false"/> 
	<p>======first.jsp 페이지=======</p>
	
</body>
</html>