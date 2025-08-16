package com.jspiders.practice;

public class Demo2 {
	public static void main(String[] args) {
		
		int[] num={2,4,5,6,7,8,9};
		int i=0;
		int j=num.length-1;
		int k=j;
		for(i=0;i<=k;i++,j--){
			
			if(i>j){
				System.out.println("even length");
				break;
			}
			if(i==j){
				System.out.println("odd length");
				break;
			}
		    
			
			
		}
		
		
	}

}
