package com.module1.basics;

public class Variable_JAVABasics {
	int a;//Instance variable
	static int b;//Static variable
	public Variable_JAVABasics() {//Constructor-non parameterized
		System.out.println("CONSTRUCTOR: The constructors are special method which the name of the method should be with name of class.It is used to declare static and instance variable");	
	    System.out.println("It can be of two types: parameterised and non parameterised. The above constructor is an example of non-parameterised constructor.");
	}
	
	{//block
		System.out.println("The block can be executed whenever the object is created");
	}
	public static void m1() {   //Static method
		String name= "GOVINDH RAMANAN"; //Local variable
		System.out.println("STATIC METHOD: Static method does need any object or reference variable to print ");
		System.out.println("LOCAL VARIABLE: The variable declared with in the method is known as local variable");
	}
	public void m2() {  //Instance method
		System.out.println("INSTANCE METHOD: Instance method can be printed by creating an object and calling it with reference variable");
	}

	public static void main(String[] args) {
		Variable_JAVABasics v = new Variable_JAVABasics();
         m1();//Since it is a static method it does not require any object reference
         v.m2();
	}

}