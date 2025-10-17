package com.module3.collections;

import java.util.HashSet;
import java.util.Set;

public class Hashset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s=new HashSet<Integer>();
		//stores based on hash values
		s.add(40);
		s.add(30);
		s.add(20);
		s.add(10);
		s.add(50);
		System.out.println(s);

	}

}
