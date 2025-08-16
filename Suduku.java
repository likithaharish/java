package com.jspiders.practice;

import java.util.Scanner;

public class Suduku {
	
	public static void main(String[] args) {
		
	   int arr[] =new int[9];
	   int i;
	   
	   for(i=0;i<9;i++){
		   
		   arr[i]=i+1;
	   }
	   
	   int sum1=0,sum2=0,sum3=0;
	   for(i=0;i<=8;i++){
		   
		   sum1=arr[i];
		   
		   for(int j=i+1;j<=8;j++){
			   
			   sum2=sum2+arr[j];
			   
			   for(int k=j+1;k<=8;k++){
				   
				   sum3=sum3+arr[k];
			   }
		   }
		   
	   }
	   

	   
	   
		   
			 
	   
		
	}

}
