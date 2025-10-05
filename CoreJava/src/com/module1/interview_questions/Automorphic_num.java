package com.module1.interview_questions;

import java.util.Scanner;

public class Automorphic_num {

	public static void main(String[] args) {
		//5^2=25
		//25^2=625 the last two digits are the given input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
	    int sqr=n*n;
	    boolean flag=true;
	    while(n>0) {
	    if(n%10!=sqr%10) {
	    	flag=false;
	    	break;
	    }
	    n/=10;
	    sqr/=10;
	    }
	    if(flag)
	    	System.out.println("Automorphic number");
	    else
	    	System.out.println("Not an Automorphic number");
	}

}
