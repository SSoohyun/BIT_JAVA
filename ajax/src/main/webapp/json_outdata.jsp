<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
	<script>
		$(document).ready(function() {
			// JSON 형태로 가져옴
			$.getJSON("http://apis.data.go.kr/1262000/TravelAlarmService2/getTravelAlarmList2?serviceKey=kq0yGbUy8E6Rkoxx3s1POUjNJbD9XBWy6nS3yHx5HsxDUKmN4%2FgiqFhKIVLOsCsxX9VPSaqDQJjw2aVUpWbuNg%3D%3D&returnType=JSON&numOfRows=10&pageNo=2", function(info) {
				$.each(info.data, function(key, value) {
					var continent_name = value.continent_nm;
					var country_name = value.country_nm;
					var flag_url = value.flag_download_url;
					var map_url = value.map_download_url;
					var output = '';
					output += '<div>';
					output += '<h2>' + continent_name + '</h2>';
					output += '<h3>' + country_name + '</h3>';
					output += '<img src="' + flag_url + '" alt="해당 국가 이미지 없음" width="200"/>';
					output += '&nbsp;&nbsp';
					output += '<img src="' + map_url + '" alt="해당 국가 이미지 없음" width="200" border="1"/>';
					output += '</div>';
					$('body').append(output);
				});
			});
		});
	</script>
</body>
</html>