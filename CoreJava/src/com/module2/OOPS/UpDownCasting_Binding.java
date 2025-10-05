package com.module2.OOPS;
//Upcasting and early binding
class X{
	void m1() {
		System.out.println("M1() of X");
	}
}
class Y extends X{
	void m2() {
		System.out.println("M2() of Y");
	}
}



class Car{
	Car(){
		System.out.println("Hi Car");
	}
}
class BMW extends Car{
	BMW(){
		System.out.println("Hi BMW");
	}
}
class Audi extends Car{
	Audi(){
		System.out.println("Hi Audi");
	}
}
class Drive{
	void display(Car c) {
		System.out.println("Driving");
	}
}



//Upcasting and dynamic binding
class Animal1{
	void m1() {
		System.out.println("Hi m1 in Animal1");
	}
}
class Dog1 extends Animal1{
	@Override
	void m1() {
		System.out.println("Hi m1 in Dog1 bow bow");
	}
}
class Cat extends Animal1{
	@Override
	void m1() {
		System.out.println("Hi m1 in cat meow meow");
	}
}
class Demo{
	void display(Animal1 a) {
		a.m1();
	}
}




//Downcasting

class Animal2{}//hierarchical inheritance
class Dog2 extends Animal2{}
class Labrador extends Dog2{}
class Cat1 extends Animal2{}


public class UpDownCasting_Binding{

	public static void main(String[] args) {
		//Upcasting and early binding
		System.out.println("Upcast with early binding ex1:");
		X x=new Y();
		x.m1();//Early binding compiler decides
		//x.m2(); // CTE
		System.out.println("Upcast with early binding ex2:");
		Drive d=new Drive();
		d.display(new Audi());// Upcasting // Car c=new Audi()  //Early binding
		
		
		//Upcasting and Late binding
		System.out.println("Upcast with late binding ex1:");
		Demo f=new Demo();
		f.display(new Dog1());
		
		//Downcasting
		Animal2 s=new Labrador();
		//Cat1 c=(Cat1)s;//no compile time error but runtime exception as class cast exception  (com.module2.OOPS.Labrador cannot be cast to class com.module2.OOPS.Cat1)
		//Labrador l=s;//Type mismatch: cannot convert from Animal2 to Labrador
		Labrador l=(Labrador) s;//downcasting
		Dog2 h=l;//upcasting
		//Dog2 g=s;Type mismatch: cannot convert from Animal2 to Dog2
		Dog2 g=(Dog2) s;//downcasting
		
		

	}

}
