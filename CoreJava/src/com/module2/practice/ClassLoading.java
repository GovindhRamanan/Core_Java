package com.module2.practice;

public class ClassLoading {

	static {
		System.out.println("Static block");
	}
	public ClassLoading() {
		// TODO Auto-generated constructor stub
		System.out.println("Cons()");
		
	}
	public static void main(String[] args) throws ClassNotFoundException {// but telusko got no exception
		// TODO Auto-generated method stub
		Class.forName("ClassLoading");

	}

}
