package com.module1.interview_questions;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");//121-->121
		int n=sc.nextInt();
		int m=n;
		int rev=0;
		while(n>0) {
			int last=n%10;
			rev=rev*10+last;
			n/=10;
		}
		if(rev==m) {
			System.out.println("Palindrome number");
		}
		else System.out.println("Not a Palindrome number");
	}

	}
