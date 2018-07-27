package com.deloitte.cui;

public class Subtraction extends Arithmetic {

	public Subtraction(int num1, int num2) {
		  super(num1, num2);

		 }
	@Override
	public void calculate() {
		if(num1>num2)
			System.out.println( num1-num2);
		else if(num2>num1)
				System.out.println( num2-num1);
		}

}
