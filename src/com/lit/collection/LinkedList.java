package com.lit.collection;

public class LinkedList {
	private Node first;
	private Node last;

	private int size;

	public void add(Object obj) {
		Node n = new Node();
		if (first==null) {
			n.setPrevious(null);
			n.setObj(obj);
			n.setNext(null);
			
			first = n;
			last = n;
		}else {
			//直接往last節點後面增加節點
			n.setPrevious(last);
			n.setObj(obj);
			n.setNext(null);
			
			last.setNext(n);
			
			last = n;
		}
		size++;
	}
	public int size() {
		return size;
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("aaa");
		list.add("bbb");
		list.add("dkp");
		list.add("mww");
		System.out.println(list.size);
	}

}
