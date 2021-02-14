package com.giridhar.datastructure.linkedlist;

public class LinkedList {

	/* head will always point to first node in LinkedList */
	Node head;

	// this method will always add node in last
	public void add(int data) {
		/* Creating node to add in linkedList */
		Node node = new Node();
		node.data = data;
		node.next = null;
		/*
		 * checking if head is null, head will be null if there will no data in the
		 * linkedlist
		 */
		if (head == null) {
			head = node;
			/*
			 * if head not equal to null means there is data in the linkedlist
			 * 
			 */
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
//			Node tempNode = head;
			node.next = head;
			head = node;
		}

	}

	public void addAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

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

	public void addNodeInLast(int data) {
		Node node = new Node();
		node.data = data;
		if (head == null) {
			head = node;
		} else {
			Node tempNode = head;

			while (tempNode.next != null) {
				tempNode = tempNode.next;
			}
			node.next = tempNode.next;
			tempNode.next = node;
		}

	}

	public void show() {
		Node node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);

	}

}
