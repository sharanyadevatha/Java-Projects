package com.deloitte.main;

public class MainClass {
	public static void main(String[] args) {
		int[] arr1, arr2;
		
		arr1 = new int[]{1,2,3,4,5};
		arr2 = new int[5];
		
		for(int i=0;i<5;i++)
		{
			System.arraycopy(arr1,i,arr2,i,1);
		}
		for(int i=0;i<5;i++)
		{
			System.out.print( arr2[i]+"  ");
		}
	}

}
