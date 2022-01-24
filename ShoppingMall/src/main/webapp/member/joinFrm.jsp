<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table{
		border-collapse: collapse;
		border-color: skyblue;
	}
	
	td{
		text-align: center;
	}
	
</style>
</head>
<body>
	<jsp:include page="/menu.jsp"></jsp:include>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">회원 가입</h1>
		</div>
	</div>
	
	<div class="container">
		<form name="join" action="joinProc.jsp" class="form-horizontal" method="post" onsubmit="return checkForm()">
			<div class="form-group row">
				<label class="col-sm-2">아이디</label>
				<div class="col-sm-3">
					<input type="text" id="userId" name="userId" class="form-control">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">비밀번호</label>
				<div class="col-sm-3">
					<input type="text" id="userPwd" name="userPwd" class="form-control">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">이름</label>
				<div class="col-sm-3">
					<input type="text" id="userName" name="userName" class="form-control">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">전화번호</label>
				<div class="col-sm-3">
					<input type="text" id="phoneNo" name="phoneNo" class="form-control">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">주소</label>
				<div class="col-sm-3">
					<input type="text" id="address" name="address" class="form-control">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">이메일</label>
				<div class="col-sm-3">
					<input type="text" id="email" name="email" class="form-control">
				</div>
			</div>
			<div class="form-group row">
				<div class="col-sm-offset-2 col-sm-10">
					<input type="submit" class="btn btn-primary" value="회원가입">
				</div>
			</div>
		</form>
	</div>
	<jsp:include page="/footer.jsp"></jsp:include>
	
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