package com.module2.OOPS;

public class Copy_Constructor {

	public static void main(String[] args) {
		Z z1=new Z();
		Z z2=new Z(500);
		Z z3=new Z(z2);//copying the value of i from z2 to z3
		System.out.println(z2.i+" "+z3.i);
		

	}

}
class Z{
	int i;
	Z(){
		
	}
	Z(int i){
		this.i=i;
	}
	Z(Z z){
		this.i=z.i;
	}
}
