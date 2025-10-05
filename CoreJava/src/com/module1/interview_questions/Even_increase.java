package com.module1.interview_questions;

public class Even_increase {
	//WAP to read a num from user and do the follow operation
	//-->if num is even then increment the num by 20
	//-->else decrement the num by 20
	public static void main(String[] args) {
		int num=99;
		if(num%2==0)
		{
			num+=20;
		}
		else
		{
			num-=20;
		}
		System.out.println(num);

	}

}
