package com.giridhar.datastructure.linkedlist;

public class LinkedList {

	/* head will always point to first node in LinkedList */
	Node head;

	public void add(int data) {
		/* Creating node to add in linkedList */
		Node node = new Node();
		node.data = data;
		node.next = null;
		/* checking if head is null, head will be null if there will no data in the linkedlist*/
		if (head == null) {
			head = node;
		/* if head not equal to null means there is data in the linkedlist
		 * 
		 *  */
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	public void show() {
		Node node = head;
		while(node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);

	}

}
