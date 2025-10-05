package com.module2.OOPS;

public class Copy_Reference {
	public static void main(String[]args) {
		A1 a=new A1();
		A1 b=a;//copy reference
		a.i=10;
		a.j=10;
		System.out.println(b.i+" "+b.j);
		b.i=50;
		b.j=70;
		System.out.println(a.i+" "+a.j);
	}
}
class A1{
	int i;
	int j;
}
//Passing object as a parameter
class B1{
	public static void m1(A1 a) {
		System.out.println(a.i);
	}
	//Factory method
	public A1 m2(int i) {
		return new A1();
	}
	public static B1 m3() {
		return new B1();
	}
	public static void main(String[]args) {
		m1(new A1());//passing object
		A1 d=new A1();
		d.i=30;
		m1(d);//passing object's reference
		B1 h=new B1();
		h.m2(7);
		System.out.println(m3());//prints address
		
	}
}

