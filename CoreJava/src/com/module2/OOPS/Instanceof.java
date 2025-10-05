package com.module2.OOPS;

class First{}// single level with two childs
class Second extends First{}
class Third extends First{}

public class Instanceof {

	public static void main(String[] args) {
		First f=new Second();
		System.out.println(f instanceof Second);//True
		System.out.println(f instanceof First);//True
		System.out.println(f instanceof Third);//False
		

	}

}
