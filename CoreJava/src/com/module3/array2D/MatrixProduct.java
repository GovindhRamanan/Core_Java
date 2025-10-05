package com.module3.array2D;

import java.util.Arrays;

public class MatrixProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,2,1},{3,5,4},{2,3,1}};
		int[][] b= {{1,2,4},{4,2,1},{1,1,1}};
		int[][] c=new int[3][3];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i].length;k++)
					c[i][j]+=a[i][k]*b[k][j];
			}
		}
		for(int []f:c)System.out.println(Arrays.toString(f));

	}

}
