package com.module1.basics;

public class Recursion {

	static void m1(int i) {
		System.out.println(i);
		if(i>=3) return;
		m1(i++);//++i,i+1
		System.out.println(i);
	}
	//display n numbers
	static void display(int n) {
		if(n>10) return;
		System.out.print(n+" ");
		display(n+1);
	}
	static void display1(int start, int end) {
		if(start >end) return;
		System.out.print(start+" ");
		display1(start+1,end);
	}
	//sum of n numbers
	static int sum(int n) {
		if(n==1) return 1;
		return n+sum(n-1);
	}
	//factorial
	static int factorial(int n) {
		if(n==0||n==1) return 1;
		return n*factorial(n-1);
	}
	//sum its number
	static int sumofItsNumber(int n) {
		if(n<=9) return n;
		return sumofItsNumber(n/10)+(n%10);
	}
	//perfect number by ramana sir
	public static boolean isPerfect(int n, int i,int sum) {
		if(i>n/2) return sum==n;
		if(n%i==0) sum+=i;
		return isPerfect(n,i+1,sum);
	}
	//spy number
	public static boolean isSpy(int n,int sum,int prod) {
		if(n==0) return sum==prod;
		if(n>0) {
			sum+=n%10;
			prod*=n%10;
		}
		return isSpy(n/10, sum, prod);
		}
	
	//neon number
	public static boolean isNeon(int n, int sqr,int sum) {
		if(sqr==0) return sum==n;
		sum+=sqr%10;
		return isNeon(n,sqr/10,sum);
	}
	//palidrome
	public static boolean isPalindrome(int n,int m,int rev) {
		if(n==0) return m==rev;
		rev*=10+n%10;
		return isPalindrome(n/10,m,rev);
	}
	
	
	public static void main(String[] args) {
		
		

	}

}
