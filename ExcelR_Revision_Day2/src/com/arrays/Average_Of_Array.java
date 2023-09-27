package com.arrays;

public class Average_Of_Array {

public static void main(String[] args) {
		
		int a[] = {90, 92, 99, 94, 80};
		
		int sum=0;
		
		for(int i=0; i<5; i++)
		{
			sum = sum + a[i]; 
		}
		
		
		
		System.out.println("Sum is :"+sum);
		int avg = sum/5;
		System.out.println("Average is :"+avg);

	}
}
