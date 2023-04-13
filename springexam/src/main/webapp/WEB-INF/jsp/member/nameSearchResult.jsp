<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MemberList</title>
<link rel="stylesheet" href="../bootstrap.min.css">
</head>
<body>
	<h1>会員一覧</h1>
	<table class = "table">
		<tr>
			<th>会員ID</th>
			<th>氏名</th>
			<th>誕生日</th>
			<th>職種</th>
		</tr>
	<c:forEach items ="${memberList}" var ="m">
		<tr>
			<td><c:out value = "${m.memberId}"/></td>
			<td><c:out value = "${m.lastName}"/><c:out value = "${m.firstName}"/></td>
			<td><fmt:formatDate pattern="yyyy/MM/dd" value="${m.birthday}"/></td>
			<td><c:out value = "${m.jobTypeName}"/></td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>