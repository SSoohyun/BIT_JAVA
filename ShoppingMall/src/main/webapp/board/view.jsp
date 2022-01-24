<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
		<form name="newWrite" action="writeProc.do?boardNo=${post.boardNo}" class="form-horizontal" method="post" onsubmit="return checkForm()">
			<div class="form-group row">
				<label class="col-sm-2 control-label">성명</label>
				<div class="col-sm-5">
					<input name="userId" type="text" class="form-control" value="${post.userId}" readonly>
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label">제목</label>
				<div class="col-sm-5">
					<input name="title" type="text" class="form-control" value="${post.title}">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label">내용</label>
				<div class="col-sm-8">
					<textarea name="content" class="form-control" rows="12">${post.content}</textarea>
				</div>
			</div>
			<div class="form-group row">
				<div class="col-sm-offset-2 col-sm-10">
					<c:choose>
						<c:when test="${empty userId or userId ne post.userId}">
							<input type="submit" class="btn btn-primary" onclick="location='listProc.do'" value="목록">
						</c:when>
						<c:otherwise>
							<input type="button" class="btn btn-danger" onclick="location='deleteProc.do?boardNo=${post.boardNo}'" value="삭제">
							<%-- <a href="deleteProc.do?boardNo=${post.boardNo}"><button type="button" class="btn btn-danger">삭제</button></a> --%>
							<input type="submit" class="btn btn-success" value="수정">
							<input type="button" class="btn btn-primary" onclick="location='listProc.do'" value="목록">
							<!-- <a href="listProc.do"><button type="button" class="btn btn-primary">목록</button></a> -->
						</c:otherwise>
					</c:choose>
				</div>
			</div>
		</form>
	</div>
	<jsp:include page="/footer.jsp"></jsp:include>
	
	<script type="text/javascript">
		function checkForm(){
			if (!document.newWrite.title.value) {
				alert('제목을 입력하세요');
				return false;
			}
			if (!document.newWrite.content.value) {
				alert('내용을 입력하세요');
				return false;
			}
		}
	</script>
</body>
</html>