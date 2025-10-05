package com.module3.searching_sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void bubble(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		int[] a= {9,6,5,5,1,7,3,8,5,4,7};
		bubble(a);
		System.out.println(Arrays.toString(a));
		
	}

}
