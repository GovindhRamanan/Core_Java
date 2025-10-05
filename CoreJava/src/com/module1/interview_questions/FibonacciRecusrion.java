package com.module1.interview_questions;

public class FibonacciRecusrion {
	public static int fibo(int first,int second,int stop) {
		if(stop==0) return second+first;
		System.out.println(first);
		return fibo(second,first+second,--stop);
	}
	public static void main(String[] args) {

		fibo(0, 1,14);
	}

}
