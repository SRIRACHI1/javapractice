package com.practice.collections;
import java.util.*; 

public class HashSetDemo {

	 public static void main(String args[]){  
	  HashSet<String> set=new HashSet<String>();  
	  set.add("Ramya");  
	  set.add("Chinnu");  
	  set.add("Ramya");  
	  set.add("Honey");  
	  Iterator<String> itr=set.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	 }  
}
