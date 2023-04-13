	
	let resultsArray = [];
	function add(){
	var num1 = document.getElementById("num1").value;
	var num2 = document.getElementById("num2").value;
	var sum= parseInt(num1) + parseInt(num2);

	document.getElementById("resultAdd").innerHTML =sum;
	if (sum % 2 == 0){
		document.getElementById("resultAdd").style.backgroundColor ="yellow";
	}
	resultsArray.push(sum);
	getLargestResult()
	}
	
	function sub(){
	var num3 = document.getElementById("num3").value;
	var num4 = document.getElementById("num4").value;
	var sub = parseInt(num3) - parseInt(num4);
	document.getElementById("resultSub").innerHTML =sub;	
	if (sub < 0){
		document.getElementById("resultSub").style.backgroundColor="red";
	}
	resultsArray.push(sub);
	getLargestResult()
	}
	
	function multi(){
	var num5 = document.getElementById("num5").value;
	var num6 = document.getElementById("num6").value;
	var multi = parseInt(num5) * parseInt(num6);
	
	document.getElementById("resultMulti").innerHTML= multi;
	if (multi >=3000){
	document.getElementById("resultMulti").style.backgroundColor="blue";
	}
	resultsArray.push(multi);
	getLargestResult()
	}
	
	function divi(){
	var num7 = document.getElementById("num7").value;
	var num8 = document.getElementById("num8").value;
	
	if (num8==0){
		document.getElementById("resultDivi").style.color="red";
		document.getElementById("resultDivi").textContent = "0以外の数値を入力してください。";
	}else{
	var divi = parseInt(num7) / parseInt(num8);
	
	document.getElementById("resultDivi").innerHTML= divi;
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
			document.getElementById("largestResult").textContent = "最大値: " + largestNum;
		}
		
		