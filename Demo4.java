package com.jspiders.practice;

public class Demo4 {
	public static void main(String[] args) {
		
		int i,j;
		String a="madam";
		char ch[]=a.toCharArray();
		j=a.length()-1;
		
		
		for(i=0;i<=a.length()/2;i++,j--){
			
			
			if(ch[i]!=ch[j]){
				System.out.println("not polidrome");
				break;
			}
			if(i==j || i>j){
				System.out.println("polidrome");
				break;
			}
		}
		
		
		
	}

}
