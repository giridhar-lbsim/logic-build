package com.kmd.program.ds.linkedlist;

public class Node {
	public int data;
	public Node next;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	public Node() {
		super();
	}
}
