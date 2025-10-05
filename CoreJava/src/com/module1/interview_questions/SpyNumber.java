package com.module1.interview_questions;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");//1124=1+1+2+4=8, 1*1*2*4=8
		int n=sc.nextInt();
		int sum;
		int product=1;
		for(sum=0;n>0;n/=10)
		{
			sum+=n%10;
			product*=n%10;
		}
		if(sum==product)
		System.out.println("Spy number");
		else
			System.out.println("Not a Spy number");
	}

	}
