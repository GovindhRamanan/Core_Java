package com.module1.interview_questions;

public class HappyNum {

	public static void main(String[] args) {
		int n=23,m=n;
		int sum=0;
		while(n>0) {
			sum+=Math.pow(n%10, 2);
			n/=10;
			if(n==0) {
				n=sum;
				if(sum==1)System.out.println(m);
				else sum=0;
			}
			
		}

	}

}
