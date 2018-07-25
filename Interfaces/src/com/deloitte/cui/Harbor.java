package com.deloitte.cui;

public class Harbor {
	public static void main(String[] args) {
		Harbor bostonHarbor = new Harbor();
		RiverBarge barge = new RiverBarge();
		Seaplane sPlane = new Seaplane();
		
		bostonHarbor.givePermissionToLand(barge);
		bostonHarbor.givePermissionToLand(sPlane);
	}
		
		private void givePermissionToLand(Sailor s){
			s.dock();
		}
	

}
