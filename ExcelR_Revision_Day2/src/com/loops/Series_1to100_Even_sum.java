package com.loops;

public class Series_1to100_Even_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		for(int i=1; i<=100; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println("Sum="+sum);
	}

}
