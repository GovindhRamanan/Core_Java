package com.module3.comparable_vs_comparator;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[] a= {new Circle(4),
					new Circle(2),
					new Circle(9)
					};
		System.out.println("Before Sorting");
		 for (Circle c:a)System.out.println(c);
		 System.out.println("After Sorting");
		//Arrays.sort(a);
		// for (Circle c:a)System.out.println(c);
		 
		 Arrays.sort(a,new Circlecomp());
		 for (Circle c:a)System.out.println(c);

	}

}
