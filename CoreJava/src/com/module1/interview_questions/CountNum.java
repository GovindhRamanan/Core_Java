package com.module1.interview_questions;

import java.util.Scanner;

public class CountNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
		Scanner get=new Scanner(System.in);
		System.out.println("Enter a number to count: ");
		m=get.nextInt();
		int i=1;
		for(;m>0;i++) {
			m/=10;
		}
		
		System.out.println(i-1);

	}

}
