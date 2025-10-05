package com.module1.interview_questions;
import java.util.Scanner;
public class StarPattern {
	static int n;
	//*****
	//*   *
	//*   *
	//*   *
	//*****
	//hollow rectangle
	public static void star1() {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||j==1||j==n||i==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	//*****
	//** **
	//* * *
	//** **
	//*****
	public static void star2() {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||j==1||j==n||i==n||i==j||i+j==n+1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	/*
	 * 5*4*3*2*1 
	 * 5*4*3*2* 
	 * 5*4*3 
	 * 5*4* 
	 * 5 
	 */ 
	public static void star3() {
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				if(j%2==0) {
					System.out.print("*");
					System.out.print(j);
					System.out.print("*");
				}
				else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
	/*
	5*4*3*2*1
	5*4*3*2
	5*4*3
	5*4
	5
	*/
	public static void star4() {
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
					System.out.print(j);
					if(j!=i) {
					System.out.print("*");
					}
			}
			System.out.println();
		}
	}
	//*****
	//****
	//***
	//**
	//*
	public static void star5() {
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
					System.out.print("*");
					if(j!=i) {
					System.out.print("");
					}
			}
			System.out.println();
		}
	}
	//pyramid
	/*
	 *
    ***
   *****
  *******
 *********
	 */
	public static void star6() {
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
 /*
	*
   **
  ***
 ****
*****
*/

	public static void star7() {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/*
	 1
    112
   12123
  1231234
 123412345
	 */
	//understanding of pyramid with the values of i and j
	public static void star8() {
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<i;j++) {
				System.out.print(j);
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	/*
	1    
   123   
  12345  
 1234567 
123456789
	*/

	public static void star9() {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++) {
				System.out.print(j);
			}
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}//pratice
	public static void star10() {
		for(int i=1;i<=2*n-1;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {//need to be continued 
				System.out.print("*q");
			}
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
   /*
	A
   B1C
  D234E
 F56789G
HIJKLMNOP
*/
	public static void star11() {
		int f=5;
		int star=1;
		int space=2*f-1;
		char le='A';
		int num=1;
		for(int i=1;i<=space;i++) {
			for(int j=i;j<=f;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				if(k==1||i==f||k==star)
				System.out.print(le++);
				else {
					System.out.print(num++);
				}
			}
			System.out.println();
			space--;
			star+=2;}
	}
	
	
	/*
	12345
	54321
	12345
	54321
	12345
	*/
	public static void num1() {
		for(int i=1;i<=n;i++) {
			if(i%2!=0)
			{
				for(int j=1;j<=n;j++) 
				{
					System.out.print(j);
				}
			}else 
			{
				for(int j=n;j>=1;j--) 
				{
					System.out.print(j);
				}
			}
			
			System.out.println();
		}
	}
	//1	    2	3	4	5	
	//10	9	8	7	6	
	//11	12	13	14	15	
	//20	19	18	17	16	
	//21	22	23	24	25
	public static void num2() {
		int x=0;
		for(int i=1;i<=n;i++) {
			if(i%2!=0)
			{
				x=(i-1)*n;
				for(int j=1;j<=n;j++) 
				{
					x++;
					System.out.print(x+"\t");
				}
			}else 
			{ x=i*n;
				for(int j=1;j<=n;j++) 
				{
					System.out.print(x+"\t");
					x--;
				}
			}
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n:");
		n=sc.nextInt();
		//star1();
		//star2();
		//star3();
		//star4();
		//star5();
		//star6();
		//star7();
		//star8();
		//star9();
		//star10();
		//star11();
		//num1();
		//num2();
		
		
		
	}

}
