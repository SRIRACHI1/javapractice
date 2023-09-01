package com.lambda;
interface A{
	void show();
}
//class Xyz implements A{
//	public void show() {
//		System.out.println("Hello");
//	}
//}
public class LambdaDemo1 {

	public static void main(String[] args) {
		A xx ;//Reference for interface
		xx= new A()//Creating object for the class
		{
			public void show()
			{
				System.out.println("Hello");
			}
		};
		xx.show();
	}
}
