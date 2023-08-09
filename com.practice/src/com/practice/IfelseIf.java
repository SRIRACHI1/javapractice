package com.practice;

public class IfelseIf {

	public static void main(String[] args) {
		int x = 8;
		int y = 29;
		int z = 16;
		if((x>y)&&(x>z))
			System.out.println("Greatest of three is :"+x);
		//else if((y>x)&&(y>z))
		else if(y>z)
			System.out.println("Greatest of three is :"+y);
		//else if((z>x)&&(z>y))
		else
			System.out.println("Greatest of three is :"+z);

	}

}
