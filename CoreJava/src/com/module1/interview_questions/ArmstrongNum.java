package com.module1.interview_questions;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		int num=n;
		int count=0;
		while(n>0) {
			count++;
			n/=10;
		}
		n=num;
		int sum=0;
		while(n>0) {
			int d=n%10;
			int prod=1;
			for(int i=1;i<=count;i++) {
				prod*=d;
			}
			sum+=prod;
			n/=10;
		}
		if(sum==num)System.out.println("Armstrong number");
		else 
			System.out.println("Not an Armstrong number");
		
		
		/*int n=153;
		 * int count=(n+"").length();
		 * System.out.println(count);
		 * n=num;
		 * int sum=0;
		 * sum+=(int) Math.pow(n%10,count);
		 * */
		
	}

}
