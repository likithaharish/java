package com.jspiders.practice;

public class ReverseNumber
{
//reverse a number	
	
public static void main(String[] args)
{
	int num=2543;
	int sum=0, r=0;
	
	while(num!=0)
	{
		r=num%10;
		sum=(sum*10)+r;
		num=num/10;
	}
	System.out.println(sum); 
}
}
