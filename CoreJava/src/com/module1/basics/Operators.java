package com.module1.basics;

public class Operators {

	public static void main(String[] args) {
		//operators
		//precedence of operators
		/*
		 * ++ postfix -- postfix 
		 * ++ prefix  -- prefix    ! 
		 *  * / %
		 *  + -
		 *  >>   >>>   <<
		 *  > >= < <= == !=
		 *  & ^ |
		 *  && || ?:
		 *  ->
		 *  =
		 */
		
				int a=5,b=2;
				// Arithmetic Operators
				System.out.println("Arithmetic operators:");
				System.out.println(a+b);
				System.out.println(a-b);
				System.out.println(a*b);
				System.out.println(a/b);// if answer is in float decimals are ignored. Integer never repeats a float value.
				System.out.println(a%b);
				//Assignment Operator
				System.out.println("Assignment operators:");
				System.out.println(a+=b);//compound assignment
				System.out.println(a-=b);
				System.out.println(a*=b);
				System.out.println(a/=b);
				System.out.println(a%=b);
				System.out.println(a=b);
				//Relational Operators
				System.out.println("Relational operators:");
				System.out.println(a>b);
				System.out.println(a<b);
				System.out.println(a>=b);
				System.out.println(a<=b);
				System.out.println(a==b);
				System.out.println(a!=b);
				//Logical Operators
				System.out.println("Logical Operators:");//Short circuit  logical operator
				System.out.println(a==5 && b==3);
				System.out.println(a==5 || b==2);
				System.out.println(!(a==5 || b==2));// !--> Logical not operator
				//Bitwise Operators
				System.out.println("Bitwise Operators");
				System.out.println(a&b);//bitwise and
				System.out.println(a|b);//bitwise or
				System.out.println(a^b);//bitwise EX-or
				System.out.println(~a);//bitwise not				
				//Shift Operators
				System.out.println("Shift Operators");
				System.out.println(a>>3);//right shift
				System.out.println(a>>>3);//unsigned right shift(always add zero irrespective of sign)
				System.out.println(b<<2);//left shift
				//Unary Operators
				System.out.println("Unary Operators");
				int c=2;
				int d=++a-a+++b--+c++;
				System.out.println(c);
				System.out.println(d);

	}

}
