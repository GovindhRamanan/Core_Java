package com.module1.practice;
import java.util.Scanner;
public class RevString {

	public static void main(String[] args) {
		Scanner ni=new Scanner(System.in);
		System.out.println("Enter a string to get reverse it");
		String input=ni.nextLine();
		String rev="";
		for(int n=0;n<input.length();n++) {
		rev=input.charAt(n)+rev;
		}
		System.out.println(rev);
		
		

	}

}
