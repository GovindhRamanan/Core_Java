package com.module3.searching_sorting;

import java.util.Arrays;

public class MergeSort {

	public static void mergediv(int a[]) {
		int[] left;
		if(a.length%2==0) {
			left = new int[a.length/2];
		}
		else {
			left = new int[(a.length/2)+1];
		}
		if(a.length==1) return;
		int[] right=new int[a.length-left.length];
		for(int i=0;i<left.length;i++) {
			left[i]=a[i];
		}
		for(int j=0;j<right.length;j++) {
			right[j]=a[j+left.length];
		}
		//System.arraycopy(a, 0, left, 0, left.length);
		//System.arraycopy(a, left.length, right, 0, right.length);
		mergediv(left);
		mergediv(right);
		merge(left,right,a);
	}
	public static void merge(int[] left,int[] right,int[] a) {
		int i=0;
		int j=0;
		int k=0;
		while(i<left.length&&j<right.length) {
			if(left[i]>right[j]) {
				a[k]=right[j];
				j++;
				k++;
			}
			else {
				a[k]=left[i];
				i++;
				k++;
			}
		}
		while(i<left.length) {
			a[k]=left[i];
			i++;
			k++;
		}
		while(j<right.length) {
			a[k]=right[j];
			j++;
			k++;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int[] a= {9,6,5,5,1,7,3,8,5,4,7};
				mergediv(a);
				System.out.println(Arrays.toString(a));
	}

}
