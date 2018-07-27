package com.deloitte.cui;

public class EmplyeeBo {
	public void calincomeTax(EmplyeeVo emp)
	{
		double annualIncome = emp.getAnnualIncome();
		double incomeTax;
		incomeTax = 10/100 * annualIncome;
		emp.setIncomeTax(incomeTax);
		
	}

}

		
