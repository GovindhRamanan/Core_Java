package com.module2.OOPS;



//super
class Goat{
	int weight;
	int age;
	public void display(int weight,int age) {
		this.weight=weight;
		this.age=age;
		System.out.println(this.weight+" "+this.age+" Goat");
	}
}
class Lamp extends Goat{
	int weight;
	int age;
	public void show(int weight,int age) {
		this.weight=weight;
		this.age=age;
		display(this.weight*4,this.age*2);
		System.out.println("The current weight and age of lamp is: "+this.weight+" "+this.age);
		System.out.println("In future the lamp may become as weight and age of lamp is: "+super.weight+" "+super.age);
	}
	
}
//super()  or call to super
class A12{
	int i;
	int j;
	A12(int i, int j){
		this.i=i;
		this.j=j;
		System.out.println("A1 constructor");
	}
}
class B12 extends A12{
	int k;
	int l;
	B12(int i,int j, int k, int l){
		super(i,j);
		this.k=k;
		this.l=l;
		System.out.println("B1 constructor");
	}
}
public class Super_keyword {

	public static void main(String[] args) {
		//super
		Lamp l=new Lamp();
		l.show(16,2);
		//super()
		B12 b=new B12(10,20,30,40);
		System.out.println(b.i+" "+b.j+" "+b.k+" "+b.l);
	}
}
