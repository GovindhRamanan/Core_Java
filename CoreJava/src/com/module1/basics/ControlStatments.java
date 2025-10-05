package com.module1.basics;

public class ControlStatments {

	public static void main(String[] args) {
		//Control Statements
				int a=7;
				//if
				if (a>=0)//condition
				{
					System.out.println("Hi I am if. I will be executed only if the condition is true");
				}
				//if else
				int b=120;
				if (b<=10)
				{
					System.out.println("Hi I am if. I will be executed only when the condition is true");//but the condition is false
				}
				else
				{
					System.out.println("Hi I am else. I will be executed when the above condition is false");
				}
				//else-if ladder
				int c=200;
				if(c!=200) 
				{
					System.out.println("Hi I am if. I will be executed only if the condition is true");
				}
				else if(c==200) 
				{
					System.out.println("Hi I am else-if-1. I will be executed when the conditions listed above fails and my condition is true");
				}
				else if(c>200) 
				{
					System.out.println("Hi I am else-if-2. I will be executed when the conditions listed above fails and my condition is true");
				}//else is optional for completing else-if
				else
				{
					System.out.println("Hi I am else. I will be executed when the above condition is false");
				}
			 int m=0;
			 //switch statement
			 switch (m) {
			 case 0:
				 System.out.println("I am case 0 of switch statement");
				 break;//jumping statement
			 case 1:
				 System.out.println("I am case 1 of switch statement");
				 break;
			 case 2:
				 System.out.println("I am case 2 of switch statement");
				 break;
			default:
				System.out.println("I am default of switch statement");
				
					 


			 }
					
			 

	}

}
