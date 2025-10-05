package com.module2.OOPS;
class A{
	static int i=10;
	static {
		System.out.println("Static Block of A class");//3
	}
	{
		System.out.println("Non-Static Block of A class");//4
	}
	A(){
		System.out.println("Constructor of A class");//5
		
	}
}

public class Constructor {
    static {
    	System.out.println("Static Block of Constructor class");//1
    	new A();//2(Abundant object which is called only once. After that it is get collected garbage collector.)
    }
    {
		System.out.println("Non-Static Block of Constructor class");
	}//8
    Constructor(){
    		System.out.println("Constructor of Constructor class");
    }//9
	public static void main(String[] args) {
			System.out.println("Main starts constructor class");//6
			new Constructor();//7(object creation without reference variable)
			System.out.println("Main ends constructor class");//10

	}

}