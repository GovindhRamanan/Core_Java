package com.module2.OOPS;
//composition
class Engine{
	int cc;

	public Engine(int cc) {
		this.cc = cc;
	}
}
class Car1{
	String name;
	int num;
	Engine e;//has a
	public Car1(String name, int num,Engine e ) {
		this.name = name;
		this.num = num;
		this.e=e;//composition
	}
	void display() {
		System.out.println(name+" "+num+" "+e.cc);
	}
	
}
//aggregation
class Sim{
	String name;
	long num;
	public Sim(String name, long num) {
		this.name = name;
		this.num = num;
	}
	
}
class Phone{
	String phname;
	Sim s;
	public Phone(String phname ){
		this.phname = phname;
	}
	void insertSim(Sim s) {
		this.s = s;
	}
	void display() {
		System.out.println(phname);
		if(s.num!=0)
			System.out.println("Sim card detected"+" Phone num is "+ s.num);
		else
			System.out.println("Sim not found");
	}
	
}
public class Has_a_Relationship {

	public static void main(String[] args) {
		//Composition
		Car1 c=new Car1("Volkswagen",8976,new Engine(40000));//Engine e=new Engine(40000);
		c.e.cc=50000;
		c.display();

		//Aggregation
		Phone p=new Phone("Nokia");
		p.insertSim(new Sim(null,9655173854l));//Sim s=new Sim(null,0);
		p.display();
		System.out.println(p.s);
	}

}
