package com.practice.collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	
public static void main(String[] args) {
	Vector<String> lis = new Vector<String>();
	lis.add("Honey");
	lis.add("Chinnu");
	lis.add("Aruna");
	lis.add("Honey");
	lis.add("Aruna");
	 Iterator<String> itr = lis.iterator();
	 while(itr.hasNext()) {
		 System.out.println(itr.next());
	 }
}

}
