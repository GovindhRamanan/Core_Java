package com.module1.interview_questions;

public class StrongNumRecursion {

	public static boolean isStrong(int n,int m,int sum) {
		if(n==0)return m==sum;
		sum+=fact(n%10,1);
		return isStrong(n/10,m,sum);
		
	}
	public static int fact(int i, int prod) {
		if(i==0) return 1*prod;
		return fact(i-1,prod*=i);
	}
	public static void main(String[] args) {
		System.out.println(isStrong(145, 145, 0));

	}

}
