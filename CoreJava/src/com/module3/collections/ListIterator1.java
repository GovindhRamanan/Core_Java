package com.module3.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=new ArrayList<String>();
		l.add("Rohit");
		l.add("Dhawan");
		l.add("Kohli");
		l.add("Dhoni");
		l.add("Jaddu");
		
		
		ListIterator<String> li=l.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}System.out.println("+++++++++++++++++++");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}System.out.println("+++++++++++++++++++");
		while(li.hasNext())
		{
			if(li.next().equals("Kohli"))li.add("Raina");
		}
		System.out.println(l);
		/*
		 * while(li.hasNext()) { if(li.next().equals("Dhoni"))li.set("Rishab"); }
		 * System.out.println(l);
		 */
	}

}
