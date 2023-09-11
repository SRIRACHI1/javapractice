package com.springioc.demo;

public class MathServiceImpl implements MathService{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int divide(int a, int b) {
		if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
	}

}
