package com.module3.arrays;

public class SecondMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {9,6,5,5,1,7,3,8,5,4};
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<min1) {
					min2=min1;
					min1=a[i];
				}
				else if(a[i]<min2 && a[i]!=min1)
					min2=a[i];
			}
		}
		System.out.println(min2);

	}

}
