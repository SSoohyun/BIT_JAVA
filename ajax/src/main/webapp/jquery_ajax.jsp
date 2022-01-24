<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="jquery-3.6.0.js"></script>
</head>
<body>
	<script>
		/* $(document).ready(function() {
			$.ajax("data.html", {
				success : function(data) {
					$('body').append(data);
				}
			});
		}); */
		
		/* $(document).ready(function() {
			$.ajax({
				url: "data.html",
				success : function(data) {
					$('body').append(data);
				}
			});
		}); */
		
		/* $(document).ready(function() {
			$.get("data.html", function(data) {
					$('body').append(data);
			});
		}); */
		
		/* $(document).ready(function() {
			$.get("data.html", function(data) {
					$('body').html(data);
			});
		}); */
		
		$(document).ready(function() {
			$('body').load("data.html");
		});
	</script>
</body>
</html>