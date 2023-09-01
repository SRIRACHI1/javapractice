package com.lambda;

@FunctionalInterface
interface Draws{
	void draw();
}
public class WithLambda {
	
	public static void main(String[] args) {
		int width=10;
		Draws dr = ()-> {
				System.out.println("Drawing "+width);
		};
			dr.draw();
	
	}

}
