 package com.module1.practice;

public class Looping {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {//semicolons are required and (statements, condition) is not mandatory
			System.out.println("Hi buddy");
		}
		int j=0;
		for(j=1;j<=5;) {
			System.out.println(j);
			j++;
			;//termination
		}//j=6
		System.out.println(j);
		for(int m=10;m>=1;m--) {
			System.out.println(m);// prints from 10 to 1
		}
		int m=10;
		for(System.out.println(m);m>=1;System.out.println("m")) {
			m--;// prints from 10 to 1
		}
	}

}
