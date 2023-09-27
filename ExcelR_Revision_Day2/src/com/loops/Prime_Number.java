package com.loops;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		int n, i;
		
		boolean go=false;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
	    n=sc.nextInt();
	   
	    
	    for( i=2; i<=n/2;i++)
	    {
	    	if(n%i==0) {
	    		go=false;
	    	}
	    	else {
	    		go=true;
	    	}
	    	
	    		
	    }
	    if(go)
	    {
	    	System.out.println("Number is prime");
	    }
	    else
	    {
	    	System.out.println("Number is not prime");
	    }
	    
	}
}
