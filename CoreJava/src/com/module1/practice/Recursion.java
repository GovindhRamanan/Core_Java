package com.module1.practice;

public class Recursion {

	public static int sumOfNnum(int i,int sum) {//i=5-->1+2+3+4+5=15
		if(i<0)return sum;
		sum+=i;
		return sumOfNnum(i-1,sum);
	}
	public static int sumOfItsOwn(int i,int sum) {//i=1024-->1+0+2+4=7
		if(i==0)return sum;
		sum+=i%10;
		return sumOfItsOwn(i/10, sum);
	}
	public static boolean spy(int i,int sum,int prod) {//i=1124-->1*1*2*4=8=1+1+2+4
		if(i==0)return sum==prod;
		sum+=i%10;
		prod*=i%10;
		return spy(i/10,sum,prod);
	}
	public static int fact(int i,int prod) {//i=5-->5*4*3*2*1
		if(i==0) return prod;
		prod*=i;
		return fact(i-1,prod);
	}
	public static boolean strong(int i,int n, int sum) {//i=145-->1!+4!+5!
		if(i==0)return n==sum;
		sum+=fact(i%10,1);
		return strong(i/10, n, sum);
	}
	public static boolean perfect(int i,int n,int sum) {//6-->1,2,3 are factors 1+2+3=6
		if(n>i/2) return i==sum;
		if(i%n==0) sum+=n;
		return perfect(i,n+1,sum);
	}
	public static boolean isPrime(int n, int i) {
		if(i==1)return true;
		if(n<=1||n%i==0)return false;
		return isPrime(n,i-1);
	}
	public static int gcd(int n1,int n2,int gcd,int i) {//12-->1,2,3,4,6 and 16-->1,2,4,8 by Ramanan
		if(i>n1||i>n2)return gcd;
		if(n1%i==0 && n2%i==0) gcd=i;
		return gcd(n1,n2,gcd,i+1);
	}
	public static int gcd1(int n1,int n2,int gcd,int i) {//12-->1,2,3,4,6 and 16-->1,2,4,8 by Draksha
		int m=(n1>n2?n1:n2);
		if(i>m)return gcd;
		if(n1%i==0 && n2%i==0) gcd=i;
		return gcd(n1,n2,gcd,i+1);
	}
	public static void fibo(int first,int second,int n) {//0,1,1,2,3,5,8,13,.........
		if(n==0)return ;
		System.out.println(first);
		fibo(second,first+second,n-1);
	}
	public static int fibo1(int first,int second,int n) {//21
		if(n==0)return second-first;
		return fibo1(second,first+second,n-1);
	}
	public static int lcm(int n1,int n2,int i)
	{
		if(i%n1==0 && i%n2==0)return i;
		else return lcm(n1, n2, i+1);
	}
	public static String deciBin(int i,String s) {
		if(i<1)return s;
		s=i%2+s;
		return deciBin(i/2, s);
	}
	public static int decitobin(int n,int sum,int p) {
		if(n==0)return sum;
		sum+=(n%2)*p;
		return decitobin(n/2,sum,p*10);
	}
	public static boolean isArm(int n,int m,int sum,int p) {
		if(n==0)return p==sum;
		sum+=Math.pow(n%10, m);
		return isArm(n/10,m,sum,p);
	}
	public static boolean isAuto(int n,int sqr) {
		if(n==0)return true;
		if(n%10!=sqr%10) return false;
		return isAuto(n/10, sqr/10);
	}
	public static boolean isharshad(int n,int sum,int m) {
		if(n==0) return m%sum==0;
		sum+=n%10;
		return isharshad(n/10,sum,m);
	}
	public static boolean isHappy(int n,int sum) {
		if(n==0) {
			if(sum==1) return true;
			if(sum<10) return false;
			return isHappy(sum,0);
		}	
		sum+=Math.pow(n%10, 2);
		return isHappy(n/10, sum);
	}
	public static void main(String[] args) {
		//System.out.println(sumOfNnum(5,0));
		//System.out.println(sumOfItsOwn(1234,0));
		//Syst-em.out.println(spy(1124, 0, 1));
		//System.out.println(fact(5, 1));
		//System.out.println(strong(145, 145, 0));
		//System.out.println(perfect(6, 1, 0));
		//System.out.println(isPrime(97,97/2));
		//System.out.println(gcd(12, 16, 0, 1));
		//System.out.println(gcd1(16, 32, 0, 1));
		//fibo(0,1,9);
		//System.out.println("last val ");
		//System.out.println(fibo1(0,1,9));
		//System.out.println(lcm(3,6, 1));
		//System.out.println(deciBin(31,""));
		//System.out.println(decitobin(1, 0, 1));
		//System.out.println(isArm(153,(153+"").length(),0,153));
		//System.out.println(isAuto(15, 15*15));
		//System.out.println(isharshad(18,0,18));
		System.out.println(isHappy(19, 0));
		
		
	}

}
