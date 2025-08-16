package com.jspiders.practice;

public class Sample1 {

   Sample1(){
	   System.out.println("hi");
	   this.res();
	   
   }
   
   void res(){
	   this.res();
	   
	   System.out.println("good");
   }


}
