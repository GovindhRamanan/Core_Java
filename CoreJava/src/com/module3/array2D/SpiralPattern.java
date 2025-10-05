package com.module3.array2D;

import java.util.Arrays;

public class SpiralPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n=5;
	char direction='r';
	int row=0;
	int col=-1;
	int[][] a=new int[n][n];
	for(int i=1;i<=n*n;i++) {
		switch (direction)
		{	
			case 'r':
			{	col++;
				a[row][col]=i;
				if(col==a.length-1||a[row][col+1]!=0)direction='d';
			}
			break;
			
			case 'd':
			{	row++;
				a[row][col]=i;
				if(row==a.length-1||a[row+1][col]!=0)direction='l';
			}
			break;

			case 'l':
			{	col--;
				a[row][col]=i;
				if(col==0||a[row][col-1]!=0)direction='u';
			}
			break;

			case 'u':
			{	row--;
				a[row][col]=i;
				if(a[row-1][col]!=0)direction='r';
			}
			break;
		}
	}
	//for(int[] h:a)System.out.println(Arrays.toString(h));
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++)
			System.out.print(a[i][j]+"\t");
		System.out.println();
	}




}

}
