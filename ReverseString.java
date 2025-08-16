package com.jspiders.practice;

import java.util.Scanner;

public class ReverseString {
		static StringBuffer s1=new StringBuffer("good");

	public static void main(String[] args) {
		
		 
		int i,j,k;
		char r;
		k=s1.length()-1;
		j=k;
		for(i=0;i<=k;i++){
			if(i<j){
			r=s1.charAt(j);
			s1.setCharAt(j,s1.charAt(i));
			s1.setCharAt(i, r);
			
			
			
			
			j--;
			}
			
		}
		System.out.println(s1);
		
		
		
		
	}

}
