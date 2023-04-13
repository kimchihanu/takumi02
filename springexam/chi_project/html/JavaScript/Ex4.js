
	function cal(){
	var num1 = document.getElementById("num1").value;
	var num2 = document.getElementById("num2").value;
	var num3 = document.getElementById("num3").value;
	var result = (parseInt(num1)+ parseInt(num2)) * parseInt(num3);
	
//	document.getElementById("result").innerHTML = result;
	
	
	if(result % 2==0){
		document.getElementById("result").style.backgroundColor="yellow";	
		
	}else{
		document.getElementById("result").style.backgroundColor="red";	
	}
	
	}