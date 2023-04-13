<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
	<h1>ID :<c:out value="${param.orderNo}"/> の検索結果</h1>
	<dl>
		<dt>ORDER NO</dt>
		<dd><c:out value="${orderheader.orderNo}"/></dd>
		<dt>ORDER DATETIME </dt>
		<dd><fmt:formatDate pattern="yyyy年MM月dd日 HH:mm:ss EEEE" value="${orderheader.orderDatetime}"/></dd>
		<dt>MEMBER ID</dt>
		<dd><c:out value="${orderheader.memberId}"/></dd>
		<dt>PAYMENT TYPE</dt>
		<dd><c:out value="${orderheader.paymentType}"/></dd>
		<dt>MEMBER CARD ID</dt>
		<dd><c:out value="${orderheader.memberCardId}"/></dd>	
	</dl>
</body>
</html>