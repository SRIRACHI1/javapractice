package com.practice;

public class Logical {
	public static void main(String[] args) {
		
		int a = 7;
		int b =5;
		boolean res = a<b;
		
		System.out.println((a>b)&&(b<a));
		System.out.println((a>b)||(b>a));
		System.out.println(!res);
	}

}
