package com.deloitte.cui;

public class Addition extends Arithmetic {
	
	public Addition(int num1, int num2) {
		  super(num1, num2);

		 }
	

	@Override
	public void calculate() {
		
		System.out.println( num1+ num2);
	}

}
