package com.module1.practice;

import java.util.Scanner;

public class SpyNumRecursion {

	public static void spyNumRange(int st,int end) {
		if(st>end) return;
		if(isSpy(st)) {
			System.out.println(st);
		}
		spyNumRange(st+1,end);
	}
	public static void spyNumBiggest(int st,int end) {
		if(st>end) return;
		if(isSpy(end)) {
			System.out.println(end);
			return;
		}
		spyNumBiggest(st,end-1);
	}
	public static void spyNumSmallest(int st,int end) {
		if(st>end) return;
		if(isSpy(st)) {
			System.out.println(st);
			return;
		}
		spyNumSmallest(st+1,end);
	}
	public static boolean isSpy(int n) {
		return isSpy(n,0,1);
	}
	public static boolean isSpy(int n,int sum,int prod) {
		if(n==0) return sum==prod;
		if(n>0) {
			sum+=n%10;
			prod*=n%10;
		}
		return isSpy(n/10, sum, prod);
		}
	public static void main(String[] args) {
		Scanner f=new Scanner(System.in);
		System.out.println("Enter the Range to find the spy numbers");
		spyNumRange(f.nextInt(), f.nextInt());
		System.out.println("Enter the Range to fin the largest spy number");
		spyNumBiggest(f.nextInt(), f.nextInt());
		System.out.println("Enter the Range to find the smallest spy number");
		spyNumSmallest(f.nextInt(), f.nextInt());
		

	}

}
