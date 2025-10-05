package com.module1.interview_questions;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number a: ");
		int a=sc.nextInt();
		System.out.println("Enter a number b: ");
		int b=sc.nextInt();
		int gcd=1;
		int big;
		big=(a>b)?a:b;
		for(int i =1; i<=big;i++) {
			if(a%i==0 && b%i==0)gcd=i;
		}
		System.out.println("GCD of "+a+" , "+b+" is :"+gcd);
		
		/* or
		 * for(int i =1; i<=num1 && i<=num2;i++) {
			if(a%i==0 && b%i==0)gcd=i;
		}
		System.out.println("GCD of "+a+" , "+b+" is :"+gcd); */

	}

}
