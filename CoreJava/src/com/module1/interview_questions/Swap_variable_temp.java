package com.module1.interview_questions;

public class Swap_variable_temp {
// WAP to swap among two variables using temp variable
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c;
		System.out.println("Before swapping");
		System.out.println("a value is "+a);//10
		System.out.println("b value is "+b);//20
		//logic
		/*
		 * c=a+b;
		 * a=c-a;
		 * b=c-b;
		 * System.out.println("After swapping");
		 * System.out.println("a value is "+a);//20
		 * System.out.println("b value is "+b);//10
		 * or
		 */		
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping");
		System.out.println("a value is "+a);//20
		System.out.println("b value is "+b);//10

	}

}

