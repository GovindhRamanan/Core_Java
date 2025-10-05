package com.module3.array2D;

import java.util.Arrays;

public class SumOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,2,3},{4,5,6}};
		int[][] b= {{2,2,1},{9,2,1}};
		int[][] c=new int[2][3];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int []f:c)System.out.println(Arrays.toString(f));

	}

}
