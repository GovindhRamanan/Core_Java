package com.module1.interview_questions;

public class DeciBinRecursion {

	public static String deciBin(int n,int rem) {
		String s="";
		if(n==0) return s;
		rem=(n%2);
		s=s+rem;
		System.out.print(s);
		return deciBin(n/=2,rem);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(deciBin(12, 0));

	}

}
