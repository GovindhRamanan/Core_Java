package com.module1.interview_questions;

import java.util.Scanner;

public class NaturalNumbersSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to get the sum:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		System.out.println(sum);

	}

}
