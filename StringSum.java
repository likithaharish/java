package com.jspiders.practice;

import java.util.Scanner;

public class StringSum {

	static String str;
	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the Sting");
		str=s.next();
		
		int sum=StringNumCal(str);
		
	}
	
	static int StringNumCal(String str2) {
		
		
		int res=0,count=0,sum=0;
		int num[]=new int[10];
		int j=0;
		for(int i=0;i<str.length();i++){
			char c=str2.charAt(i);
			
			
			if(c<'0'||c>'9'){
				if(count==1){
				j++;
				res=0;
				count=0;
				}
				
				continue;
			}else{
				
		    count=1;		
			res=res*10+(c-'0');
			num[j]=res;
			
			}
			
			
		}
		
		for(int i=0;i<=j;i++){
			sum=sum+num[i];
			
		}
		
		System.out.println("the total value in the string is= "+sum);
	
		return 0;
	}
	
	

}
