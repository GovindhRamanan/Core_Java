package com.module3.map;

import java.util.Map;
import java.util.LinkedHashMap;

public class Roman_Convert {
	
	public static String convert(int n) {
		Map<Integer,String> m=new LinkedHashMap<Integer,String>();
		String res="";
		m.put(1, "I");
		m.put(4, "IV");
		m.put(5, "V");
		m.put(9, "IX");
		m.put(10, "X");
		m.put(40, "XL");
		m.put(50, "L");
		m.put(90, "XC");
		m.put(100, "C");
		m.put(400, "CD");
		m.put(500, "D");
		m.put(900, "CM");
		m.put(1000, "M");
		int[] a= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		for(int value: a) {
			while(n>=value) {
				res+=m.get(value);
				n-=value;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert(45));
		

	}

}
