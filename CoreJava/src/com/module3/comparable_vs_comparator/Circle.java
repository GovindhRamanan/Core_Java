package com.module3.comparable_vs_comparator;

public class Circle implements Comparable {
	int radius;
	double circum;

	public Circle(int r) {
		radius = r;
		circum=2*3.14*r;
	}

	@Override
	public int compareTo(Object o) {
		Circle c=(Circle) o;
		return radius-c.radius;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle radius ["+radius+", "+circum+"]";
	}
	
	
}
