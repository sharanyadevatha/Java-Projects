package com.deloitte.cui;

public class Airport {
	public static void main(String[] args) {
		Airport metroAirport = new Airport();
		Helicopter copter = new Helicopter();
		Seaplane sPlane = new Seaplane();
		
		metroAirport.givePermissionToLand(copter);
		metroAirport.givePermissionToLand(sPlane);
	}
		
		private void givePermissionToLand(Flyer f){
			f.land();
		}
}

