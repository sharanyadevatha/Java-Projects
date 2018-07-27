package com.deloitte.cui;

public class Subtraction extends Arithmetic {

	public Subtraction(int num1, int num2) {
		  super(num1, num2);

		 }
	@Override
	public int calculate() {
		if(num1>num2)
			return num1-num2;
		else if(num2>num1)
				return num2-num1;
		else
			return 0;
	}

}
