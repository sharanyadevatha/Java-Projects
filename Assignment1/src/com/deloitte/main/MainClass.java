package com.deloitte.main;

import java.util.Scanner;

import com.deloitte.cui.Addition;
import com.deloitte.cui.Arithmetic;
import com.deloitte.cui.Division;
import com.deloitte.cui.Multiplication;
import com.deloitte.cui.Subtraction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainClass {



		public MainClass() {

		}

		public static void main(String[] args) {
			EmplyeeBo b = new EmplyeeBo();
			EmployeeSort s = new EmployeeSort();

			Scanner sc = new Scanner(System.in);

			System.out.println("enter the number of Employees");
			int number = sc.nextInt();

			ArrayList<EmplyeeVo> list = new ArrayList<EmplyeeVo>();

			try {
				for (int i = 0; i < number; i++) {
					System.out.println("enter The ID"+(i+1));
					int id = sc.nextInt();
					System.out.println("enter The EmpName"+(i+1));
					String EmpName = sc.next();
					System.out.println("enter The AnnualIncome"+(i+1));
					double annual = sc.nextDouble();
					list.add(new EmplyeeVo(id, EmpName, annual, 0));
					b.CalincomeTax(list.get(i));
				}
			} catch (Exception e) {
				
				System.out.println("enter correctly");
			}
			
			for (EmplyeeVo emplyeeVo : list) {
				System.out.println(emplyeeVo);
			}
			Collections.sort(list, s);
			
			System.out.println("sorted listed is");
			for (EmplyeeVo emplyeeVo : list) {
				System.out.println(emplyeeVo);
			}
			sc.close();

		}

	}

}
