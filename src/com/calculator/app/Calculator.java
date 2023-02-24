package com.calculator.app;

public class Calculator {
// member variables / attributes
	private Double operandOne;
	private Double operandTwo;
	private String operation;
	
// constructor
	public Calculator() {}

	public Calculator(Double operandOne, Double operandTwo, String operation) {
		super();
		this.operandOne = operandOne;
		this.operandTwo = operandTwo;
		this.operation = operation;
	}

// getters and setters
	public Double getOperandOne() {
		return operandOne;
	}
	
	public void setOperandOne(Double operandOne) {
		this.operandOne = operandOne;
	}
	
	public Double getOperandTwo() {
		return operandTwo;
	}
	
	public void setOperandTwo(Double operandTwo) {
		this.operandTwo = operandTwo;
	}
	
	public String getOperation() {
		return operation;
	}
	
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public void getResults(Double result) {
		System.out.println("The operation equates to " + result);
	}
	
	
// other methods
	public void performOperation() {
		if (this.operation == "+") {
			Double finalCalculation = this.operandOne + this.operandTwo;
			getResults(finalCalculation);
		}
		else if (this.operation == "-") {
			Double finalCalculation = this.operandOne - this.operandTwo;
			getResults(finalCalculation);
		}
	}
	
}
