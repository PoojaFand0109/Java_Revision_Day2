package com.special_programs;

import java.util.Scanner;

public class Palindrome_Number {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int temp = n;
		int r, sum=0, rev=0;
		
		while(n>0)
		{
			r=n%10;
			n=n/10;
			rev = rev * 10 + r;
		}
		
		if(rev==temp)
		{
			System.out.println("Number is Palindrome");
		}
		
		else
		{
			System.out.println("Number is Not-Palindrome");
		}

	}

}
