package com.lambda;
interface Addable{
	int add(int a,int b);
}
public class TwoParameters {
public static void main(String[] args) {
	Addable a1 = (a,b)->(a+b);{
System.out.println(a1.add(20, 30));
Addable a2 = (a,b)->(a+b);
System.out.println(a2.add(40, 90));
	}
}

}
