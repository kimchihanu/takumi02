<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/common/define.jsp" %>
<jsp:include page="/WEB-INF/jsp/common/header.jsp"></jsp:include>

<script src = "https://code.jquery.com/jquery-3.5.1.js"></script>
<style>
	input.search{
		padding:8px;
		border-radius:4px;
	}
</style>
<div id="section">
	<div id="article">
	<div class ="">
		<input class="search" id="bookName" onkeyup = "searchFunction()" value="" placeholder="キーワードを入力してください"/>
	<button class="btn" onclick="searchFunction()">検索</button>
	</div>	
	<h1>検索結果</h1>
	<ul id = "list"></ul>		
	</div>
</div>

<script>
	function searchFunction(){
		let name = $('#bookName').val();
		$.ajax({
			url:'search'
			,method:'GET'
			,data:{
				bookName:name
			},
			success: function(listData){
					var list = $('#list');
					list.html("");
					$.each(listData, function(key, value){
						$('#list').append("<li>" + value.bookName + "$" + value.price + "</li>");
					})
				}
			});
	}
</script>
<jsp:include page="/WEB-INF/jsp/common/footer.jsp"></jsp:include>
