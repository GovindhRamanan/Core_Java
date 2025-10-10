package com.module3.DataStructures.Stack;

import java.util.EmptyStackException;

public class LinkedListStack {
	private Node first=null;
	private Node last=null;
	private int count=0;
	
	public void push(Object e) {
		if(first==null) {
			first= new Node(e, null);
			last=first;
			count++;
			return;
		}
		last.next=new Node(e, null);
		last=last.next;
		count++;		
	}
	public int size() {
		return count;
	}
	public boolean isEmpty() {
		return count==0;
	}
	public Object peek() {
		if(isEmpty())throw new EmptyStackException();
		return last.element;
	}
	public Object pop() {
		if(isEmpty())throw new EmptyStackException();
		Object e=last.element;
		
		if (first == last) {
			first = null;
			last =null;
		} 
		else{
			Node curr = first;
			while (curr.next != last) curr = curr.next;
	         curr.next = null;
	         last = curr;
		}
		count--;
		return e;
	}

}
