<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@taglib prefix = "fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>検索結果</title>
<link rel="stylesheet" href="../bootstrap.min.css">
<style>
.bigcity{color:red}
</style>
</head>
<body>
<h1>検索結果</h1>
	<table border = "1" class ="table">
		<tr>
			<th>都道府県名</th>
			<th>人口</th>
			<th>３地方区分</th>
			<th>８地方区分</th>
		</tr>
		<c:forEach items ="${preList}" var ="pre">
			<tr>
				<td><c:out value="${pre.name}"/></td>
				<td<c:if test="${pre.population>2000000}"> class = "bigcity"</c:if>>
				<fmt:formatNumber pattern = "#,###" value = "${pre.population}"/>
				</td>
				<td><c:out value="${pre.section3Id}"/></td>
				<td><c:out value="${pre.section8Id}"/></td>
				<td><a href = "update?id=<c:out value = "${pre.id}"/>" class = "btn btn-info">更新</a></td>
				
			</tr>
			</c:forEach>
	</table>
</body>
</html>