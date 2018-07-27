package com.deloitte.cui;

public class Division extends Arithmetic {

	
	public Division(int num1, int num2) {
		  super(num1, num2);

		 }
	@Override
	public void calculate() {
		if(num1!=0 && num2 !=0)
			System.out.println( (double)num1/num2);
		else {
			
			throw new ArithmeticException();
		}
		}
		
	}

//}
