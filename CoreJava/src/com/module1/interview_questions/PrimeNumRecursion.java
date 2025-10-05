package com.module1.interview_questions;

import java.util.Scanner;

public class PrimeNumRecursion {

	public static void primeNumRange(int start,int end) {
		if(start>end) return;
		if(isPrime(start)) {
			System.out.println(start);
		}
		primeNumRange(start+1,end);
	}
	public static void primenumBiggest(int start,int end) {
		if(start>end) return;
		if(isPrime(end)) {
			System.out.println(end);
			return;
		}
		primenumBiggest(start,end-1);
	}
	public static void primenum_nth_Biggest(int start,int end,int count) {
		if(start>end) return;
		if(isPrime(end)) {
			count++;
			if(count==2)//2nd largest prime//count%2!==0 for alternative primenumbers
			{System.out.println(end);
			return;
			}
		}
		primenum_nth_Biggest(start,end-1,count);
	}
	public static void primenumSmallest(int start,int end) {
		if(start>end) return;
		if(isPrime(start)) {
			System.out.println(start);
			return;
		}
		primenumSmallest(start+1,end);
	}
	public static void primenum_nth_Smallest(int start,int end,int count) {
		if(start>end) return;
		if(isPrime(start)) {
			count++;
			if(count==2)//2nd smallest prime//count%2!==0 for alternative primenumbers
			{System.out.println(start);
			return;
			}
		}
		primenum_nth_Smallest(start,end-1,count);
	}
	public static boolean isPrime(int n)
	{      return isPrime(n,n/2);
	}
	public static boolean isPrime(int n, int i) {
		if(i==1)return true;
		if(n<=1||n%i==0)return false;
		return isPrime(n,i-1);
	}
	public static void main(String[] args) {
		Scanner f=new Scanner(System.in);
		System.out.println("Enter the Range to find the prime numbers");
		primeNumRange(f.nextInt(), f.nextInt());//range
		System.out.println("Enter the Range to find the Largest prime number");
		primenumBiggest(f.nextInt(), f.nextInt());//biggest
		System.out.println("Enter the Range to find the  2nd Largest prime number");
		primenum_nth_Biggest(f.nextInt(), f.nextInt(), f.nextInt());//2nd_biggest
		System.out.println("Enter the Range to find the Smallest prime number");
		primenumSmallest(f.nextInt(), f.nextInt());//smallest
		System.out.println("Enter the Range to find the 2nd Smallest prime number");
		primenum_nth_Smallest(f.nextInt(), f.nextInt(), f.nextInt());//2nd smallest
		System.out.println(isPrime(2, 2/2));
	}

}
