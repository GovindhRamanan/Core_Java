package com.module3.array2D;

public class PascalTriangle {

	public static void pascal(int[][]a) {
		for(int i=0;i<a.length;i++) {
			a[i]=new int[i+1];
			for(int j=0;j<a[i].length;j++) {
				if(j==0||i==j)a[i][j]=1;
				else
					a[i][j]=a[i-1][j-1]+a[i-1][j];
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int[][] a=new int[n][];
		pascal(a);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<a[i].length;k++) {
				System.out.print(a[i][k]+" ");
			}
			System.out.println();
		}

	}

}
