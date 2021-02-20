package com.giridhar.datastructure.linkedlist;

public class ReverseSinglyLinkedList {
	
	public static Node reverseSinglyLinkedList(Node head) {
		
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
		return previous;
	}
	public static void main(String[] args) {
		LinkedList singlyLinkedList = new LinkedList();
		singlyLinkedList.add(10);
		singlyLinkedList.add(20);
		singlyLinkedList.add(30);
		singlyLinkedList.add(40);
		singlyLinkedList.show();
		Node head = singlyLinkedList.getHead();
		reverseSinglyLinkedList(head);
		System.out.println("\nsingly linked list after reversing: ");
		singlyLinkedList.show();
	}

}
