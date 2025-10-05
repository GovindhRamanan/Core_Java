package com.module3.DataStructures.ArrayList;

public class DemoArrayLists{
	public static void main(String[] args) {
		ArrayLists a=new ArrayLists();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		//for(int i=0;i<a.size();i++)System.out.println((Integer)a.get(i));
		a.add(0, 70);
		//for(int i=0;i<a.size();i++)System.out.println((Integer)a.get(i));
		a.remove(0);
		//for(int i=0;i<a.size();i++)System.out.println((Integer)a.get(i));
		System.out.println(a);
		for(int i=0;i<a.size();i++)System.out.println(a.get(i));
		
	}
}
