package com.module1.basics;

public class LogicalOperators {

	public static void main(String[] args) {
		int a=10,b=20,c=a+b;
		boolean result = ((a>b && b<c) || (c!=a || b>a));
		System.out.println(result);

	}

}
