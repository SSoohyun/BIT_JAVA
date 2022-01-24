<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="/menu.jsp"></jsp:include>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">게시판</h1>
		</div>
	</div>
	
	<div class="container">
		<form action="<c:url value="searchProc.do"/>" method="post">
			<div>
				<div class="text-right">
					<span class="badge badge-warning">전체 ${posts}건</span>
				</div>
			</div>
			
			<div style="padding-top: 50px">
				<table class="table table-hover">
					<tr>
						<th>번호</th>
						<th>제목</th>
						<th>작성일</th>
						<th>조회</th>
						<th>글쓴이</th>
					</tr>
					<c:forEach var="item" items="${board}">
						<tr>
							<td>${item.boardNo}</td>
							<td><a href="viewProc.do?boardNo=${item.boardNo}">${item.title}</a></td>
							<td>${item.regDate}</td>
							<td>${item.hit}</td>
							<td>${item.userId}</td>
						</tr>						
					</c:forEach>
				</table>
				

				
				<table>
					<tr>
						<td width="100%" align="left">&nbsp;&nbsp;
							<select name="items" class="txt">
								<option value="title">제목에서</option>
								<option value="content">본문에서</option>
								<option value="userId">글쓴이에서</option>
							</select>
							<input name="text" type="text"/>
							<input type="submit" id="btnAdd" class="btn btn-danger" value="검색"/>
						</td>
						<td width="100%" align="right">
							<a href="#" onclick="checkForm(); return false;" class="btn btn-info">&laquo;글쓰기</a>
						</td>
					</tr>
				</table>
				
			</div>
		</form>
	</div>
	<jsp:include page="/footer.jsp"></jsp:include>
	
	
	<%-- <script>
		function checkForm(){
			<%if (session.getAttribute("userId") != null) { %>
				location.href = "<%=request.getContextPath()%>/board/writeFrm.jsp";
			<%} else {%>
				alert('로그인 해주세요')
			<%}%>
		}
	</script> --%>
	
	<script>
		function checkForm(){
			if(${userId == null}) {
				alert('로그인 해주세요');
				return false;
			}
			location.href = "<%=request.getContextPath()%>/board/writeFrm.jsp";
		}
	</script>
	
</body>
</html>