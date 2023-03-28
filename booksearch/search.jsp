<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="../bootstrap.min.css">
</head>
<body>
	<h1>IDで検索</h1>
	<form action="idSearchResult">
		<input class ="form-control "type="text" name = "bookId" placeholder = "入力してください">
		<input class = "btn btn-primary" type ="submit" value ="検索">
 	<h1>名前の一部で検索</h1>
 	</form>
	<form action="nameSearchResult">
		<input class ="form-control "type="text" name = "bookName" placeholder = "入力してください">
		<input class = "btn btn-primary" type ="submit" value ="検索"> 
		</form>
</body>
</html>