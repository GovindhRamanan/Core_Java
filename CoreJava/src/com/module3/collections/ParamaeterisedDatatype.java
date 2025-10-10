package com.module3.collections;

public class ParamaeterisedDatatype {

		public static void main(String[] args) {
			ArrayList<Integer> a=new ArrayList<Integer>();
			a.add(10);
			a.add(20);
			a.add(30);
			a.add(40);
			a.insert(0, 70);
			a.remove(0);
			System.out.println(a);
			for(int i=0;i<a.size();i++)System.out.println(a.get(i));
		}

}
class ArrayList<E>{//Generic Type
	private Object[] a=new Object[1];
	private int p=0;//pointer for index value
	
	
	public void add(E e) {
		if(p>=a.length)increaseSize();
		a[p++]=e;
	}
	
	public void insert(int index,E e) {
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
	
	public E get(int index) {
		if(index<0 ||index>=size()) throw new ArrayIndexOutOfBoundsException();
		return (E)a[index];
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
