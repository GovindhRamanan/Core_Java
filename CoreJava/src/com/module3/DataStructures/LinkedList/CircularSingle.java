package com.module3.DataStructures.LinkedList;

public class CircularSingle {

	private Node first=null;
	private Node last=null;
	private int count=0;
	
	public void add(Object e) {
		if(first==null) {
			first= new Node(e, first);
			last=first;
			count++;
			return;
		}
		last.next=new Node(e, last.next);
		last=last.next;
		count++;		
	}
	public void insert(int index,Object e) {
		if(index<=-1 || index>=size())throw new ArrayIndexOutOfBoundsException();
		if(index==0) {
			first=new Node(e,first);
			last.next=first;
			count++;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=new Node(e,curr.next);
		last.next=first;
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
			last.next=first;
			if(first==null)last=first;
			count--;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=curr.next.next;
		if(curr.next==first)last=curr;
		count--;
	}
	@Override
	public String toString() {
		if(size()==0)return "[]";
		String s="["+first.element;
		Node curr=first;
		for(int i=1;i<size();i++) {
			curr=curr.next;
			s=s+", "+curr.element;
		}
		return s+"]";
	}

}
