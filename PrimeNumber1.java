package com.jspiders.practice;

public class PrimeNumber1 {

	public static void main(String[] args) {
		int res=0,res1=1,flag=0;;
		
		for(int num=2;num<=150;num++){
			
			int count=0;
			for(int i=2;i<num;i++){
				
				if(num%i==0){
					count=1;
					break;
				}
			}
			if(count==0){
				res=num;
				int sum=res-2;
				if(sum==res1){
					System.out.println(++sum);
				}
				res1=res;
			}
		}
	}

}
