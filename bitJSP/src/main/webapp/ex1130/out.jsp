<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <%@ page buffer="none" %> <!-- 버퍼가 없음 --> --%>
	<%-- <%@ page buffer="1kb" %> --%>
	
	<%
	int total = out.getBufferSize();
	out.print("첫 번째 텍스트임");
	
	out.println("출력 버퍼 크기: " + total); // 버퍼 안에 내용 들어감
	out.println("출력 버퍼 크기: " + total); // 버퍼가 가득 차면 자동으로 flush
	out.println("출력 버퍼 크기: " + total);
	out.print("출력 버퍼 크기: " + total);
	out.print("출력 버퍼 크기: " + total);
	out.print("출력 버퍼 크기: " + total);
	out.print("출력 버퍼 크기: " + total);
	out.print("출력 버퍼 크기: " + total);
	out.print("출력 버퍼 크기: " + total);
	out.print("출력 버퍼 크기: " + total);
	out.print("출력 버퍼 크기: " + total);
	out.print("출력 버퍼 크기: " + total);
	out.print("출력 버퍼 크기: " + total);
	out.print("출력 버퍼 크기: " + total);
	out.print("출력 버퍼 크기: " + total);
	out.print("출력 버퍼 크기: " + total);
	out.print("출력 버퍼 크기: " + total);
	out.print("<br>사용되지 않은 버퍼 크기: " + out.getRemaining()); // 이거 빼고 남은 버퍼 사이즈
	out.clearBuffer(); // 버퍼 내용 지움
	/* out.flush(); // 버퍼 내용 강제 전송 */
	out.print("<br>flush 후 버퍼 크기: " + out.getRemaining()); // 출력 버퍼 크기와 같음 (버퍼에 아무것도 없다)
	%>
	<hr>
	<%-- <h3>out.print() 메소드</h3>
	<%
	out.print(10);
	out.print(true);
	out.print("aaa");
	out.print('가');
	out.print(new java.io.File("/"));
	out.print("버퍼의 크기: " + out.getRemaining());
	%> --%>
	
</body>
</html>