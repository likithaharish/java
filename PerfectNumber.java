package com.jspiders.practice;

public class PerfectNumber
{

	public static void main(String[] args)
	{
	
		int number=6; 
		int count=0;
		
		for(int i=1;i<=number/2; i++)
		{
			if(number%i==0)
			{
				count=count+i;
			}
		
		}
		if(number==count)
		{
			System.out.println(number +" is a perfect number");
		}
		
		else
		{
			System.out.println(number +" is not a perfect number");
		}
	}
}
