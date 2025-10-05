package com.module2.OOPS;


//single- level inheritance
class A2{//parent or base or super class
	void royalEnfieldDiesel() {
		System.out.println("A2's Royal enfield diesel");
	}
}
class B2 extends A2{//b2 is a child of a2 child class-->derived or subclass
	void royalEnfieldInterceptor() {
		System.out.println("A2's Royal enfield Interceptor");
	}
}


//Multi level inheritance
class Animal{// animal is not a dog. so animal can't extends dog.
	void eat() {
		System.out.println("Animal can eat");
	}
}
class Dog extends Animal{//dog is a animal
	void bark() {
		System.out.println("Dog can bark");
	}
}
class Puppy extends Dog{//puppy is a dog and it's an animal
	void play() {
		System.out.println("Puppies can play");
	}
}
//Hierarchical  Inheritance
class Card{
	String name;
	long num;
	String exp;
	public void swipe() {
		System.out.println("Card swipe");
	}
}
class Creditcard extends Card{
	int cvv;
	int limit;
	public void pay() {
		System.out.println("Paid using credit card");
	}
	public void display_Details() {
		System.out.println("Card name : "+name);
		System.out.println("Card number : "+num);
		System.out.println("Card expiry : "+exp);
		System.out.println("Card cvv : "+cvv);
		System.out.println("Card limit : "+limit);
	}
}
class Debitcard extends Card{
	int balance;
}



public class Inheritance {
       public static void main(String[] args) {
    	
    	   
    	   
    	//single-level inheritance
		A2 a=new A2();
		a.royalEnfieldDiesel();
		//a.royalEnfieldInterceptor();// parent cannot access the child's properties
		B2 b=new B2();
		b.royalEnfieldInterceptor();
		b.royalEnfieldDiesel();//b is accessing a's method(child access parent's
		
		
		
		//Multilevel inheritance
		Animal ani=new Animal();
		ani.eat();
		//ani.bark();//CTE all animals can't bark
		Dog d= new Dog();
		d.eat();
		d.bark();
		Puppy p=new Puppy();
		p.eat();
		p.bark();
		p.play();
		
		
		//Hierarchical Inheritance
		Creditcard c= new Creditcard();
		c.name="Rupay";
		c.num=8979_2426_9078_8768l;
		c.exp="JAN-31";
		c.cvv=785;
		c.limit=50000;
		c.swipe();
		c.pay();
		c.display_Details();
		
		
		
	}
}
