<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
		window.onload = function() {
			var request = new XMLHttpRequest();
			request.onreadystatechange = function() {
				if (request.readyState == 4 && request.status == 200) {
					var parser = new DOMParser();
					var xml = parser.parseFromString(request.responseText, 'application/xml');
					var banNotes = xml.getElementsByTagName('banNote');
					var countryNames = xml.getElementsByTagName('countryName');
					var imgUrls = xml.getElementsByTagName('imgUrl');
					for (var i = 0; i < banNotes.length; i++) {
						var banNote = banNotes[i].textContent;
						var countryName = countryNames[i].textContent;
						var imgUrl = imgUrls[i].textContent;
						document.body.innerHTML += '<p>' + banNote + '&nbsp&nbsp&nbsp&nbsp' + countryName;
						document.body.innerHTML += '<img src="' + imgUrl + '" alt="해당 국가 이미지 없음" width="100"/></p>';
					}
				}
			}
			request.open("get", "http://apis.data.go.kr/1262000/TravelBanService/getTravelBanList?serviceKey=kq0yGbUy8E6Rkoxx3s1POUjNJbD9XBWy6nS3yHx5HsxDUKmN4%2FgiqFhKIVLOsCsxX9VPSaqDQJjw2aVUpWbuNg%3D%3D&numOfRows=10&pageNo=1&countryName=%EA%B0%80%EB%82%98&countryEnName=Ghana", true);
			request.send();
		};
	</script>
</body>
</html>