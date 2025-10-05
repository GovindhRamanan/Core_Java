package com.module1.interview_questions;
import java.util.Scanner;
public class NumberOfDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mon=new Scanner(System.in);
		System.out.println("Enter the month : ");
		int month =mon.nextInt();
		System.out.println("Enter the year : ");
		int year =mon.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 Days");
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 Days");
			break;
		case 2:
			if(year%400==0 || (year%4==0 && year%100!=0))
			{
				System.out.println("29 Days");
			}else{
				System.out.println("28 Days");
			}
			break;
		default:System.out.println("invalid input");
			
			
		

	   }
	}
}

