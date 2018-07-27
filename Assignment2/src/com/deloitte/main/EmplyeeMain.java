package com.deloitte.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.deloitte.cui.EmplyeeBo;
import com.deloitte.cui.EmplyeeVo;

public class EmplyeeMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number od employees");
		int no = sc.nextInt();
		List<EmplyeeVo> arr = new ArrayList<EmplyeeVo>();
		//EmplyeeVo arr[] = new EmplyeeVo[no];
		EmplyeeBo empbo = new EmplyeeBo();
		
		for(int i=0; i < no; i++) {
			System.out.println("Enter empId, empname, annualincome");
			int empId= sc.nextInt();
			String name= sc.nextLine();
			arr[i].setAnnualIncome(sc.nextDouble());
			empbo.calincomeTax(arr[i]);
		}
		//Display all 
		for(EmplyeeVo emp  : arr)
		{
			System.out.println("empID"+emp.getEmpID());
			System.out.println("empName"+emp.getEmpName());
			System.out.println("AnnualIncome"+emp.getAnnualIncome());
			System.out.println("Income tax"+emp.getIncomeTax());
		}

	}
}
