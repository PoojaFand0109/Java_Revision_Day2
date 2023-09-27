package com.loops;

public class series1to100_odd_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		for(int i=1; i<=100; i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println("Sum="+sum);
	}
}
