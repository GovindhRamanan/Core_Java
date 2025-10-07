package com.module3.DataStructures.LinkedList;

public class Node {

	 Object element;
	 Node next;
	 Node prev;
	public Node(Object element, Node next) {
		this.element = element;
		this.next = next;
	}
	public Node(Object element, Node next,Node prev) {
		this.element = element;
		this.next = next;
		this.prev=prev;
	}
	
}
