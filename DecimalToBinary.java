package com.jspiders.practice;

public class DecimalToBinary
{
	public static void main(String[] args) 
	
	
	{
		
		int i=0,dnum=1111,r=0,j;
		int arr[]=new int[20];
		while(dnum!=0)
		{
			r=dnum%2;
			arr[i++]=r;
			
			dnum=dnum/2;
			
		}
		
		for(j=i-1;j>=0;j--)
		{
			System.out.print(arr[j]);
		}
		
	}
}
