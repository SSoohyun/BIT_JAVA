<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="accountJob.action" method="post">
		<h1>은행 업무</h1>
		계좌번호: <input type="text" name="accountId"><br>
		비밀번호: <input type="password" name="accountPwd"><br>
		금액: <input type="text" name="amount">원<br>
		<select name="items" class="txt">
			<option value="deposit">입금</option>
			<option value="withdraw">출금</option>
			<option value="send">송금</option>
		</select>
		수신인: <input type="text" name="receiver"><br>
		<input type="submit" value="실행하기"><br>
	</form>
</body>
</html>