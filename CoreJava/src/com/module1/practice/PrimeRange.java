package com.module1.practice;

public class PrimeRange {
	public static void primeNumRange(int start,int end,int count) {//2//13
		if(start>end) return;//3
		if(isPrime(start)) {//4//11-->false
			count++;
			if(count%2!=0)
			{
				System.out.println(start);
			}
		}
		primeNumRange(start+1,end,count);//12
	}
	public static boolean isPrime(int n)//5
	{      return isPrime(n,n/2);//6//10--> false
	}
	public static boolean isPrime(int n, int i) {//7
		if(i==1)return true;//8
		if(n<=1||n%i==0)return false;//9-->get exited for value 1
		return isPrime(n,i-1);
	}
	public static void main(String[] args) {
		primeNumRange(1, 100,0);//1

	}

}
