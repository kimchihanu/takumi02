<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
	<h1>ID : ${param.publisherId} の検索結果</h1>
	<dl>
		<dt>ID</dt>
		<dd>${publisher.publisherId}</dd>
		<dt>PUBLISHER NAME</dt>
		<dd>${publisher.publisherName}</dd>
</body>
</html>