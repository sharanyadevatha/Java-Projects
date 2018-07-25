package com.deloitte.cui;

public class Airplane extends Vehicle implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("Taking Off");
	}

	@Override
	public void land() {
		System.out.println("Landing");
	}

	@Override
	public void fly() {
		System.out.println("Flying");
	}

}
