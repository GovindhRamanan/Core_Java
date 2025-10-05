package com.module1.interview_questions;

public class BinDeciRecursion {

	public static int deci(int n,int prod,int deci) {
		if(n==0) return deci;
		int c=n%10;
		deci=deci+prod*c;
		return deci(n/10,prod*2,deci);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(deci(0011, 1, 0));

	}

}
