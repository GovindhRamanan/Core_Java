package com.module1.practice;
import java.util.Scanner;
public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner v = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=v.nextInt();
		System.out.println("Enter the second number:");
		int b=v.nextInt();
		if (a>b) {
			System.out.println(a+" is the greatest");
		}
		else if (a<b) {
			System.out.println(b+" is the greatest");
		}
		else {
			System.out.println("Both are equal");
		}

	}
}
