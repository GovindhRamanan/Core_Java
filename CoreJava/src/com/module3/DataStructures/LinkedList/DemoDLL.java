package com.module3.DataStructures.LinkedList;

public class DemoDLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedLists l=new DoublyLinkedLists();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		//System.out.println(l.get(3));
		System.out.println(l);
		//l.remove(5);
		l.insert(5, 55);
		System.out.println(l);
		l.reverse();
		System.out.println(l);
		/*
		 * System.out.println(l.size()); System.out.println(l);
		 */

	}

}
