package com.special_programs;

import java.util.Scanner;

public class Sum_Of_Individual_Numbers {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int r, sum=0;
		
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum = sum + r;
		}
		
		System.out.println("The sum is : "+sum);

	}

}
