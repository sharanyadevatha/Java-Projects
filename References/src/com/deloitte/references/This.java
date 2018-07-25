package com.deloitte.references;


public class This {
	public static void main(String[] args) {
		TestScoping scope = new TestScoping();
		scope.firstMethod();
	}

}
class TestScoping {
	private int i=1;
	
	public void firstMethod() {
		int i=4, j=5;
		
		this.i = i+j;
		System.out.println("i in firstMethod "+this.i);
		secondMethod(7);
	}
	public void secondMethod(int i) {
		int j=8;
		this.i = i+j;
		System.out.println("i in secondMethod "+this.i);
	}
}
