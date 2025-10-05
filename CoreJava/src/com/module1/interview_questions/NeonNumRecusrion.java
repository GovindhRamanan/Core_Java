package com.module1.interview_questions;

import java.util.Scanner;

public class NeonNumRecusrion {

	public static void neonNumRange(int st,int end) {
		if(st>end) return;
		if(isNeon(st)) {
			System.out.println(st);
		}
		neonNumRange(st+1,end);
	}
	public static void neonNumBiggest(int st,int end) {
		if(st>end) return;
		if(isNeon(end)) {
			System.out.println(end);
			return;
		}
		neonNumBiggest(st,end-1);
	}
	public static void neonNumSmallest(int st,int end) {
		if(st>end) return;
		if(isNeon(st)) {
			System.out.println(st);
			return;
		}
		neonNumSmallest(st+1,end);
	}
	public static boolean isNeon(int n) {
		return isNeon(n,n*n,0);
	}
	public static boolean isNeon(int n, int sqr,int sum) {
		if(sqr==0) return sum==n;
		sum+=sqr%10;
		return isNeon(n,sqr/10,sum);
	}
	public static void main(String[] args) {
		Scanner f=new Scanner(System.in);
		System.out.println("Enter the Range to find the neon numbers");
		neonNumRange(f.nextInt(), f.nextInt());
		System.out.println("Enter the Range to find the  largest neon number");
		neonNumBiggest(f.nextInt(), f.nextInt());
		System.out.println("Enter the Range to find the smallest neon number");
		neonNumSmallest(f.nextInt(), f.nextInt());

	}

}
