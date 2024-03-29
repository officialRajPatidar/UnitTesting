package com.todo.service;

public class Calculator {

	public static int sum(int a, int b) {
		return a+b;
		
	}
	
	public static int product(int a, int b) {
		return a*b;
		
	}
	
	public static int sumAll(int ...num) {
		int s =0;
		for(int n:num) {
			s+=n;
		}
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
