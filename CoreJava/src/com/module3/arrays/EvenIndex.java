package com.module3.arrays;

public class EvenIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,40,50};
		for(int i=0;i<a.length;i++) {
			if(i%2==0)
				System.out.println(a[i]);
		}

	}

}
