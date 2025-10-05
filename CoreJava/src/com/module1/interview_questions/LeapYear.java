package com.module1.interview_questions;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);
		System.out.println("Enter the year to check whether its leap year or not: ");
		int a=v.nextInt();
		if((a%400==0)||(a%4==0 && a%100!=0))
				{
			System.out.println(a+" is a leap year");
		}
		else {
			System.out.println(a+" is not leap year");
		}

	}

}
