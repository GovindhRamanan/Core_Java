package com.module2.practice;

public class CopyReference {

	public static void main(String[] args) {
		A a=new A();
		A a1=a;
		System.out.println(a.i);
		System.out.println(a.j);
		a1.i=20;
		a1.j=98;
		System.out.println(a.i);
		System.out.println(a.j);

	}

}
class A{
	static int i=10;
	int j=70;
}
