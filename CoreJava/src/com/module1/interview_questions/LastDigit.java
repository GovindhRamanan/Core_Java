package com.module1.interview_questions;
import java.util.Scanner;
public class LastDigit {

	public static void main(String[] args) {
		int m;
		Scanner get=new Scanner(System.in);
		System.out.println("Enter a number to get the last digit: ");
		m=get.nextInt();
		int last =m%10;
		System.out.println("The last digit is : "+last);

	}

}
