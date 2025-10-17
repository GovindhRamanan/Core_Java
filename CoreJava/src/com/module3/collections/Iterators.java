package com.module3.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Iterators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s=new LinkedHashSet<Integer>();
		s.add(40);
		s.add(30);
		s.add(20);
		s.add(10);
		s.add(50);
		Iterator<Integer> i =s.iterator();
		while(i.hasNext()) {
			int n=i.next();
			if(n%2==0)i.remove();
		}
		System.out.println(s);
	}

}
