const calculation = {
	
	// =========== PROPERTIES ===========
	resultArray: [],
	LARGE_RESULT_NUMBER: 3000,
	DEFAULT_SUBTRACT_NUMBER: 10,
	ERROR_RESULT_COLOR: "red",
	LARGE_RESULT_COLOR: "green",
	NOT_NUMBER_MESSAGE: "Please enter valid numbers.",
	ZERO_NUMBER_MESSAGE: "Divider cannot be zero.",
	
	// =========== METHODS ===========
	// ADDITION FUNCTION
	add() {
		// Get numbers from DOM
		let num1 = this.getNum("#addNum1");
		let num2 = this.getNum("#addNum2");
		
		// Check for valid numbers
		if (this.validateNum(num1) || this.validateNum(num2)) { 
			this.printErrorMessage("#addMessage", this.ERROR_RESULT_COLOR, this.NOT_NUMBER_MESSAGE);
			return;
		}
		
		// Calculate, print message, add to array
		let result = parseInt(num1) + parseInt(num2);
		this.printResultMessage(result, "#addMessage");
		this.pushToArray(result);
		this.getLargestNumber(this.resultArray);
	},
	
	// SUBTRACTION FUNCTION
	subtract() {
		// Get numbers from DOM
		let num1 = this.getNum("#subtractNum1");
		let num2 = this.getNum("#subtractNum2");
		
		// Check for empty strings (specific to SUBTRACTION)
		if (num1 === "" || num2 === "") { 
			this.printErrorMessage("#subtractMessage", this.ERROR_RESULT_COLOR, this.NOT_NUMBER_MESSAGE);
			return;
		}
		
		// Check and convert to valid numbers (specific to SUBTRACTION)
		num1 = this.validateSubtractNum(num1, "#subtractNum1");
		num2 = this.validateSubtractNum(num2, "#subtractNum2");
		
		// Calculate, print message, add to array
		let result = parseInt(num1) - parseInt(num2);
		this.printResultMessage(result, "#subtractMessage");
		this.pushToArray(result);
		this.getLargestNumber(this.resultArray);
	},
	
	// MULTIPLICATION FUNCTION
	multiply() {
		// Get numbers from DOM
		let num1 = this.getNum("#multiplyNum1");
		let num2 = this.getNum("#multiplyNum2");
		
		// Check for valid numbers
		if (this.validateNum(num1) || this.validateNum(num2)) { 
			this.printErrorMessage("#multiplyMessage", this.ERROR_RESULT_COLOR, this.NOT_NUMBER_MESSAGE);
			return;
		}
		
		// Calculate, print message, add to array
		let result = parseInt(num1) * parseInt(num2);
		this.printResultMessage(result, "#multiplyMessage");
		this.pushToArray(result);
		this.getLargestNumber(this.resultArray);
	},
	
	// DIVISION FUNCTION
	divide() {
		// Get numbers from DOM
		let num1 = this.getNum("#divideNum1");
		let num2 = this.getNum("#divideNum2");
		
		// Check for valid numbers
		if (this.validateNum(num1) || this.validateNum(num2)) { 
			this.printErrorMessage("#divideMessage", this.ERROR_RESULT_COLOR, this.NOT_NUMBER_MESSAGE);
			return;
		}
		
		// Check for 0 as divider
		if (num2 == 0) {
			this.printErrorMessage("#divideMessage", this.ERROR_RESULT_COLOR, this.ZERO_NUMBER_MESSAGE);
			return;
		}
		
		// Calculate, print message, add to array
		let result = parseInt(num1) / parseInt(num2);
		this.printResultMessage(result, "#divideMessage");
		this.pushToArray(result);
		this.getLargestNumber(this.resultArray);
	},
	
	// RESULT ARRAY
	pushToArray(item) {
		this.resultArray.push(item);
		this.printResultArrayMessage(this.resultArray);
	},
	
	// LARGEST RESULT
	getLargestNumber(array) {
		if (array.length < 1) { return; }
		let largestNum;
		for (let i = 0; i < array.length; i++) {
			if (i === 0 || array[i] > largestNum) {
				largestNum = array[i];
			}
		}
		$("#largestResultMessage").html("Largest Result: " + largestNum);
	},
	
	// GET NUMBER FROM DOM (INPUT TAG)
	getNum(sessionTagId) {
		 return $(sessionTagId).val();
	},
	
	// NUMBER VALIDATION
	validateNum(num) {
		return isNaN(num) || num === "";
	},
	
	// CHECK & CONVERT NUMBER FOR SUBTRACT (Set to a default number if input is NaN)
	validateSubtractNum(num, sessionTagId) {
		if (isNaN(num)) {
			$(sessionTagId).val(this.DEFAULT_SUBTRACT_NUMBER);
			return this.DEFAULT_SUBTRACT_NUMBER
		} else {
			return num;
		}
	},
	
	// CHECK LARGE NUMBER
	checkLargeNum(num) {
		return num >= this.LARGE_RESULT_NUMBER;
	},
	
	// RESULT MESSAGE
	printResultMessage(result, messageTagId) {
		if (this.checkLargeNum(result)) { $(messageTagId).css("color", this.LARGE_RESULT_COLOR); }
		$(messageTagId).html(result);
	},
	
	// CUSTOM ERROR MESSAGE
	printErrorMessage(messageTagId, color, message) {
		$(messageTagId).css("color", color);
		$(messageTagId).html(message);
	},
	
	// RESULT ARRAY MESSAGE
	printResultArrayMessage(array) {
		if (array.length < 1) { return; }
		let resultMessage = "";
		for (let i = 0; i < array.length; i++) {
			resultMessage += array[i];
			if (i + 1 !== array.length) {resultMessage += ', '; }
		}
		$("#resultArrayMessage").html("Result Array: [ " + resultMessage + " ]");
	}
}

// INITIATE INSTANCE OF calculation OBJECT
const calculationInstance = Object.create(calculation);