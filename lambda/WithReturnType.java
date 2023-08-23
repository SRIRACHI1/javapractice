package com.lambda;

public class WithReturnType {
    public static void main(String[] args) {
        Audis a = new Audis();
        System.out.println(a.getSpeed());
    	Cars c2 = ()->
    			{
    		//Car c2 = speed ->{
    		int speed = 80;
    			System.out.println("Driving Tata");
    			System.out.println("Car is Driving very smoothly");
    			if(speed < 50)
    			System.out.println("slow speed = "+speed);
    			else if(speed >80)
    				System.out.println("Normal speed = "+speed);
    			else
    				System.out.println("Rash driving");
    			return speed;
    };
    System.out.println(c2.getSpeed());
    }
}

class Audis implements Cars {
    @Override
    public int getSpeed() {
        System.out.println("Driving Audi");
        return 50;
    }
}

@FunctionalInterface
interface Cars {
    int getSpeed();
}
