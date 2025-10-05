package com.module1.interview_questions;

public class Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='l';
		if(c>='A'&&c<='Z') {
			System.out.println("Upper case");
		}
		else {
			System.out.println("Lower case");
		}
		//char to num
		char p='2';
		if(p>='0'&&p<='9') {
			int n=p-'0';
			System.out.println(n);
		}
		else {
			System.out.println("not found");
		}
		//lower case to upper case
		char b='g';
		if(c>='a'&&c<='z') {
			b=(char)(b-32);
			System.out.println(b);
		}
		else {
			System.out.println("not found");
		}

	}

}
