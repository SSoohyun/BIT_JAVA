<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	td{
		text-align: center;
	}
</style>
</head>
<body>
	<jsp:include page="/menu.jsp"></jsp:include>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">회원 정보</h1>
		</div>
	</div>
	<%
	String url = "jdbc:mysql://localhost:3306/scottdb?useSSL=false";
	String dbId = "scott";
	String dbPwd = "tiger";
	Connection conn = null;
	String sql = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url, dbId, dbPwd);
		
		// 데이터 불러오기
		sql = "select * from members where userid = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, session.getAttribute("userId").toString());
		rs = pstmt.executeQuery(); 
		rs.next();
		%>
		<div class="container">
			<form method="post" class="form-horizontal" action="updateProc.jsp">
				<div class="form-group row">
				<label class="col-sm-2">아이디</label>
				<div class="col-sm-3">
					<input type="text" id="userId" name="userId" class="form-control" value="<%=rs.getString(1) %>" readonly>
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">비밀번호</label>
				<div class="col-sm-3">
					<input type="text" id="userPwd" name="userPwd" class="form-control" value="<%=rs.getString(2) %>">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">이름</label>
				<div class="col-sm-3">
					<input type="text" id="userName" name="userName" class="form-control" value="<%=rs.getString(3) %>">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">전화번호</label>
				<div class="col-sm-3">
					<input type="text" id="phoneNo" name="phoneNo" class="form-control" value="<%=rs.getString(4) %>">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">주소</label>
				<div class="col-sm-3">
					<input type="text" id="address" name="address" class="form-control" value="<%=rs.getString(5) %>">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">이메일</label>
				<div class="col-sm-3">
					<input type="text" id="email" name="email" class="form-control" value="<%=rs.getString(6) %>">
				</div>
			</div>
			<div class="form-group row">
				<div class="col-sm-offset-2 col-sm-10">
					<input type="submit" class="btn btn-danger" value="수정하기">
				</div>
			</div>			
		</form>
	</div>
	<% } catch(ClassNotFoundException e) { 
		e.printStackTrace();
	} catch(SQLException e){
		e.printStackTrace();
	}
	finally {
		conn.close();
	}
	%> 
	<script type="text/javascript">
		function checkForm(){
			if (!document.join.userId.value) {
				alert('아이디를 입력하세요');
				return false;
			}
			if (!document.join.userPwd.value) {
				alert('비밀번호를 입력하세요');
				return false;
			}
			if (!document.join.userName.value) {
				alert('비밀번호를 입력하세요');
				return false;
			}
			if (!document.join.phoneNo.value) {
				alert('비밀번호를 입력하세요');
				return false;
			}
			if (!document.join.address.value) {
				alert('비밀번호를 입력하세요');
				return false;
			}
			if (!document.join.email.value) {
				alert('비밀번호를 입력하세요');
				return false;
			}
		}
	</script>
</body>
</html>