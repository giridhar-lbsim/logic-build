package com.giridhar.datastructure.linkedlist;

public class LinkedList {

	/* head will always point to first node in LinkedList */
	Node head;

	
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

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

	/*
	 * This method will add node in start of linkedlist
	 */
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

	/*
	 * 
	 */
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

	public int deleteAt(int index) {
		int deletedData=0;
		Node tempNode = head;
		Node tempNode2 = null;
		if (index == 0) {
			head = head.next;
		} else {
			// first we need to traverse the linked list till index
			for (int i = 0; i < index - 1; i++) {
				tempNode = tempNode.next;
			}
			// logic for deleting next to next node

			// getting node which need to be deleted
			tempNode2 = tempNode.next;
			// making eligible for garbage collection
			//
			// asking previous node to point next node of node to be deleted
			tempNode.next = tempNode2.next;
			System.out.println("deleted data: " + tempNode2.data);
			deletedData = tempNode2.data;
			tempNode2 = null;
		}
		return deletedData;

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
			System.out.print(+node.data + ", ");
			node = node.next;
		}
		System.out.print(node.data + " ");

	}
public Node reverseSinglyLinkedList() {
		
		if(head == null) {
			return head;
		}
		Node current = head;
		Node previous = null;
		Node next = null;
		
		while(current.next != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		current.next = previous;
		previous= current;
		//System.out.println("inside:"+previous);
		return previous;
	}

}
