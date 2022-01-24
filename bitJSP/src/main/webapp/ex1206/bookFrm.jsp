<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="../bookReg" method="post">
		책 아이디: <input type="text" name="bookId"><br>
		책 제목: <input type="text" name="bookName"><br>
		출판사: <input type="text" name="publisher"><br>
		가격: <input type="text" name="price"><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>