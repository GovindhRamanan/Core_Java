package com.module3.array2D;

public class SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,4,6},{8,9,10}};
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]>max1) {
					max2=max1;
					max1=a[i][j];
				}
				else if(a[i][j]>max2 && a[i][j]!=max1)
					max2=a[i][j];
			}
		}
		System.out.println(max2);
	}

}