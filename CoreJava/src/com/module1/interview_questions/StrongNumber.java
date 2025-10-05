package com.module1.interview_questions;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");//145-->5!+4!+1!=145
		int n=sc.nextInt();
		int num=n;
		int sum=0;
		while(n>0) {
			int d=n%10;
			int fact=1;
			for(int i=1;i<=d;i++) {
				 fact*=i;
		    }
			sum+=fact;
			n/=10;
		}
		if(num==sum) {
			System.out.println("Strong number");
		}
		else {
			System.out.println("Not a Strong number");
		}

	}

}
