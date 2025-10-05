package com.module3.searching_sorting;

import java.util.Arrays;

public class QuickSort {

	public static void quicksort(int[] a,int start,int end) {
		if(start>end)return;
		int i=start;
		int j=end;
		if(i<j) {
			int pivot=(start+end)/2;
			while(a[i]<a[pivot])i++;
			while(a[pivot]<a[j])j--;
		}
		if(i<=j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		quicksort(a,start,j);
		quicksort(a,i,end);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {9,6,5,5,1,7,3,8,5,4,7};
		quicksort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));

	}

}
