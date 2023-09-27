package com.loops;

import java.util.Scanner;

public class Table_printing {

	public static void main(String[] args) {
		int i, t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		for(i=1;i<=10;i++)
		{
			t=num*i;
			System.out.println(t);
		}
	}
}
