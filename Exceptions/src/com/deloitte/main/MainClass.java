package com.deloitte.main;

class IllegalAgeException extends Exception{
	@Override
	public String getMessage() {
			return "The age has to be above 18";
	}
	
}
class Voter{
	public void register(int age) throws IllegalAgeException{
		if(age<18)
		{
			throw new IllegalAgeException();
		}
		else
		{
			System.out.println("APPROPRIATE");
		}
	}
}
public class MainClass {
	public static void main(String[] args) {
	Voter voter = new Voter();

	try {
		voter.register(17);
		
		voter.register(22);
	} catch (IllegalAgeException e) {
		
		System.out.println(e.getMessage());
		//e.printStackTrace();
	
}
	}
}
