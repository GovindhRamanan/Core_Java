package com.module1.interview_questions;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=v.nextInt();
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact*=i;
		}
		System.out.println("Factorial of "+a+" = "+fact);

	}

}
