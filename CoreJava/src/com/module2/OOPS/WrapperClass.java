package com.module2.OOPS;

public class WrapperClass {
//Method Overloading using Wrapper class
	public static void m1(Integer i) {
		System.out.println("Integer i");
	}
	public static void m1(Object o) {
		System.out.println("Object o");
	}
	public static void main(String[] args) {
		//method overloading using wrapper class
		m1(10);
		
		
		System.out.println("AutoBoxing");
		//implicit -AutoBoxing
		int i=10;
		Integer j=i;
		System.out.println(i);
		System.out.println(j);
		//explicit-Boxing//before JDK 1.5
		int k=20;
		Integer l=Integer.valueOf(k);
		System.out.println(k);
		System.out.println(l);
		
		//implicit but deprecated
		Integer n=new Integer(k);//AutoBoxing before JDK 9
		Integer e=40;//AutoBoxing
		
		System.out.println("AutoUnboxing");
		//implicit -AutoUnBoxing
		Integer a=10;
		int b=a;
		System.out.println(a);
		System.out.println(b);
		
		//explicit-Boxing//before JDK 1.5
		Integer c=20;
		int d=c.intValue();
		System.out.println(c);
		System.out.println(d);
		
		//implicit but deprecated
		int p=new Integer(d);//AutoUnBoxing  before JDK 9
		

	}

}
