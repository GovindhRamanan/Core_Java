package com.module3.DataStructures.LinkedList;

public class DemoLinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add(96);
		l.add(55);
		l.add(17);
		l.add(38);
		System.out.println(l.size());
		for(int i=0;i<l.size();i++)System.out.println((Integer)l.get(i));

	}

}
