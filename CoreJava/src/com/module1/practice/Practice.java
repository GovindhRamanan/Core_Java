package com.module1.practice;

import java.util.Scanner;

public class Practice {
	int last;
	int sum;
	static int ip;
//Write a method to find sum of digits of a number and return its value. Call it multiple times for different values
	int sumOfDigits(int a) {
		 while(a>0) {
			 last=a%10;//get a last digit
			 sum=last+sum;
			 a/=10;//remove a last digit
		 }
		return sum;
	}
//Write a method to find whether a number is a two digit number. Return true or false.
	boolean twoDigit() {
		int i;
		for(i=1;i<=ip;i++) {
			last=ip%10;//get a last digit
			ip/=10;//removes a last digit
		}
		return i-1==2;
	}
	public static void main(String[] args) {
		//using local variable sum of digits done
		 Practice m=new Practice();
		 Scanner acc=new Scanner(System.in);
		 System.out.println("Enter the number to get its sum of digits: ");
		 m.sumOfDigits(acc.nextInt());//to access variable a from the method as user input
		 System.out.println(m.sum);
		 //using static variable checking of two digits is done
		 System.out.println("Enter the number to check whether its 2-digit number: ");
		 ip=acc.nextInt();
		 System.out.println(m.twoDigit());

	}

}
