package com.module2.OOPS;

public class Constructor_Chaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new H1(10,20);
	}

}
class H1{
	H1(){
		System.out.println("H1");
	}
	H1(int i){
		this();
		System.out.println("H1(int i) "+i);
	}
	H1(int i,int j){
		this(10);
		System.out.println("H1(int i,int j)"+i+" "+j);
	}
}
