package com.module2.OOPS;
abstract class AQ{//It can contain constructor,SB,NSB,main method,static variables,instance variables, abstract methods, concrete methods.....
	int a=10;
	static int hi=100;
	
	
	static {
		System.out.println("Abs AQ SB");
	}
	
	
	{
		System.out.println("Abs AQ NSB ");
	}
	
	
	AQ(){
		System.out.println("Hi abstract  AQ Con()");
	}
	
	
	
	abstract void m1();
	
	void m2() {//concrete methods--> methods with implementation{}
		
	}
	
	public abstract void mj();
	
	static void m3() {
		System.out.println("Vanakkam m3()");
	}
	//illegal modifiers
		//abstract public static void m5();//The abstract method m5 in type AQ can only set a visibility modifier, one of public or protected....
		//static,private,final methods  cannot be overridden and so it can't be abstract
	public static void main(String[] args) {
		//AQ v=new AQ();//Abstract class doesn't have object.... 
		m3();
	}
}
class BQ extends AQ{
	BQ(){
		//super();//virtually present here ....
		System.out.println("Hi BQ class cons()");
		System.out.println(super.a);
		System.out.println(super.hi);
		m1();
		super.m3();
		//super.mj();//using super keyword we can't call abs methods
		m3();
	}

	@Override
	void m1() {
		System.out.println("M1() in B class");
		
	}
	static void m3() {
		System.out.println("M3() in B class method hiding");
	}

	@Override
	public void mj() {//access modifier should be same or wider and not narrower
		System.out.println("MJ dance");
	}
	
}
public class Abstraction_AbsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BQ a=new BQ();

	}

}
