package com.module3.searching_sorting;

public class LinearSearch {

	public static int linearSearch(int a[], int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] a= {9,6,5,5,1,7,3,8,5,4};
		System.out.println(linearSearch(a, 5));
	}
}
