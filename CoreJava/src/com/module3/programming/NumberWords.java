package com.module3.programming;

import java.util.Scanner;

public class NumberWords {
	
	public static void count(int n,String s) {
		String [] ones= {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String[] tens= {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		if(n<19)System.out.print(ones[n]+" ");
		else System.out.print(tens[n/10]+" "+ones[n%10]+" ");
		if(n!=0)
			System.out.print(s+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		count(n/10000000,"Crore ");
		count((n/100000)%100,"Lakhs ");
		count((n/1000)%100,"Thousand ");
		count((n/100)%10,"Hundred ");
		count(n%100,"");
		
		

	}

}
