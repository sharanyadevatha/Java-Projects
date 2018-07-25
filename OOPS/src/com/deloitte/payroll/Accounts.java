package com.deloitte.payroll;

public class Accounts {
		public void processSalary(Employee employee) {
			if(employee != null) {
				
				if(employee instanceof ConfirmedEmployee) {
					((ConfirmedEmployee) employee).tranportFacilities();
				}
				 employee.netSalary();
			}
			else {
				System.out.println("WRONG EMP TYPE");
			}       
			
			
	}
}
