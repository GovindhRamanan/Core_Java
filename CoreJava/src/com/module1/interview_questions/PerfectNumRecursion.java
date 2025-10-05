package com.module1.interview_questions;

import java.util.Scanner;

public class PerfectNumRecursion {

	public static void perfectNumRange(int st,int end) {
		if(st>end) return;
		if(isPerfect(st)) {
			System.out.println(st);
		}
		perfectNumRange(st+1,end);
	}
	public static void perfectNumBiggest(int st,int end) {
		if(st>end) return;
		if(isPerfect(end)) {
			System.out.println(end);
			return;
		}
		perfectNumBiggest(st,end-1);
	}
	public static void perfectNumSmallest(int st,int end) {
		if(st>end) return;
		if(isPerfect(st)) {
			System.out.println(st);
			return;
		}
		perfectNumSmallest(st+1,end);
	}
	public static boolean isPerfect(int n) {
		return isPerfect(n,1,0);
	}
	public static boolean isPerfect(int n, int i,int sum) {
		if(i>n/2) return sum==n;
		if(n%i==0) sum+=i;
		return isPerfect(n,i+1,sum);
	}
	public static void main(String[] args) {
		Scanner f=new Scanner(System.in);
		System.out.println("Enter the Range to find the perfect numbers");
		perfectNumRange(f.nextInt(), f.nextInt());//range
		System.out.println("Enter the Range to find the Largest perfect numbers");
		perfectNumBiggest(f.nextInt(), f.nextInt());//biggest
		System.out.println("Enter the Range to find the Smallest perfect numbers");
		perfectNumSmallest(f.nextInt(), f.nextInt());//smallest

	}

}
