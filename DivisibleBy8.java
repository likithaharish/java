package com.jspiders.practice;

public class DivisibleBy8 {

	public static void main(String[] args) {
		int a = 16;
		for(int i=2;i<=100;i++){
			
			if((i%4==0)&&(i%2==1)&&(i%3==1)){
				System.out.println("divisible");
			}
			
		}
		
	}

}
