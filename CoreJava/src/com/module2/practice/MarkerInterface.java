package com.module2.practice;

import java.util.Scanner;

interface Washable{
	//marker interface
}
class Car implements Washable{}
class Bike implements Washable{}
class Clothes implements Washable{}
class Mobile{}
class Laptop{}
public class MarkerInterface {

	//my approach
	public static void getWash(Washable w){
		System.out.println("Washed");
	}//ramana sir approach
	public static void getWash1(Object o) {
		if(o instanceof Washable) {
			System.out.println(o.getClass().getSimpleName()+" Washed");
		}
		else System.out.println(o.getClass().getSimpleName()+" not Washable");
	}
	public static void main(String[] args) {
		//my approach
		//getWash(new Mobile());//The method getWash(Washable)is not applicable for the arguments (Mobile)
		getWash1(new Mobile());
		getWash1(new Car());
		Scanner sc= new Scanner(System.in);
		System.out.println("1. CarWash\n 2. BikeWash\n 3. Clothes Wash\n 4. MobileWash\n 5. LaptopWash\n 6. None");
		switch (sc.nextInt()) {
		case 1: getWash1(new Car()); break;
		case 2: getWash1(new Bike()); break;
		case 3: getWash1(new Clothes()); break;
		case 4: getWash1(new Mobile());break;
		case 5: getWash1(new Laptop()); break;
		case 6: System.out.println("Invalid input");
		}
		
	}

}
