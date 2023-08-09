package com.practice.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> lis = new Stack<Integer>();
		lis.push(19);
		lis.push(9);
		lis.push(28);
		lis.push(78);
		lis.push(89);
		lis.pop();
		Collections.sort(lis);
		Collections.reverse(lis);
		 Iterator<Integer> itr = lis.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
	}
}
