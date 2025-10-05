package com.module1.basics;
import java.util.*;

public class Array {

	public static void main(String[] args) {
		while(true) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size = s.nextInt();
		int array[]= new int[size];
		System.out.println("Enter the elements in an array:");
		for(int i=0;i<size;i=i+1) {
			array[i]=s.nextInt();
		}
		System.out.println("the array elements are:");
		/*foreach loop
		 * for(int i : array) { System.out.println(i); }
		 */
		  for(int i =0;i<size;i=i+1) {
			 System.out.println(array[i]);
			 }
	 
		}

	}

}