package com.practice.collections;
import java.util.*;
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Honey");
		list.add("Suseel");
		list.add("Chinnu");
		list.add("Ramya");
		list.add("Suseel");
		list.add("Dog");
		list.add(2,"Ball");
	  List<String>	newList = List.of("Happy","sad");
	  list.addAll(newList);
	  list.set(2, "Fish");
	  list.remove(4);
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println(list.size());
	}

}
