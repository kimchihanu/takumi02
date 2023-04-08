<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>書籍一覧</title>
<link rel="stylesheet" href="../bootstrap.min.css">
<link rel="stylesheet" href ="https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css">
<script src= "https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
</head>
<body>
<div class="container">
<div class="col-md-12">
	<h1>書籍一覧</h1>
	<div id="book_info" class="box"></div>
	<table id = "tableList" class ="table table-bordered">
		<thead>
			<tr>
				<th>書籍ID</th>
				<th>書籍名</th>
				<th>価格</th>
				<th>カテゴリ</th>
				<th>出版社</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items ="${bookList}" var ="b" varStatus = "st">
				<tr>
					<td><c:out value="${b.bookId}"/></td>
					<td><c:out value="${b.bookName}"/></td>
					<td><c:out value="${b.price}"/></td>
					<td><c:out value="${b.categoryName}"/></td>
					<td><c:out value="${b.publisherName}"/></td>
					<td>
						<a href = "show?bookId=<c:out value = "${b.bookId}"/>" class = "btn btn-info">詳細</a>
						<a href = "edit?bookId=<c:out value = "${b.bookId}"/>" class = "btn btn-success">編集</a>
						<a href = "delete?bookId=<c:out value = "${b.bookId}"/>" class = "btn btn-danger">削除</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<form action = "input">
	<input class = "btn btn-primary" type ="submit" value ="新規登録">
	</form>
</div>
</body>
<script>
$(document).ready(function () { 
    $('#tableList').DataTable({
    language:{
    	 "info": " _TOTAL_ 件中 _START_ から _END_ まで表示",
    	 "search": "検索:",
    	 "lengthMenu": "_MENU_ 件表示",
    	 "paginate": {
    	 "first": "先頭",
    	 "last": "最終",
    	 "next": "次",
    	 "previous": "前"
    	 },
    	 }
    	 });
    	 });
</script>
</html>