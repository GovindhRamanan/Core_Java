package com.module1.practice;

import java.util.Scanner;

public class HackerRank {

	 public static void printf() {
         Scanner sc=new Scanner(System.in);
         System.out.println("================================");
         for(int i=0;i<3;i++)
         {
             String s1=sc.next();
             int x=sc.nextInt();
             //Complete this line
             System.out.printf("%-15s",s1);
             if(x<100&& x>=10)System.out.println("0"+x);
             else if(x<10||x==0)System.out.println("00"+x);
             else System.out.println(x);
         }
         System.out.println("================================");

 }
	 public static void scanner() {
		 Scanner scan = new Scanner(System.in);
	        int i = scan.nextInt();
	        double d=scan.nextDouble();
	        scan.nextLine();// it is mandatory
	        String s=scan.nextLine();
	        // Write your code here.

	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	
}
	 public static String getSmallestAndLargest(String s, int k) {
		    String smallest = s.substring(0, k);
		    String largest = s.substring(0, k);

		    for (int i = 1; i <= s.length() - k; i++) {
		        String str = s.substring(i, i + k);
		        
		        if (str.compareTo(smallest) < 0) {
		            smallest = str;
		        }
		        if (str.compareTo(largest) > 0) {
		            largest = str;
		        }
		    }
		    return smallest + "\n" + largest;
		}
		public static void Palindrome() {
			Scanner sc=new Scanner(System.in);
		    String A=sc.next();
		    int i=0;
		    int j=A.length()-1;
		    while(i<j){
		        if(A.charAt(i)!=A.charAt(j)) {
		        	System.out.print("No");return;
		        }
		        	i++;j--;
		    }
		    if(i>j||i==j)System.out.print("Yes");
		}
		
		
		static boolean isAnagram(String a, String b) {
	        // Complete the function
			a=a.toLowerCase();
			b=b.toLowerCase();
	        while(true){
	            if(a.length()!=b.length())return false;
	            if(a.length()==0 && a.length()==0)return true;;
	            char ch=a.charAt(0);
	            a=a.replace(ch+"","");
	            b=b.replace(ch+"", "");
	        }
		}
	public static void main(String[] args) {

		//System.out.println(getSmallestAndLargest("welcomeToJava", 3));
		System.out.println(isAnagram("Hello","hello"));
		
		
       
	}

}
