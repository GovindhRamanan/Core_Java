package com.module1.interview_questions;

import java.util.Scanner;

public class PalindromeNumRecursion {

	public static void palNumRange(int st,int end) {
		if(st>end) return;
		if(isPalindrome(st)) {
			System.out.println(st);
		}
		palNumRange(st+1,end);
	}
	public static void palNumBiggest(int st,int end) {
		if(st>end) return;
		if(isPalindrome(end)) {
			System.out.println(end);
			return;
		}
		palNumBiggest(st,end-1);
	}
	public static void palNumSmallest(int st,int end) {
		if(st>end) return;
		if(isPalindrome(st)) {
			System.out.println(st);
			return;
		}
		palNumSmallest(st+1,end);
	}
	public static boolean isPalindrome(int n) {
		return isPalindrome(n,n,0);
	}
	public static boolean isPalindrome(int n,int m,int rev) {
		if(n==0) return m==rev;
		rev=(rev*10)+n%10;
		return isPalindrome(n/10,m,rev);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner f=new Scanner(System.in);
		System.out.println("Enter the Range to find the Palindrome numbers");
		palNumRange(f.nextInt(), f.nextInt());
		System.out.println("Enter the Range to find the largest Palindrome number");
		palNumBiggest(f.nextInt(), f.nextInt());
		System.out.println("Enter the Range to find the smallest Palindrome number");
		palNumSmallest(f.nextInt(), f.nextInt());

	}

}
