	$(document).ready(function () {
			$('#submit').click(function () {
				const input = $('#input').val();
				if (!$.isNumeric(input)) {
					alert("数値を入力してください。");
					return;
				}
	$.ajax({
    type: 'GET',
    datatype:"json",
    url:'https://jsonplaceholder.typicode.com/todos/'+input,
   	success: function (data) {
		$('#result').empty().append(
			'<p>User ID: ' + data.userId + '</p>' +
			'<p>ID: ' + data.id + '</p>' +
			'<p>Title: ' + data.title + '</p>' +
			'<p>Completed: ' + data.completed + '</p>'
				);
					},
					error: function () {
						$('#result').empty().append('<p>Error</p>');
					}
				});
			});
		});