package com.module1.interview_questions;

import java.util.Scanner;

public class DeciBin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");//decimal to binary conversion
		int deci=sc.nextInt();
		int temp=deci;
		int rev=0;
		System.out.print("The Binary value of "+temp+" from LSB to MSB is : ");
		while(deci>0) {
		int rem=deci%2;//to get the bit like 0,1
		System.out.print(rem);//printing the remainder 0011 but in left to right-->lsb to msb
		rev=rev*10+rem;
		deci/=2;
		}
		System.out.println("\nThe Binary value of "+temp+" from MSB to LSB is : "+rev);// printing from msb to lsb but without zeros

	}
	/*int n=ip;
	int bin=0;
	int i=1;
	while(n>0) {
	int bit =n%2;
	i*=10;
	n/=2;
	}*/
	}

