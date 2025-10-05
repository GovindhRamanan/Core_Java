package com.module1.interview_questions;

public class Char_Operation {
/*WAP to read char input from user and do the following operation
 * -->if char input is equal to 'A' then display "Apple"
 * -->else if char input is equal to 'B' then display "Ball"
 * -->else if char input is equal to 'C' then display "Cat"
 * -->else if char input is equal to 'D' then display "Dog"
 * -->else display "invalid char input"
 * */
	public static void main(String[] args) {
		char input='B';
		
		if(input=='A') 
		{
			System.out.println("Apple");
		}
		else if(input=='B') 
		{
			System.out.println("Ball");
		}
		else if(input=='C') 
		{
			System.out.println("Cat");
		}
		else if(input=='D') 
		{
			System.out.println("Dog");
		}
		else
		{
			System.out.println("Invalid char input");
		}

	}

}
