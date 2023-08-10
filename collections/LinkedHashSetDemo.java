package com.practice.collections;

import java.util.*;  

public class LinkedHashSetDemo {
	 
	 public static void main(String args[]){  
	  LinkedHashSet<String> al=new LinkedHashSet<String>();  
	  al.add("Ramya");  
	  al.add("Suseel");  
	  al.add("Ramya");  
	  al.add("Chinnu");  
	  Iterator<String> itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	 }  
}
