package com.deloitte.payroll.main;

import com.deloitte.payroll.Accounts;
import com.deloitte.payroll.Employee;
import com.deloitte.payroll.HR;

public class MainClass {

	public static void main(String[] args) {
		
		 Accounts acc = new Accounts();
		 HR hr = new HR();
		 Employee employee;
		 
		 employee =  hr.recruit('I');
		 acc.processSalary(employee);
		 
		 employee =  hr.recruit('P');
		 acc.processSalary(employee);
		 
		 employee =  hr.recruit('C');
		 acc.processSalary(employee);
	}

}
