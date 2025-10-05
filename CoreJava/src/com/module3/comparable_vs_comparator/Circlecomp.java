package com.module3.comparable_vs_comparator;

import java.util.Comparator;

public class Circlecomp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Circle c1=(Circle) o1;
		Circle c2=(Circle) o2;
		if(c1.circum-c2.circum>0) return 1;
		if(c1.circum-c2.circum<0)return -1;
		return 0;
	}

	

}
