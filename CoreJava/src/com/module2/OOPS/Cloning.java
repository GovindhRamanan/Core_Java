package com.module2.OOPS;

class Address implements Cloneable{
	String city;
	String country;
	public Address(String city, String country) {
		this.city = city;
		this.country = country;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return city+" "+country;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
class Student1 implements Cloneable{
	String name;
	int age;
	Address address;
	public Student1(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+age+" "+address;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//return super.clone();//shallow clone
		Student1 s=(Student1)super.clone();//(super.clone() may returns an object or reference(object may be created inside clone()) but that is a type of object...so downcasting is required)
		//like Dog d=(Dog)super.m1();which is a factory method;
		 s.address=(Address)address.clone();//same as above but for address class
		return s;
	}
	
}
public class Cloning extends Object{

	public static void main(String[] args) throws CloneNotSupportedException {//remove to string method before deep clone and analyse the output..... after deep clone analyse output
		//shallow cloning
		Student1 s= new Student1("Vishal", 21,new Address("Chennai", "India"));
		Student1 s1=(Student1)s.clone();
		System.out.println(s);
		System.out.println(s1);
		
		
		System.out.println("After changing string(immutable) and int datatypes:");
		s1.name="Vijay";//string is immutable so it creates new space for another object properties
		s1.age=31;//primitive data type
		System.out.println(s);
		System.out.println(s1);
		
		//line no 39
		System.out.println("After changing address(city) mutable non primitive data type which will copy address and refers to the same space");
		s1.address.city="Singapore";//it affects both the s and s1
		System.out.println(s);
		System.out.println(s1);
		
		System.out.println("After changing address(city) mutable non primitive data type which will have specific address and refers to the specific space");
		s.address.city="Trivandrum";//it affects both the s and s1
		System.out.println(s);
		System.out.println(s1);
		
	}

}
