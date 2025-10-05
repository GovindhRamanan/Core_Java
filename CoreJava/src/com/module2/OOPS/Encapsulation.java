package com.module2.OOPS;
import java.util.*;
public class Encapsulation {
private int age;
private String name;
    public void getname(int age, String name) {
    	this.age=age;
    	this.name=name;
    }
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:");
		e.age = sc.nextInt();
		System.out.println("Enter the name:");
		sc.nextInt();

		e.name = sc.nextLine();
		System.out.println(e.age);
		System.out.println(e.name);

	}

}