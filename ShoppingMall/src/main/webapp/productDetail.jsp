<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, javax.sql.*, javax.naming.*" %>
<%@ page import="com.conan.vo.Products" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<%-- <jsp:useBean id="product" class="com.conan.vo.Products"></jsp:useBean> --%>
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 상세정보</h1>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-md-4">
				<p><img src="upload/${product.fileName}" alt="해당 이미지 없음" width="300"></p>
			</div>
			<div class="col-md-6">
				<h1>${product.proName}</h1> 
				<p>${product.description}</p>
				<p><b>상품 코드: </b> <span class="badge badge-danger">${product.proId}</span>	</p>
				<p><b>제조사: </b>${product.manufacturer}</p>
				<p><b>분류: </b>${product.category}</p>
				<p><b>재고 수: </b>${product.noOfStock}</p>
				<h3><b><i>${product.unitPrice}</i> 원</b></h3><br>
				<form name="addForm" action="AddCart?proId=${product.proId}" method="post">
					<a href="#" class="btn btn-info" onclick="addToCart()">상품 주문 &raquo;</a>
					<a href="cart.jsp" class="btn btn-warning">장바구니 &raquo;</a>
					<a href="ProductList" class="btn btn-secondary">상품 목록 &raquo;</a>
				</form>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		function addToCart() {
			if (confirm("상품을 장바구니에 추가하시겠습니까?")) {
				document.addForm.submit(); // 폼 제출과 같음 --> action으로
			} else {
				document.addForm.reset();
			}
		}
	</script>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>