package com.module3.array2D;

public class SecondMin {

	public static void main(String[] args) {
		int[][] a= {{1,4,6},{8,9,10}};
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]<min1) {
					min2=min1;
					min1=a[i][j];
				}
				else if(a[i][j]<min2 && a[i][j]!=min1)
					min2=a[i][j];
			}
		}
		System.out.println(min2);

	}

}
