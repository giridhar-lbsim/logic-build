package com.kmd.program.ds;

import com.kmd.program.ds.CustomQueue;

public class Queue {
	public static void main(String[] args) {
		CustomQueue queue = new CustomQueue();
		queue.enqueue(5);
		queue.enqueue(7);
		queue.enqueue(10);
		queue.enqueue(15);
		System.out.println(queue);
	}
}

class Node {
	private int data;
	private Node nextNode;

	public Node(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", nextNode=" + nextNode + "]";
	}
	
}

class CustomQueue {

	private int length;

	private Node front, rear;

	public CustomQueue() {
		length = 0;
		front = rear = null;
	}

	public void enqueue(int data) {
		Node node = new Node(data);
		if (isEmpty()) {
			front = node;
		} else {
			rear.setNextNode(node);
		}
		rear = node;
		length++;
	}

	public int dequeue() throws Exception {
		return length;

	}

	public int first() throws Exception {
		return length;

	}

	public boolean isEmpty() {
		return length == 0;
	}

	public int size() {
		return length;
	}

	@Override
	public String toString() {
		return "CustomQueue [length=" + length + ", front=" + front + ", rear=" + rear + "]";
	}

}
