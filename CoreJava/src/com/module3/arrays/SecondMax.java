package com.module3.arrays;

public class SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {9,6,5,5,1,7,3,8,5,4};
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]>max1) {
					max2=max1;
					max1=a[i];
				}
				else if(a[i]>max2 && a[i]!=max1)
					max2=a[i];
			}
		}
		System.out.println(max2);

	}

}
