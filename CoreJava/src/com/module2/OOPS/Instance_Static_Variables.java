package com.module2.OOPS;

public class Instance_Static_Variables {

	static int i;//static variable-->0-->70-->10-->30
	//i=10;//CTE
	int j;//instance variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Instance_Static_Variables av=new Instance_Static_Variables();//object creation 1
		Instance_Static_Variables aw=new Instance_Static_Variables();//object creation 2
		i=70;
		System.out.println(i+" "+av.j);
		av.i=10;
		System.out.println(av.i+" "+av.j);
		av.j=20;
		aw.i=30;
		aw.j=40;
		System.out.println(av.i+" "+av.j);
		System.out.println(aw.i+" "+aw.j);
		
		
	}

}
