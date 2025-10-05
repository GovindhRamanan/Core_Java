package com.module2.OOPS;

class Demo1{
	void m1() {
		System.out.println("m1() in Demo1");
	}
}
class Demo2 extends Demo1{
	@Override//Annotation- used to specify the what kind of methods is this.....
	 void m1() {
		System.out.println("m1() in Demo2");
	}
}
public class Overriding {

	public static void main(String[] args) {
		Demo2 d=new Demo2();
		d.m1();
		

	}

}
