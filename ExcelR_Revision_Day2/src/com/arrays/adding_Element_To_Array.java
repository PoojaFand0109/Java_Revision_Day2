package com.arrays;

public class adding_Element_To_Array {

public static void main(String[] args) {
		
		int a[] = {11, 12, 13, 14, 15};
		
		int sum=0;
		
		for(int i=0; i<5; i++)
		{
			sum = sum + a[i]; 
		}
		System.out.println("The sum is : "+sum);
	}
}
