package com.module3.arrays;

public class MaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {9,6,5,5,1,7,3,8,5,4};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]>max)
					max=a[i];
			}
		}
		System.out.println(max);

	}

}
