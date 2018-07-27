package com.deloitte.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.deloitte.cui.Employeesort;
import com.deloitte.cui.EmplyeeBo;
import com.deloitte.cui.EmplyeeVo;

public class EmplyeeMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employees");
		int no = sc.nextInt();
		List<EmplyeeVo> arr = new ArrayList<EmplyeeVo>();
		//EmplyeeVo arr[] = new EmplyeeVo[no];
		EmplyeeBo empbo = new EmplyeeBo();
		Employeesort s = new Employeesort();
		
		
		try {
			for (int i = 0; i < no; i++) {
				System.out.println("enter The ID of employee  "+(i+1));
				int empId= sc.nextInt();
				System.out.println("enter The EmpName of employee  "+(i+1));
				String name= sc.next();
				System.out.println("enter The AnnualIncome of employee  "+(i+1));
				double annual = sc.nextDouble();
				arr.add(new EmplyeeVo(empId, name, annual, 0));
				empbo.calincomeTax(arr.get(i));
			}
		} catch (Exception e) {
			
			System.out.println("enter correctly");
		}
		
		//Display all 
		for(EmplyeeVo emp  : arr)
		{
			System.out.println("empID"+emp.getEmpID());
			System.out.println("empName"+emp.getEmpName());
			System.out.println("AnnualIncome"+emp.getAnnualIncome());
			System.out.println("Income tax"+emp.getIncomeTax());
		}
		
         Collections.sort(arr, s);
		
		System.out.println("sorted listed is");
		for (EmplyeeVo emplyeeVo : arr) {
			System.out.println(emplyeeVo);
		}
		sc.close();

	}
}
