package com.lambda;

public class ClassA {
 public static void main(String[] args) {
	Car c1 = new Car() {
		public void drive(int speed, String model) {
			// TODO Auto-generated method stub
			System.out.println("Driving "+ model +" "+ speed);
		}
	};
	c1.drive(80,"BMW");
	//with anonymous function
	Car c2 = (int speed, String model)->{
		//Car c2 = speed ->{
		//int speed = 80;
			System.out.println("Driving "+model);
			System.out.println("Car is Driving very smoothly");
			if(speed < 50)
			System.out.println("slow speed = "+speed);
			else if(speed >80)
				System.out.println("Normal speed = "+speed);
			else
				System.out.println("Rash driving");
	};
	c2.drive(80,"Tata");
    Audi a = new Audi();
	a.drive(80,"Audi");
}
}
class Audi implements Car {
	@Override
	public void drive(int speed, String model) {
		// TODO Auto-generated method stub
		System.out.println("Driving "+model);
	}
}
@FunctionalInterface
//only contains one abstract method
interface Car{ 
	//method
	public void drive(int speed, String model);
	
}