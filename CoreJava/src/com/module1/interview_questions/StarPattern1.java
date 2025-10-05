package com.module1.interview_questions;

public class StarPattern1 {

	/*
	*
	**
	***
	****
	*****
	****
	***
	**
	*
	*/
	public static void diamond1() {
	int n=5; int star =1;
		for(int i=1;i<=2*n-1;i++) {
			for(int j=1;j<=star;j++)System.out.print("*");
			if(i<n)star++;
			else --star;
			System.out.println();
		}
	}
	/*
	 *
	 * *
	 *  *
	 *   *
	 *    *
	 *   *
	 *  *
	 * *
	 *
	*/
	public static void diamondhollow1() {
		int n=5; int star =1;
		for(int i=1;i<=2*n-1;i++) {
			for(int j=1;j<=star;j++)
			{ 	if(j==1||i==j||i+j==2*n)
				System.out.print(" *");
			else System.out.print(" ");
				}
			if(i<n)star++;
			else --star;
			System.out.println();
		}
		
	}
	/*
	1
	121
	12321
	1234321
	123454321
	1234321
	12321
	121
	1

	 */
	public static void numberDiamond1() {
		int n=5; int num=1;
		for(int i=1;i<=2*n-1;i++) {
			int x=1;
			if(i<=n) {
				for(int j=1;j<=num;j++) {
					System.out.print(x);
					if(j<i)x++;
					else x--;
				}
			}
			else {
				for(int j=1;j<=num;j++) {
					System.out.print(x);
					if(j<2*n-i)x++;
					else x--;
				}
			}
			if(i<n)num+=2;else num-=2;
			System.out.println();
		}
	}
/*
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

 */
	public static void butterfly() {
		int n=5;int star=1;int space=2*n-2;
		for(int i=1;i<=2*n-1;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			for(int k=1;k<=space;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			if(i<n) {star++;space-=2;}
			else {star--;space+=2;}
			System.out.println();
		}
	}
/*
 
**********
 *******
  *****
   ***
    *
    *
   ***
  *****
 *******
*********
 
 */
	public static void sandGlass() {
		int n=5;int star=2*n-1;int space=0;
		for(int i=1;i<=n;i++) {
				for(int j=1;j<=space;j++) {
					System.out.print(" ");
					}
				for(int k=1;k<=star;k++) {
					System.out.print("*");
					}
				star-=2;
				space++;
				System.out.println();
			}
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
				}
				for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
				}
				System.out.println();
			}	
	}
	public static void PascalTriangle() {
		int n=5; int p=0;
		for(int i=1;i<=n;i++) {
			int x=1;
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				if(k==1||k==i) System.out.print(x+" ");
				else{
					p+=x;
					System.out.print(--p+" ");
				} 
				
			}
			p++;
			System.out.println();
		}
	}
	public static void main(String[] args) {
		//diamond1();
		//diamondhollow1();
		//numberDiamond1();
		//butterfly();
		//sandGlass();
		PascalTriangle();

	}
}