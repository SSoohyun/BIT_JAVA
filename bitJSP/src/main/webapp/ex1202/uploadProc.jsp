<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.oreilly.servlet.*,
				 com.oreilly.servlet.multipart.*,
				 java.util.*,
				 java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String path = application.getRealPath("/upload"); // 업로드가 있는 위치
	out.println(path);
	int size = 1024 * 1024 * 10; // 10M
	try{
		MultipartRequest multi = new MultipartRequest(request, path, size, "UTF-8",  new DefaultFileRenamePolicy());
		Enumeration files = multi.getFileNames();
		String name = (String) files.nextElement();
		String file = multi.getFilesystemName(name);
		long fileSize = multi.getFile("file").length();
		String orgFile = multi.getOriginalFileName(name);
		String type = multi.getContentType(name);
		
		out.println("파일명: " + file + "<br>");
		out.println("파일크기: " + fileSize + "<br>");
		out.println("원본 파일명: " + orgFile + "<br>");
		out.println("컨텐츠 유형: " + type + "<br>");	
		out.println("사용자가 입력한 설명: " + multi.getParameter("desc"));
	} catch(Exception e) {
		out.print("업로드 오류 발생");
	}
	%>
</body>
</html>