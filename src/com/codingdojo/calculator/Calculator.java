package com.codingdojo.calculator;

public class Calculator implements java.io.Serializable{
	private double operandOne, operandTwo, result;
	private String operation;

	public Calculator() {
	}

	public void getResult() {
		System.out.println(this.operandOne + " " + this.operation + " " + this.operandTwo + " = " + this.result);
	}

	public void setResult(double result) {
		this.result = result;
	}
	
	public double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	
	public double getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		if(operation == "+" || operation =="-") {
			this.operation = operation;
		} else {
			System.err.println("Invalid Operation, must enter '+' or '-'");
		}
	}
	
	public void performOperation( ) {
		if(getOperation() == "+") {
			this.result = getOperandOne() + getOperandTwo();
		} else if (getOperation() == "-") {
			this.result = getOperandOne() - getOperandTwo();
		} else {
			System.err.println("Error. The operation must be '+' or '-'");
		}
	}



	
}
