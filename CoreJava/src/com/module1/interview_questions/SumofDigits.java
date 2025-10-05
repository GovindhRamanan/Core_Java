package com.module1.interview_questions;
import java.util.Scanner;
public class SumofDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to get the sum of its individually");//3561-->3+5+6+1=15
		int n=sc.nextInt();
		int sum;
		for(sum=0;n>0;n/=10) {
			sum+=n%10;
		}
		System.out.println(sum);
		
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to get the sum of its individually");//3561-->3+5+6+1=15
		int n=sc.nextInt();
		int sum=0;
		while(n>0){
		sum+=n%10;
		n/10;
		if(n==0 && sum>9)
		{
		n=sum;
		sum=0;
		}
		
		}*/
	}

}
