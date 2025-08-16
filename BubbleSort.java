package com.jspiders.practice;

public class BubbleSort {

	
	public static void main(String[] args)
	{
		int arr[]={1,66,88,54,12,21};
		int temp=0;
		int l=arr.length-1;
		
		for(int i=l;i>=0;i--)
		{
			for(int j=0;j<i;j++){
				if(arr[j]>arr[j+1])
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		
		for(int i=0;i<=l;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
