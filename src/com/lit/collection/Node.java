package com.lit.collection;

public class Node {
	private Object previous;
	private Object obj;
	private Object next;
	
	public Node(){
	}
	
	public Node(Object previous, Object obj, Object next) {
		super();
		this.previous = previous;
		this.obj = obj;
		this.next = next;
	}
	
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Object getNext() {
		return next;
	}
	public void setNext(Object next) {
		this.next = next;
	}
	public void setPrevious(Object previous) {
		this.previous = previous;
	}
	public Object getPrevious() {
		return previous;
	}
}
