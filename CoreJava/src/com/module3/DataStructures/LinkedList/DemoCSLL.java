package com.module3.DataStructures.LinkedList;

public class DemoCSLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularSingle c=new CircularSingle();
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(40);
		System.out.println(c);
		c.insert(0, 5);
		System.out.println(c);
		c.insert(2, 15);
		System.out.println(c);
		c.insert(4, 35);
		System.out.println(c);
		c.remove(0);
		System.out.println(c);
		c.remove(5);
		System.out.println(c);
		c.remove(3);
		System.out.println(c);

	}

}
