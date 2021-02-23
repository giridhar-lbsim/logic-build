package com.kmd.program.ds.linkedlist;

public class LinkedListClient {

	public static void main(String[] args) {

		LinkedList ls = new LinkedList();
		System.out.println("Adding element in linkedlist: ");
		ls.add(10);
		ls.add(15);
		ls.add(25);
		ls.add(40);
		System.out.println("Displaying element :");
		ls.display();
		System.out.println("Adding element at start of linkedlist: ");
		ls.addAtStart(5);
		System.out.println("Displaying element :");
		ls.display();
		System.out.println("Adding element at index '2'  of linkedlist: ");
		ls.addAtIndex(2, 45);
		System.out.println("Displaying element :");
		ls.display();
		System.out.println("Deleting element at start of linkedlist: ");
		ls.deleteAtStart();
		System.out.println("Displaying element :");
		ls.display();
		System.out.println("Deleting element at end of linkedlist: ");
		ls.deleteAtLast();
		System.out.println("Displaying element :");
		ls.display();
		
		System.out.println("Deleting element at index '2' of linkedlist: ");
		ls.deleteAtIndex(2);
		System.out.println("Displaying element :");
		ls.display();
	}

}
