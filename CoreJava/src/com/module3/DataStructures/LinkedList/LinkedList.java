package com.module3.DataStructures.LinkedList;

public class LinkedList {
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
	public void insert(int index,Object e) {
		if(index<=-1 || index>=size())throw new ArrayIndexOutOfBoundsException();
		if(index==0) {
			first=new Node(e,first);
			count++;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=new Node(e,curr.next);
		count++;
	}
	
	public int size() {
		return count;
	}
	
	public Object get(int index) {
		if(index>=size()||index<=-1)throw new ArrayIndexOutOfBoundsException();
		Node curr=first;
		for(int i=1;i<=index;i++)curr=curr.next;
		return curr.element;
	}
	public void remove(int index) {
		if(index<=-1 || index>=size())throw new ArrayIndexOutOfBoundsException();
		if(index==0) {
			first=first.next;
			if(first==null);last=first;
			count--;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=curr.next.next;
		if(curr.next==null)last=curr;
		count--;
	}
	@Override
	public String toString() {
		String s="["+first.element;
		Node curr=first;
		for(int i=1;i<size();i++) {
			curr=curr.next;
			s=s+", "+curr.element;
		}
		return s+"]";
	}
	public void reverse() {
		Node n=null;
		Node curr=first;
		Node pre=null;
		while(curr!=null) {
			n=curr.next;
			curr.next=pre;
			pre=curr;
			curr=n;
		}
		last=first;
		first=pre;
	}

}
