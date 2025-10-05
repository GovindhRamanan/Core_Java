package com.module1.interview_questions;
import java.util.Scanner;
public class CurrencyDenominations {

	public static void main(String[] args) {
		while(true)//infinite loop
		{
			Scanner m =new Scanner(System.in);
			System.out.println("Enter amount in the multiples of 100,200,500,2000");
			int amount=m.nextInt();
			if(amount%100==0) {
				if(amount>=2000) {
					System.out.println("2000 X "+(amount/2000));
					amount=amount%2000;
				}
				if(amount>=500) {
					System.out.println("500 X "+(amount/500));
					amount=amount%500;
				}
				if(amount>=2000) {
					System.out.println("200 X "+(amount/200));
					amount=amount%200;
				}
				if(amount>=100) {
					System.out.println("2000 X "+(amount/100));
					amount=amount%100;
			    }
			}
			else {
				System.out.println("Invalid denominations");
		    }
	}

}
}
