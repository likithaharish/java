package com.jspiders.practice;

public class Swapping
{
	public static void main(String[] args)
	{
	 int arr[] = {3,4,6,8,7};
	 int n= arr.length;
     int j=n-1;
     
	 for(int i=0;i<=n/2;i++)
	 {
		 
		if(i<j) 
		{
		 arr[j] = (arr[i]+arr[j]) - (arr[i]=arr[j]);
		 j--;
		}
	 }
	 
	 for(int i=0;i<n;i++)
	 {
		 System.out.print(arr[i]+" ");
	 }
	 
	}
}
