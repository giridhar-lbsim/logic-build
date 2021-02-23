package com.kmd.program.ds.linkedlist;

public class ReverseSinglyLinkedList {
	public static void main(String[] args) {

		LinkedList ls = new LinkedList();
		System.out.println("Adding element in linkedlist: ");
		ls.add(10);
		ls.add(15);
		ls.add(25);
		ls.add(40);
		System.out.print("Displaying element :");
		ls.display();
		System.out.print("Reversing element in linkedlist: ");
		Node reverseLinkedList = ls.reverseLinkedList();
		ls.printAfterReverse(reverseLinkedList);
	}
}
