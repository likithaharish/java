package com.jspiders.practice;

public class BinaryToDecimal {
	
	public static void main(String[] args) {
		
		
		int bn=1111,sum=0,d=1;
		while(bn!=0)
		{
			int r=bn%10;
			sum =(d*r)+sum;
			d=d*2;
			bn=bn/10;
			
			
		}System.out.print(sum);
	}

}
