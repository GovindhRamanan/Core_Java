package com.module1.basics;

public class Comments_and_PlusOperator {//class declaration
//14-07-2025
		// (//-single line comment)
		/*
		  (/*...... Multiline
		   comment)*/
		//comments and functions of '+' operator
	//plus operator can only be used for variables and not for constants
			public static void main(String[] args) {
				System.out.println("Hello"+10);//Hello10
				System.out.println("Hello"+10+20);//Hello1020
				System.out.println(10+20+"Hello");//30Hello
				System.out.println('A'+10);//75 ASCI value of A-65
				System.out.println('A'+'d');//165 ASCI value of A-65
				System.out.println("A"+10);//A10
				System.out.println('A'+2);//67 ASCI value of A-65
				System.out.println('A'+'2');//ASCI value of A-65, 2-50

			}

		}
