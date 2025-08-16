package com.jspiders.practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Abc
{
	public static void main(String[] args) {
		

		HashSet h=new LinkedHashSet();
		h.add("10");
		h.add('a');
	    h.add(null);
		
		h.add("abc");
		h.add("abcdef");
		h.add("xyz");
		h.add("hello");
		
		h.add(100);
		
		
		for(Object o:h){
			System.out.println(o);
		}
}
}
