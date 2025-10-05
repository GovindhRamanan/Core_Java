package com.module3.DataStructures.ArrayList;

import java.util.ArrayList;

public class ArrayLists {

	private Object[] a=new Object[1];
	private int p=0;//pointer for index value
	
	
	public void add(Object e) {
		if(p>=a.length)increaseSize();
		a[p++]=e;
	}
	
	public void add(int index,Object e) {
		//if(p<0||p>=size())-->doubt is cleared, if the index value is less than -1 it shows indexoutofboundexception
		if(p>=size()) increaseSize();
		for(int i=size()-1;i>=index;i--)a[i+1]=a[i];
		a[index]=e;
		p++;
		
	}
	
	public void increaseSize() {
		Object[] temp =new Object[a.length+1];
		for(int i=0;i<a.length;i++)temp[i]=a[i];
		a=temp;
	}
	
	public int size() {
		return p;
	}
	
	public Object get(int index) {
		if(index<0 ||index>=size()) throw new ArrayIndexOutOfBoundsException();
		return a[index];
	}
	
	public void remove(int index) {
		if(index<0 ||index>=size()) throw new ArrayIndexOutOfBoundsException();
		for(int i=index+1;i<size();i++)a[i-1]=a[i];
		a[--p]=null;
		
	}
	
	@Override
	public String toString() {
		if(size()==0) return "[]";
		String s="["+a[0];
		for(int i=1;i<=size();i++)s=s+", "+a[i];
		return s+"]";
	}
}
