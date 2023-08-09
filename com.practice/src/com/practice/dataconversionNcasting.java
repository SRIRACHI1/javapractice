package com.practice;

public class dataconversionNcasting {
	public static void main(String[] args) {
		
		//byte b = 127;
		int a = 257;
		
		byte b = (byte)a;
		//implicit
		double d = (7 + 2.5);
		
		//int num1 = (2 + 8.67);
		//System.out.println(num1); - 0/p=10
		//explicit
		float k = 5.6f;
		
		int i = (int) k;
		
		//type promotions
		byte b1 = 10;
		byte b2 = 30;
		
		int res = b1 * b2; 
		
		System.out.println(d);
		
		System.out.println(i);
		
		System.out.println(b);
		
		System.out.println(res);
	}

}
