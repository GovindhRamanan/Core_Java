package com.module3.DataStructures.LinkedList;

public class DoublyLinkedLists {
	Node first=null;
	Node last=null;
	int count=0;
	
	public void add(Object e) {
		if(first==null) {
			first=new Node(e, null, null);
			last=first;
			count++;
			return;
		}
		last.next=new Node(e, null, last);
		last=last.next;
		count++;	
	}
	public void insert(int index,Object e) {
		if(index<=-1 || index>=size())throw new IndexOutOfBoundsException();
		if(index==0) {
			first.prev=new Node(e, first, null);
			first=first.prev;
			count++;
			return;	
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=new Node(e, curr.next, curr);
		curr=curr.next;
		curr.next.prev=curr;
		count++;
	}
	public Object get(int index) {
		if(index>=size()||index<=-1)throw new ArrayIndexOutOfBoundsException();
		Node curr=first;
		for(int i=1;i<=index;i++)curr=curr.next;
		return curr.element;
	}
	public int size() {
		return count;
	}
	public void remove(int index) {
		if(index<=-1 || index>=size())throw new ArrayIndexOutOfBoundsException();
		if(index==0) {
			first=first.next;
			if(first!=null)
				first.prev=null;
			else
				last=null;
			count--;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=curr.next.next;
		if(curr.next==null)last=curr;
		else curr.next.prev=curr;
		count--;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
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
