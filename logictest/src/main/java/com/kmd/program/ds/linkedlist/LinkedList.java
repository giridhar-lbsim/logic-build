package com.kmd.program.ds.linkedlist;

public class LinkedList {

	Node head;

	public void add(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	public void addAtStart(int data) {
		Node node = new Node();
		node.data = data;
		if (head == null) {
			head = node;
		} else {
			node.data = data;
			node.next = head;
			head = node;
		}
	}

	public void addAtIndex(int index, int data) {
		Node node = new Node();
		node.data = data;
		if (index == 0) {
			addAtStart(data);
		} else {
			Node tempNode = head;
			for (int i = 0; i < index - 1; i++) {
				tempNode = tempNode.next;
			}
			node.next = tempNode.next;
			tempNode.next = node;
		}
	}

	public void display() {
		Node node = head;
		while (node.next != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println(node.data + " ");
		System.out.println("\n");
	}

	public void deleteAtStart() {
		Node node = new Node();
		node = head.next;
		head = node;
		node = null;
	}

	public void deleteAtLast() {
		if (head == null)
			System.out.println("Linked list is empty");
		else {
			Node node = head;
			Node tempNode = head;
			while (tempNode.next != null) {
				node = tempNode;
				tempNode = tempNode.next;
			}
			node.next = null;
			tempNode = null;
		}
	}
	
	public void deleteAtIndex(int index) {
		if (head == null)
			System.out.println("Linked list is empty");
		else {
			Node node = head;
			Node tempNode = head;
			for (int i = 0; i < index; i++) {
				node = tempNode;
				tempNode = tempNode.next;
			}
			node.next = tempNode.next;
			tempNode = null;
		}
	}
}
