package com.module3.arrays;

import java.util.Arrays;

public class Zeros_back {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,0,5,0,3,0};
		int[] b=new int[a.length];
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0)b[count++]=a[i];
		}
		System.out.println(Arrays.toString(b));

	}

}
