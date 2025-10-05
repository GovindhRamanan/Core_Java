package com.module1.basics;
import java.util.*;
public class Arithmeticoperators {
	static int a;//instance variable
	static int b;//instance variable
	public static int add() {
		int c=a+b;
		return c;
	}
	public static int subtract() {
		int c=a-b;
		return c;
	}
	public static int multiply() {
		int c=a*b;
		return c;
	}
	public static int divide() {
		int c=a/b;
		return c;
	}
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number to perform operations:");
	 a=sc.nextInt();
	 b=sc.nextInt();
	 System.out.println(add());
	 System.out.println(subtract());   
	 System.out.println(multiply()); 
	 System.out.println(divide());
}

}