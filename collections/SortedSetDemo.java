package com.practice.collections;
import java.util.*;
public class SortedSetDemo {
	
public static void main(String[] args) {
	 SortedSet<String> sortedSet = new TreeSet<>();
	 //sortedset - interface
	 //treeset - class

	 sortedSet.add("Omkar");
	 sortedSet.add("Vijay");
	 sortedSet.add("Omkar");
	 sortedSet.add("Lokesh");

     Iterator<String> iterator = sortedSet.iterator();
     while (iterator.hasNext()) {
         System.out.println(iterator.next());
     }
}
}
