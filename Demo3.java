package com.jspiders.practice;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		
		int num,min=2;
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		
		while(num!=0){
			
			num=num-min;
			if(num==0){
				System.out.println("even number");
				break;
			}
			if(num==1){
				System.out.println("odd number");
				break;
			}
			
		}
		
		
		
		
		
	}

}
