package com.module1.basics;

public class Methods {

	 void m1() {
		System.out.println("hi m1");
	}
	 static void m2() {
		 System.out.println("hi m2");
	 }
	 static int m3() {
		 System.out.println("hi m3");
		 return 10;
	 }
	 static void m4(int a) {
		 System.out.println(a);
	 }
	 static void m5(int a) {
		 System.out.println(a);
		 a*=2;
		 System.out.println(a);
	 }
	 static void m6(int a) {
		 System.out.println(a);
		 a*=2;
		 System.out.println(a);
		 return;
	 }
	 static void m6(int...a) {
		 System.out.println("Varargs");
		 
	 }
	public static void main(String[] args) {
		// Type casting
		int r=10;
		//byte b=a;//CTE
		byte b=(byte)r;//explicit narrowing
		double h=r;//auto widening/implicit widening
				
		
		Methods m=new Methods();
		m.m1();
		m2();
		System.out.println("hi main");
		System.out.println(m3());
		m3();
		int i=m3();
		System.out.println(i);
		int j=m3()*2;
		System.out.println(j);
		m4(7+8);
		m4('A');
		int u=18;
		m4(u);
		int a=10;
		m5(a);
		System.out.println(a);
		m6(a);
		System.out.println(a);
		
	}

}
