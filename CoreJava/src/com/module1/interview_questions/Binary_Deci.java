package com.module1.interview_questions;

import java.util.Scanner;

public class Binary_Deci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");//binary to decimal conversion
		int binary=sc.nextInt();
		int deci=0;
		int prod=1;
		
		while(binary>0) {
		int bit=binary%10;
		deci+=(bit*prod);
		binary/=10;
		prod*=2;
		}
		System.out.println(deci);

	}

}
