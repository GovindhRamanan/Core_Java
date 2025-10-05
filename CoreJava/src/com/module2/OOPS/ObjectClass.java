package com.module2.OOPS;

import java.util.Objects;

class Student{
	String name;
	int age;
	String city;
	String country;
	public Student(String name, int age, String city, String country) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Student name=" + name + ", age=" + age + ", city=" + city + ", country=" + country;
	}
	@Override
	public boolean equals(Object obj) {
		Student  s= (Student) obj;//downcasting
		return this.age == s.age && this.city.equals(s.city) && this.country.equals(s.country)
				&& this.name.equals(s.name);
	}
	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(city, other.city) && Objects.equals(country, other.country)
				&& Objects.equals(name, other.name);
	}
	*/
	
	
}
public class ObjectClass extends Object{//all classes extends Object class explicitly or implicitly (directly or indirectly through inheritance)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("Govindhramanan",21,"Sankarankovil","India");
		Student s2=new Student("Govindhramanan",21,"Sankarankovil","India");
		Student s3=new Student("Athena", 5, "Sankarankovil", "India");
		System.out.println(s1+"\n"+s2);//toString()
		System.out.println(s3.equals(s2));
	

	}

}
