package com.module2.OOPS;
interface I1{//service specifier
	int a=10;//public static final int a=10;
	//I1(){} Interfaces cannot have constructors, {} Interfaces cannot have blocks(initializers),objects
	public static void main(String[] args) {

	}
	void m1();//public abstract void m1();
	
}
interface I2{
	int a=100;
	void m1();//this m1() need not to be overridden again.......Because according to I2 B has already overridden m1()....
	void m2();
}
class O1{
	void m1() {}//concrete method
	
}
class L1 extends O1 implements I1,I2{

	@Override
	public void m1() {//common to I1 and I2 and O1 also
		System.out.println(I1.a);
	}//service provider, implements I1,I2 by this we can achieve multiple inheritance...

	@Override
	public void m2() {
		System.out.println(I2.a);
		
	}
	
}
interface DefaultMeth{// interfaces can have default methods which concrete methods from jdk 1.8
	default void m1() {//access modifier is public and it can be overridden.....The main purpose of this method is to change the features without affecting existing implementation those are extending
		System.out.println("Hi default method in interface");
	}
}
interface StaticPrivateMeth{//interfaces can have static and private concrete methods ..... static from jdk 1.8 and private from jdk 1.9
	static void m1() {//access modifier is public and can't be overridden(static methods)...The main purpose of this method is the feature should be only used and not to implement their own
		System.out.println("Hi static method in interface ");
	}
	private static void m2() {//access modifier is private and can't be overridden(private methods) and access it.....can be called only with the name of interface
		System.out.println("Hi private method in interface");
	}
}
interface K1{
	//marker interface
}
interface K2{
	void m1();//functional interface- it contains only one abstract methods and can have n number of default,static, private methods....
	static void m2() {};
	private void m3() {};
	static void m4() {};
	default void m5() {};
}
public class Interfaces {//service user(another developer)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I1 i=new L1();
		i.m1();
		//i.m2();//CTE
		I2 i2=(I2)i;
		i2.m2();

	}

}
