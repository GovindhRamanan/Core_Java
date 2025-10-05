package com.module2.OOPS;

public class This {

	int i;
	int j;
	public void m1(int i,int j) {
		i=i;
		j=j;
	}
	public void m2(int i,int j) {
		this.i=i;
		this.j=j;
	}
	public static void main(String[] args) {
		This th=new This();
		th.m1(10,10);
		System.out.println("The value before 'This' Current instance : "+th.i+" "+th.j);
		th.m2(500, 800);
		System.out.println("The value After 'This' Current instance : "+th.i+" "+th.j);
	}

}
