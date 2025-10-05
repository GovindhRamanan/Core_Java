package com.module1.interview_questions;

public class Swap_variable_no_temp {
	// WAP to swap among two variables without using temp variable
	public static void main(String[] args) {
				int a=10;
				int b=20;
				System.out.println("Before swapping");
				System.out.println("a value is "+a);//10
				System.out.println("b value is "+b);//20
				//logic
			     a=a+b;
			     b=a-b; 
			     a=a-b;
			     System.out.println("After swapping");
				 System.out.println("a value is "+a);//20
				 System.out.println("b value is "+b);//10
	}

}
