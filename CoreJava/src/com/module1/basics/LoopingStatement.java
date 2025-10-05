package com.module1.basics;

public class LoopingStatement {

	public static void main(String[] args) {
		/* i --> iterator
		 * for(initialization;condition;increment/decrement) {
		 * 
		 * }
		 */
		int i;
		ForLoop://labels
		for (i=1;i<=4;i++) {
			System.out.println("For loop");
			innerLoop:
			for (i=1;i<=4;i++) {
				System.out.println("For loop");
				break ForLoop;//labelled break
				//break,continue jumping statements
			}
		}
		int a=0,b=1;
        for(a=1, b=2;a<5||b<5;a++,b++) {
        	System.out.println("for loop");
		}//a=6,b=6
        // while loop
        whileLoop://Labels
        while(a<6||b<6) {
        	//initialization should not be done inside the while loop. Otherwise infinite loop takes place.
        	System.out.println("while loop");
        	a++;// if it is not given infinite loop will happen.
        	b++;
        }//a=7,b=7
        // Do-while loop
        int h=0;
        do {//executed atleast once
        	System.out.println("Hi I am dowhile");
        	h++;//  if it is not given infinite loop will happen.
        }while(h<=5);
    //infinite loop
		for (;;i++) {
			System.out.println("for loop");
		}
		
	}

}
