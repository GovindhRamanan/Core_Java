package com.module1.interview_questions;

public class ArmstrongNumRecursion {
	static int n=408;
	static int l=(n+"").length();
	public static boolean isArm(int n, int m,int sum) {
		if(n==0)return m==sum;
		sum+=Math.pow(n%10,l);
		return isArm(n/10,m,sum);
	}
	public static void main(String[] args) {
		System.out.println(isArm(n,n,0));
	}


}
