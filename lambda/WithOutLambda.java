package com.lambda;
interface Drawable {
	
	void draw();	
}
public class WithOutLambda {
	
	public static void main(String[] args) {
		int width = 10;
		
		Drawable dr = new Drawable() {
		 public void draw() {
			 System.out.println("Drawing "+ width);
		 }
		};
		dr.draw();
		
	}

}
