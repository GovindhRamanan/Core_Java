package com.module2.OOPS;

class Ex1{
	public static void m1() {//method hiding
		System.out.println("Static m1() in Ex1");
	}
	public void m2() {//method hiding
		System.out.println("Non-Static m2() in Ex1");
	}
	final void m3() {}
	
}
class Ex2 extends Ex1{
	public static void m1() {//method hiding m1() hides m1() of ex1
		System.out.println("Static m1() in Ex2");
	}
	public void m2() {//method hiding m2() hides m2() of ex1
		System.out.println("Non-Static m2() in Ex2");
	}
	// void m3() {} // final methods cannot be overridden
}
public class MethodHiding {
	final static int i=10;//final variables are constants in java
	//i=70; final variables cannot be reinitialized
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
final class Methods{
	
}
//class Method extends Methods{}   //CTE final class cannot be extended