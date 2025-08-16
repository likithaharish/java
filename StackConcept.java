package com.jspiders.practice;

import java.util.Scanner;

public class StackConcept {
	static int stack[]=new int[6];
	static int top1=-1;
	static int top2=stack.length;
	static Scanner s=new Scanner(System.in);
	
	public static void main(String[] args) {
		int choice=0;
		
		do{
			System.out.println("enter ur choice");
			System.out.println("1:insert");
			System.out.println("2.display");
			System.out.println("3.delete");
			System.out.println("4.exit");
			choice=s.nextInt();
			
			switch(choice){
			      case 1:System.out.println("*****************************");
			    	     insert();
			    	     System.out.println("******************************");
			              break;
			              
			      case 2:System.out.println("********************************");
			    	     display();
			    	     System.out.println("********************************");
	                      break;
	                      
			      case 3:System.out.println("********************************");
			    	     delete();
			    	     System.out.println("**********************************");
	                     break;
	                     
			      
			
			}
			
		}while(choice<4);
		
		
		
		
		
	}
	
	static void insert(){
		
		int ch,ele;
		System.out.println("choose ur stack to insert element");
		System.out.println("1:top1 stack");
		System.out.println("2:top2 stack");
		ch=s.nextInt();
		
		if(ch==1){
			System.out.println("enter the element to be inserted in top1");
			ele=s.nextInt();
			if(top1+1==top2){
				System.out.println("stacks are overflow");
			}else{
				top1++;
				stack[top1]=ele;
				System.out.println("inserted sucessfully");
			}
			
			
			
			
		}
		else if(ch==2){
			System.out.println("enter the element to be inserted in top2");
			ele=s.nextInt();
			if(top2-1==top1){
				System.out.println("stack are overflow");
			}else{
				top2--;
				stack[top2]=ele;
				System.out.println("inserted sucessfully");
			}
			
		}else{
			System.out.println("Invalid input...try again later");
		}
		
	}
	
	
	
	static void display(){
		
		if(top1==-1){
			System.out.println("top1 stack is empty");
		}else{
			System.out.println("top1 stack contains");
			for(int i=0;i<=top1;i++){
				System.out.print(stack[i]+"\t");
				
			}
			System.out.println(" ");
			
			
		}
		
		
		if(top2==stack.length){
			System.out.println("top2 stack is empty");
		}else{
			System.out.println("top2 stack contains");
			for(int i=stack.length-1;i>=top2;i--){
				System.out.print(stack[i]+"\t");
				
			}
			System.out.println(" ");
			
		}
		
	}
	
    static void delete(){
    	
    	int del;
    	System.out.println("from which stack element should be deleted");
    	System.out.println("1:top1 stack");
    	System.out.println("2:top2 stack");
    	del=s.nextInt();
    	if(del==1){
    		
    		System.out.println(stack[top1]+" element deleted sucessfully");
    		top1--;
    	}
    	else if(del==2){
    		
    		System.out.println(stack[top2]+" element deleted sucessfully");
    		top2++;
    	}
    	else{
    		System.out.println("Invalid input...try again later");
    	}
		
	}

}
