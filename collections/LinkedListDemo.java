package com.practice.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Honey");
		list.add("Ramya");
		list.add("Chinnu");
		LinkedList<String> listone = new LinkedList<String>(List.of("Suseel"));
		list.addAll(listone);
		LinkedList<String> listtwo = new LinkedList<String>(List.of("Rahul"));
		list.addAll(listtwo);
		LinkedList<String> listhree = new LinkedList<String>(List.of("Ananth"));
		list.addAll(listhree);
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
