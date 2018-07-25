package com.deloitte.cui;

public class Bird extends Animal implements Flyer  {

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
	public void buildNest() {
		System.out.println("Building Nest");

	}
	public void layEggs() {
		System.out.println("Laying Eggs");
		}
	}
	
