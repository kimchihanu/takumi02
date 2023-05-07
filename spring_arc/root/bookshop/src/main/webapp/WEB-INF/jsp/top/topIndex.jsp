<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/common/define.jsp" %>
<jsp:include page="/WEB-INF/jsp/common/header.jsp"></jsp:include>

<link rel = "stylesheet" href ="https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css"/>
<script src = "https://code.jquery.com/jquery-3.5.1.js"></script>
<script src = "https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
<script>
$(document).ready(function () {
    $('#product').DataTable({
    stateSave: true,
    language:
    {
        "emptyTable": "テーブルにデータがありません",
        "info": " _TOTAL_ 件中 _START_ から _END_ まで表示",
        "infoEmpty": " 0 件中 0 から 0 まで表示",
        "infoFiltered": "（全 _MAX_ 件より抽出）",
        "infoThousands": ",",
        "lengthMenu": "_MENU_ 件表示",
        "loadingRecords": "読み込み中...",
        "processing": "処理中...",
        "search": "検索:",
        "zeroRecords": "一致するレコードがありません",
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
<div id="section">
	<div id="article">
		<h1>商品一覧</h1>
		<table id = "product">
		<thead>
			<tr>
				<td>ID</td>
				<td>Product</td>
				<td>Price</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${bookList}" var="book">
				<tr>
					<td>
						<a href="/cart/add?bookId=<c:out value="${book.id}"/>">
						<img src="${pageContext.request.contextPath}/img/add.png"></a>
					</td>
					<td><c:out value="${book.bookName}" /></td>
					<td>&yen;<fmt:formatNumber pattern="#,###" value="${book.price}" /></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</div>
<jsp:include page="/WEB-INF/jsp/common/footer.jsp"></jsp:include>
