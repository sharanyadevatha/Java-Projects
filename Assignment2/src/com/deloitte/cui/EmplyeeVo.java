package com.deloitte.cui;

public class EmplyeeVo {
	private int empID;
	private String empName;
	private double annualIncome;
	private double incomeTax;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	public double getIncomeTax() {
		return incomeTax;
	}
	public void setIncomeTax(double incomeTax) {
		this.incomeTax = incomeTax;
	}
	
	public EmplyeeVo(int empID, String empName, double annualIncome, double incomeTax) {
		this.empID= empID;
		this.empName= empName;
		this.annualIncome= annualIncome;
		this.incomeTax = incomeTax;
	}
	
	@Override
	public String toString() {
		
		return "Employee ID : "+empID+"Employee Name "+empName+"AnnualIncome"+annualIncome+"Income Tax"+incomeTax;
}
	@Override
	public int hashCode() {
		
		return empID;
	}
	
	@Override
	public boolean equals(Object target) {
		EmplyeeVo emp = (EmplyeeVo) target;
		if(emp != null)
			
		if((this.empID == emp.empID) && this.empName ==emp.empName && this.annualIncome == emp.annualIncome && this.incomeTax == emp.incomeTax)
		{
			return true;
		}
		
			return false;
	}
	
	
}
