<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>書籍更新（確認）</title>
<link rel="stylesheet" href="/bootstrap.min.css">
</head>
<body>
<div class="container">
<div class="col-md-6 col-md-offset-3">
	<h1>書籍更新（確認）</h1>

			<div class="form-group">
			<label for="bookId">書籍ID</label> <span><c:out
					value="${bookForm.bookId}" /></span>
					
			</div>
			<div class="form-group">
			<label for="bookName">書籍名</label> <span><c:out
					value="${bookForm.bookName}" /></span>
			</div>
			<div class="form-group">
			<label for="price">価格</label> <span><c:out
					value="${bookForm.price}" /></span>
			</div>
			<div class="form-group">
			<label for="discount">値引き金額</label> <span><c:out
					value="${bookForm.discount}" /></span>
			</div>
			<div class="form-group">
			<label for="categoryName">カテゴリ</label> <span><c:out
					value="${category.categoryName}" /></span>
			</div>
			<div class="form-group">
			<label for="publisherName">出版社名</label> <span><c:out
					value="${publisher.publisherName}" /></span>
			</div>
			<div class="form-group">
			<label for="pageCount">ページ数</label> <span><c:out
					value="${bookForm.pageCount}" /></span>
			</div>
			<div class="form-group">
			<label for="isbn13">ISBN番号</label> <span><c:out
					value="${bookForm.isbn13}" /></span>
			</div>
			<div class="form-group">
			<label for="onSaleDate">発売日</label> <span>
			<fmt:formatDate pattern = "yyyy年MM月dd日"
					value="${bookForm.onSaleDate}" /></span>
			</div>
			
			</div>
		<form:form modelAttribute="bookForm">
			<form:hidden path="bookId" />
			<form:hidden path="bookName" />
			<form:hidden path="price" />
			<form:hidden path="discount" />
			<form:hidden path="categoryId" />
			<form:hidden path="publisherId" />
			<form:hidden path="pageCount" />
			<form:hidden path="isbn13" />
			<form:hidden path="onSaleDate"/>
			<input type="submit" class = "btn btn-primary" value="更新" formaction = "editExecute"/>
			<input type="submit" class="btn btn-secondary" value="戻る" formaction = "edit"/>
		</form:form>
	</div>
	</div>
</body>
</html>