package com.module1.interview_questions;

public class HarshadNum {

	public static void main(String[] args) {
		int n=18;
		int m=n;
		int sum=0;
		while(n>0) {
			sum+=n%10;
			n/=10;	
		}
		if(m%sum==0)System.out.println(m+" is a harshad number");
		else System.out.println("Not a harshad number");

	}

}
