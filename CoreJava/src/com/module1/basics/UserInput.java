package com.module1.basics;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		String a,c;
		Scanner sn=new Scanner(System.in);//object creation
		System.out.println("Enter the value of a: String");
		a=sn.nextLine();
		System.out.println("The value of a is: "+a);
		int b;
		System.out.println("Enter the value of b: Int ");
		b=sn.nextInt();
		System.out.println("The value of b is: "+b);
		System.out.println("Enter the value of c: String");
		c=sn.next();
		System.out.println("The value of c is: "+c);

	}

}
