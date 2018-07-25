package com.deloitte.main;

public class MainClass {
	public static void main(String[] args) {
		int[] arr1, arr2;
		
		arr1 = new int[]{1,2,3,4,5};
		arr2 = new int[5];
				
		System.arraycopy(arr1,0,arr2,0, arr1.length);
		
		for(int i:arr2)
		{
			System.out.print( i+"  ");
		}
	}

}
