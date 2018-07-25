package com.deloitte.cui;

public class Superman extends Kryptonian implements Flyer {

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
	public void leapBuilding() {
		System.out.println("Leaping Building");
	}
	public void stopBullet() {
		System.out.println("Stopping Bullet");
	}

}
