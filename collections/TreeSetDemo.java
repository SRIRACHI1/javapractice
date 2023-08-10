package com.practice.collections;

import java.util.*; 

public class TreeSetDemo {

	 public static void main(String args[]){
		 
		  TreeSet<String> al=new TreeSet<String>();
		  al.add("Omkar");
		  al.add("Vijay");
		  al.add("Omkar");
		  al.add("Lokesh");

		  Iterator<String> itr=al.iterator();
		  while(itr.hasNext()){
		   System.out.println(itr.next());
		  }
	 }
}
