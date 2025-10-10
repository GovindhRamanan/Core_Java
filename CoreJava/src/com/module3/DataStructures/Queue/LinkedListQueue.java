package com.module3.DataStructures.Queue;

public class LinkedListQueue {
	private Node first=null;
	private Node last=null;
	private int count=0;
	
	public void add(Object e) {
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
		if(isEmpty())return null;
		return first.element;
	}
	public Object poll() {
		if(isEmpty())return null;
		Object e=first.element;
		first=first.next;
		if(first==null)last=null;//or last =null;
		count--;
		return e;
	}
}
