package com.deloitte.cui;

public class HelloWorld {
	public String message1;
	public String message2;
	public HelloWorld() {
		System.out.println("Inside Hello World Contructor");
	}

	public void getMessage1() {
		System.out.println("Hello  message1  " + message1);
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}

	public void getMessage2() {
		System.out.println("Hello  message2  " + message2);
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}

}
