package com.deloitte.cui;

import java.util.Comparator;

public class Employeesort implements Comparator<EmplyeeVo> {


	@Override
	public int compare(EmplyeeVo p1, EmplyeeVo p2) {
		
	        {
	            double tax1 = p1.getIncomeTax();
	            double tax2 = p2.getIncomeTax();

	            if (tax1 == tax2)
	                return 0;
	            else if (tax1 > tax2)
	                return 1;
	            else
	                return -1;
	        }
		
	}

}
