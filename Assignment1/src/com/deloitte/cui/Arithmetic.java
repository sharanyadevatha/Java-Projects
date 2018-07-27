package com.deloitte.cui;

public abstract class Arithmetic {
	protected int num1, num2;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	Arithmetic(int n1, int n2){
		this.num1=n1;
		this.num2=n2;
		
	}
	Arithmetic()
	{
		
	}
	public abstract int calculate();
}
