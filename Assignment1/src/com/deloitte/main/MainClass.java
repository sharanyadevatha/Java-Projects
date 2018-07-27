package com.deloitte.main;

import java.util.Scanner;

import com.deloitte.cui.Addition;
import com.deloitte.cui.Arithmetic;
import com.deloitte.cui.Division;
import com.deloitte.cui.Multiplication;
import com.deloitte.cui.Subtraction;

public class MainClass {
	public static void main(String[] args) {
		int num1 , num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		num1 = sc.nextInt();
		System.out.println("Enter second number");
		num2 = sc.nextInt();
		
		Arithmetic[] arr= new Arithmetic[5];
		arr[1] = new Addition(num1, num2);
		arr[2] = new Subtraction(num1, num2);
		arr[3] = new Multiplication(num1, num2);
		arr[4] = new Division(num1, num2);
		
		System.out.println("Enter 1 for additon , 2 for subtraction, 3 for multiplication, 4 for division");
		int choice  = sc.nextInt();
		
		int ans = arr[choice].calculate();
		System.out.println("Answer is "+ ans);
		sc.close();
		
	}

}
