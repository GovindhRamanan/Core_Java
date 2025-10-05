package com.module1.interview_questions;

import java.util.Scanner;

public class Fibonocci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the term: ");
		int n=sc.nextInt();
		int firstterm=0;
		int secondterm=1;
		System.out.print("The fibonacci series of "+n+" term is : ");
		for(int i=1;i<=n;i++) {
			System.out.print(firstterm+" ");
			int nextterm=firstterm+secondterm;
			firstterm=secondterm;
			secondterm=nextterm;
			
		}

	}

}
