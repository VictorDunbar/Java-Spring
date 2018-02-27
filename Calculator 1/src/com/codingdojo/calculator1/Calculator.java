package com.codingdojo.calculator1;

public class Calculator implements java.io.Serializable {
	double operandOne;
	double operandTwo;
	char operation;
	double result;
	
	public Calculator() {
		
	}
	
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
		
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	
	public void setOperation(char operation) {
		this.operation = operation;
	}
	
	public void performOperation() {
		if(this.operation == '+') {
			this.result = this.operandOne + this.operandTwo;
		}
		else if(this.operation == '-') {
			this.result = this.operandOne - this.operandTwo;
		}
		else if(this.operation == '*') {
			this.result = this.operandOne * this.operandTwo;
		}
		else if(this.operation == '/') {
			this.result = this.operandOne / this.operandTwo;
		}
		else {
			System.out.println(this.operation + "is not a valid operation.");
		}
	}
	public double getResults() {
		return this.result;
	}
}


