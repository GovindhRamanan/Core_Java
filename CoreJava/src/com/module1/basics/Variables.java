package com.module1.basics;

public class Variables {
//12-07-2025
	public static void main(String[] args) {
		int a = 10;// 10 is a numeric literal
		int x=0xA;// storing hexadecimal number in int
		int y=0b01_111_000;// JDK 7.0 for storing binary numbers
		long u=91_96551_73854l;// _ is used instead of commas JDK 7.0
		int i=010;//storing octal number//8
		float k=314159e-05f;// storing in scientific notations
		a+=10;//a=a+10
		System.out.println("The value is "+ a);
		//variable declaration
		int var1;
		double var2;
		char var3;
		boolean var4;
		//variable initialization
		var1=125;
		var2=15.23;
		var3='A';
		var4=true;
		var1=232;//variable reinitialization
	    System.out.println("Var1="+var1);
		System.out.println("Var2="+var2);
		System.out.println("Var3="+var3);
		System.out.println("Var4="+var4);

	}

}
