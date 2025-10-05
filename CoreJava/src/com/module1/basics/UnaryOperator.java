
package com.module1.basics;

public class UnaryOperator {
//15-07-2025
	public static void main(String[] args) {
		 int c=0;
		 int d= ++c + c++;
		 System.out.println(c);//2
		 System.out.println(d);//2 
		 int a=0; 
		 a++;
		 System.out.println(a);
		 a=++a;
		 System.out.println(a);
		int z=0;
		z=++z;
		z=++z;
		z=z++;
		z=z++;
		System.out.println(z);

	}

}
