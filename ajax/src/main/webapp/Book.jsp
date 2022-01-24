<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<marquee>
		<h1>This is an example of ajax</h1>
	</marquee>
	<form name="vinform">
		book ID: <input type="text" name="t1" onkeyup="sendInfo()">
	</form>
	<hr>
	<span id="info"></span>
	
	<script type="text/javascript">
		var request;
		function sendInfo() {
			var v = document.vinform.t1.value;
			var url = "book_index.jsp?val=" + v; 
			if (window.XMLHttpRequest) {
                request = new XMLHttpRequest();
            } else {
                request = new ActiveXObject("Microsoft.XMLHTTP");
            }
			try {
				request.onreadystatechange = getInfo;
				request.open("GET", url, true); // async
				request.send();
			} catch(e) {
				alert("Unable to connect to server");
			} 
		}
		function getInfo() {
			if (request.readyState == 4) {
				var val = request.responseText;
				document.getElementById('info').innerHTML = val;
			}
		}
	</script>
</body>
</html>