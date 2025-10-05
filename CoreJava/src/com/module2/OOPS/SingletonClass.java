package com.module2.OOPS;

class P{
	private P() {}
	static P a;
	public static P get() {
		if(a==null) {
			a=new P();
			return a;
		}
		return a;
	}
	/*
	 * public static void main(String[] args) {
	 
		A a=new A();
		A b= new A();
	}*/
}
class Theatre{
	int  tickets=100;
	static Theatre a;
	private Theatre() {}
	public static Theatre get() {
		if(a==null) {
			a=new Theatre();
			return a;
		}
		return a;
	}
	public void bookTickets(int n) {
		if(n>tickets)System.out.println(n+" Seats are not available");
		else{tickets-=n;
		System.out.println(n+" Seats booked");
		System.out.println(tickets+" seats remaining");}
	}
}
public class SingletonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A a=new A();//CTE private constructor is not visible outside the class
		P a=P.get();//accessing static method using class name
		
		
		//Theatre class
		Theatre user1=Theatre.get();
		Theatre user2=Theatre.get();
		Theatre user3=Theatre.get();
		Theatre user4=Theatre.get();
		user1.bookTickets(100);
		user2.bookTickets(50);
		user3.bookTickets(30);
		user4.bookTickets(20);
		user1.bookTickets(20);

	}

}
