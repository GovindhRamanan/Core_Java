package com.module1.interview_questions;

public class Odd_even_without_modulus {
//WAP to check if a given number is even or odd
	public static void main(String[] args) {
		int a=10;
		if ((a&1)==0) //without modulus and division
		{
			System.out.println("The given variable is even");
		}
		else
		{
			System.out.println("The given variable is odd");
		}

	}

}
