package com.lambda;
interface Sayablees{
	public String say(String name);
}
public class OneParameter {
	
	public static void main(String[] args) {
		Sayablees s1 = (name) -> {
			return "Hello,"+name;
		};
		System.out.println(s1.say("Ramya"));
	    Sayablees s2 = name -> {
		return "Hello,"+name;
	};
	System.out.println(s2.say("Suseel"));
}

}
