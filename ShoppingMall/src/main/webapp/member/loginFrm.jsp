<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.login-form {
    width: 300px;
    background-color: #EEEFF1;
    margin-right: auto;
    margin-left: auto;
    margin-top: 50px;
    padding: 20px;
    text-align: center;
    border: none;
}
 
.text-field {
      font-size: 14px;
      padding: 10px;
      border: none;
      width: 260px;
      margin-bottom: 10px;
}
</style>
</head>
<body>
	<jsp:include page="/menu.jsp"></jsp:include>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">로그인</h1>
		</div>
	</div>
	<div class="container">
		<h3 align="center">Please sign in</h3>
		<div class="login-form">
			<form name="login" action=loginProc.jsp method="post" onsubmit="return checkForm()">				
				<input type="text" name="userId" class="text-field" placeholder="아이디">
				<input type="password" name="userPwd" class="text-field" placeholder="비밀번호">
				<input type="submit" class="btn btn-success" value="로그인">
			</form>
		</div>
	</div>
	<jsp:include page="/footer.jsp"></jsp:include>
	
	<script type="text/javascript">
		function checkForm(){
			if (!document.login.userId.value) {
				alert('아이디를 입력하세요');
				return false;
			}
			if (!document.login.userPwd.value) {
				alert('비밀번호를 입력하세요');
				return false;
			}
		}
	</script>
	
	
	
</body>
</html>