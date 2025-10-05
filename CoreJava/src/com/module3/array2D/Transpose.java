package com.module3.array2D;

import java.util.Arrays;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{2,2,1},{9,2,1}};
		int[][] b=new int[3][2];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				b[j][i]=a[i][j];
			}
		}
		for(int []f:b)System.out.println(Arrays.toString(f));

	}

}
