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
.sunday{color:red}
</style>
</head>
<body>
<h1>検索結果</h1>
	<table border = "1" class ="table">
		<tr>
			<th>orderNo</th>
			<th>orderDatetime</th>
		</tr>
		<c:forEach items ="${ohList}" var ="oh" varStatus = "st">
		<fmt:formatDate pattern = "EEEE" value = "${oh.orderDatetime}" var="day"/>
			<tr>
				<td><c:out value="${oh.orderNo}"/></td>
				<td <c:if test="${day=='日曜日'}">class="sunday"</c:if>>
					<c:out value ="${day}"/>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>