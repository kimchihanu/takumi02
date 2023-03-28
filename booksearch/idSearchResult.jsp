<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
<link rel="stylesheet" href="../bootstrap.min.css">
</head>
<body>
		<p>ID: <c:out value = "${param.bookId}"/>の検索結果</p>	
	<table class = "table">
		<tr>
			<th>書籍ID</th>
			<th>書籍名</th>
			<th>価格</th>
			<th>値引き金額</th>
			<th>発売日</th>
			<th>ページ数</th>
			<th>ISBN番号</th>
			<th>カテゴリ名</th>
			<th>出版社名</th>
		</tr>
	<c:forEach items ="${bookList}" var ="b">
		<tr>
			<td><c:out value = "${b.bookId}"/></td>
			<td><c:out value = "${b.bookName}"/></td>
			<td><c:out value = "${b.price}"/></td>
			<td><c:out value = "${b.discount}"/></td>
			<td><fmt:formatDate pattern="yyyy年MM月dd日 HH:mm:ss EEEE" value="${b.onSaleDate}"/>
			</td>
			<td><c:out value = "${b.pageCount}"/></td>
			<td><c:out value = "${b.isbn13}"/></td>
			<td><c:out value = "${b.categoryName}"/></td>
			<td><c:out value = "${b.publisherName}"/></td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>