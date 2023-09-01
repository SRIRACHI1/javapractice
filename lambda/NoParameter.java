package com.lambda;
@FunctionalInterface
interface Sayable{
	public String say();
	//public Void say();
}
public class NoParameter {
	
	public static void main(String[] args) {
		Sayable s = ()->{
		  return "I have nothing to say.";
			//System.out.println("I have nothing to say.");
		};
		System.out.println(s.say());
		//s.say();
	}

}
