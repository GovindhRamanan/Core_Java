package com.module3.DataStructures.Queue;

public class DemoArrayQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayQueue q=new ArrayQueue();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		System.out.println(q.peek());
		while(!q.isEmpty())System.out.println(q.poll());
		System.out.println(q.peek());//queue is empty now

	}

}
