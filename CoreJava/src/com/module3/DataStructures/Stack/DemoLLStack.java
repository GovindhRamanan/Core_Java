package com.module3.DataStructures.Stack;

public class DemoLLStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListStack s=new LinkedListStack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s.peek());
		while(!s.isEmpty())System.out.println(s.pop());
		System.out.println(s.peek());//queue is empty now

	}

}
