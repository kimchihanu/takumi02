<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>入力画面</title>
<link rel="stylesheet" href="/bootstrap.min.css">
</head>
<body>
	<div class="col-md-12">
		<div class="form-group">
			<label for="id">ID</label> <span><c:out
					value="${insfraForm.id}" /></span>
		</div>
		<div class="form-group">
			<label for="name">インフラ名</label> <span><c:out
					value="${insfraForm.name}" /></span>
		</div>
		<div class="form-group">
			<label for="resgistDate">登録日時</label> <span><c:out
					value="${insfraForm.registDate}" /></span>
		</div>

	</div>
</body>
</html>