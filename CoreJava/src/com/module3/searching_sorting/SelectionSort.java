package com.module3.searching_sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void selection(int[] a) {
		for(int i=0;i<a.length;i++)
		{	int smallindex=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[smallindex])
					smallindex=j;
			}
			int temp=a[i];
			a[i]=a[smallindex];
			a[smallindex]=temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {9,6,5,5,1,7,3,8,5,4,7};
		selection(a);
		System.out.println(Arrays.toString(a));

	}

}
