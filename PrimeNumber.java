package com.jspiders.practice;

//prime number

public class PrimeNumber
{
public static void main(String[] args)
{

	int number =5; 
	int count=0;
	
	for(int i=2;i<=number/2; i++)
	{
		if(number%i==0)
		{
			count++;
		}
	
	}
	if(count==0)
	{
		System.out.println("the number is prime");
	}
	
	else
	{
		System.out.println("the number is not a prime");
	}
}
}
