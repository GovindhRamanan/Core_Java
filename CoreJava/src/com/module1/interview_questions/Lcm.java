package com.module1.interview_questions;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number a: ");
		int a=sc.nextInt();
		System.out.println("Enter a number b: ");
		int b=sc.nextInt();
		int gcd=1;
		for(int i =1; i<=a && i<=b;i++) {
			if(a%i==0 && b%i==0)gcd=i;
		}
		System.out.println("GCD of "+a+" , "+b+" is :"+gcd);
		int lcm=(a*b)/gcd;
		System.out.println("LCM of "+a+" , "+b+" is :"+lcm);
	}

}
