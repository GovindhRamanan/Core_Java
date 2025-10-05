package com.module3.searching_sorting;

public class BinarySearch {
	//works only for sorted array
	public static int binary(int a[],int key) {
		int st=0;
		int end=a.length;
		while(st<=end) {
			int mid=(st+end)/2;
			if(a[mid]==key)return mid;
			else if(key<a[mid])end=mid-1;
			else st=mid+1;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6,7,8,9,0};
		System.out.println(binary(a, 5));
		

	}

}
