package com.giridhar.datastructure.linkedlist;

public class LinkedListClent {

	public static void main(String[] args) {
		
		//LinkedList linkedList = new LinkedList();
		
		  LinkedList linkedList = new LinkedList();
		  linkedList.add(10);
		  linkedList.add(20); 
		  linkedList.add(30);
		  linkedList.add(40);
//		  linkedList.show();
		  linkedList.addAtStart(5);
		  linkedList.add(50);
		  System.out.println("linked list after element 5 at first node:");
		  linkedList.addAt(0, 15);
		  linkedList.show();
		 
		
		/*
		 * java.util.LinkedList<Integer> javaLinked = new
		 * java.util.LinkedList<Integer>(); javaLinked.remove()
		 */
		
	}

}
