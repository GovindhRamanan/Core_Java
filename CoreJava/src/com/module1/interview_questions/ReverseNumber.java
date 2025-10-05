package com.module1.interview_questions;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");//1223-->3221
		int n=sc.nextInt();
		int rev=0;
		while(n>0) {
			int last=n%10;
			 //if(last==0) {
			// rev=last;
			// }
			rev=rev*10+last;
			n/=10;
		}
		System.out.println(rev);
	}

}
