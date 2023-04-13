
	let resultsArray = [];
	function add(){
	var num1 = $('#num1').val();
	var num2 = $('#num2').val();
	var sum= parseInt(num1) + parseInt(num2);

	$('#resultAdd').text(sum);
	if (sum % 2 == 0){
		$("#resultAdd").css("background-color","yellow");
	}
	resultsArray.push(sum);
	getLargestResult()
	}
	
	function sub(){
	var num3 = $('#num3').val();
	var num4 = $('#num4').val();
	var sub = parseInt(num3) - parseInt(num4);
	$('#resultSub').text(sub);	
	if (sub < 0){
		$('#resultSub').css("backgroundColor","red")
	}
	resultsArray.push(sub);
	getLargestResult()
	}
	
	function multi(){
	var num5 = $('#num5').val();
	var num6 = $('#num6').val();
	var multi = parseInt(num5) * parseInt(num6);
	
	$('#resultMulti').text(multi);
	if (multi >=3000){
	$('#resultMulti').css("backgroundColor","blue");
	}
	resultsArray.push(multi);
	getLargestResult()
	}
	
	function divi(){
	var num7 = $('#num7').val();
	var num8 = $('#num8').val();
	
	if (num8==0){
		$('#resultDivi').css("color","red");
		$('#resultDivi').text("0以外の数値を入力してください。");
	}else{
	var divi = parseInt(num7) / parseInt(num8);
	
	$('#resultDivi').text(divi);
	}
	resultsArray.push(divi);
	getLargestResult()
	}
	
	function getLargestResult() {
	if (resultsArray.length < 1) {
		 return; }
		var largestNum;
		for (var i = 0; i < resultsArray.length; i++) {
			if (i === 0 || resultsArray[i] > largestNum) {
				largestNum = resultsArray[i];}
			}
			$('#largestResult').text("最大値: " + largestNum);
		}
		
		