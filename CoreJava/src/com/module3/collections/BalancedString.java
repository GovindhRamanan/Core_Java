package com.module3.collections;

import java.util.Stack;

public class BalancedString {//Interview Question

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="{([)}";
		System.out.println(isBalanced(s));
		
	}
	public static boolean isBalanced(String s) {
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='{'||c=='('||c=='[')st.push(c);
			else if(c=='}'||c==')'||c==']')
				if(st.isEmpty()||!match(st.pop(), c))return false;
		}
		return st.isEmpty();
	}
	public static boolean match(char c1,char c2) {
		if(c1=='{'&&c2=='}')return true;
		if(c1=='['&&c2==']')return true;
		if(c1=='('&&c2==')')return true;
		return false;
	}

}
