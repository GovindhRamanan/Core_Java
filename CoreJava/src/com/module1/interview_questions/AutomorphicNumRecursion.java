package com.module1.interview_questions;

public class AutomorphicNumRecursion {

	public static boolean isAutomorphic(int i,int sqr) {
		if(i==0)return true;
		if(sqr%10!=i%10) return false;
		
		return isAutomorphic(i/10,sqr/10);
		
		
	}
	
	public static void main(String[] args) {
	System.out.println(isAutomorphic(76,76*76));
	}
}

