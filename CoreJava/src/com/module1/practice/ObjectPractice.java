package com.module1.practice;

public class ObjectPractice {
	static int a;
	public int  add(int n1, int n2) {
		int c=n1+n2;
		return c;
	}
	public static void main(String[] args) {
		ObjectPractice op=new ObjectPractice();
		ObjectPractice op1=new ObjectPractice();
		a=5;
		System.out.println(op.add(5,5));
		System.out.println(a);
		

	}

}
