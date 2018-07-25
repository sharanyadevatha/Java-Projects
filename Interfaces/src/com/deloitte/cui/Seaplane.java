package com.deloitte.cui;

public class Seaplane extends Airplane implements Sailor {

	@Override
	public void dock() {
		System.out.println("Docking");

	}

	@Override
	public void cruise() {
		System.out.println("Cruising");

	}

}
