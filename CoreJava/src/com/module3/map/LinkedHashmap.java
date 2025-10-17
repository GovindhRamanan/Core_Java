package com.module3.map;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m=new LinkedHashMap<Integer,String>();
		m.put(18, "Kohli");
		m.put(45, "Rohit");
		//m.put(18, "Kohli");
		//m.put(18, "Kohli");
		m.put(3, "Raina");
		m.put(48, "Raina");
		
		Set<Integer> s=m.keySet();
		Iterator<Integer> i=s.iterator();
		while(i.hasNext()) {
			int key=i.next();
			String value=m.get(key);
			System.out.println(key+"="+value);
			//System.out.println(i.next()+"="+m.get(i.next()));
		}


	}

}
