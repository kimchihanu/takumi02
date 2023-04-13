<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JOBTYPE一覧</title>
</head>
<body>
<p>JOBTYPE一覧</p>
	<ul>
	<c:forEach items ="${jobtypeList}" var ="jt">
	<li><c:out value="${jt.jobTypeId}"/></li>
	<c:out value="${jt.jobTypeName}"/>
	</c:forEach>
	<ul>

</body>
</html>