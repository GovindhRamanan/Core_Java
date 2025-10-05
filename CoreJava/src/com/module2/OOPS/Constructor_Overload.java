package com.module2.OOPS;

public class Constructor_Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class B{
	B(){
		System.out.println("B() Cons");
	}
	//B(){}//CTE
	B(int i){
		System.out.println("B(int i) Cons");
	}
	//B(int j){}//CTE
	B(int i,double j){
		System.out.println("B(int i,double j) Cons");
	}
	B(double i, int j){
		System.out.println("B(double i,int j) Cons");
	}
	public static void main(String[] args) {
		new B();
		new B(10);
		// CTE //new B(10,10);
		new B(10,10.5);
		new B(10.5,10);
		
		

	}
}
