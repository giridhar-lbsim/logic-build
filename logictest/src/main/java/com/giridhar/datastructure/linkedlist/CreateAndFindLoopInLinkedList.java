package com.giridhar.datastructure.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class CreateAndFindLoopInLinkedList {

	public static void main(String[] args) {
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.add(10);
		Node secondNode = linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		Node fifthNode = linkedList.add(50);
		Node node2duplicate = linkedList.add(20);
		linkedList.add(50);
		linkedList.add(60);
		linkedList.add(70);
		linkedList.add(80);
		linkedList.add(90);

		linkedList.display();
		linkedList.findThirdNodeFromLast(linkedList);
		linkedList.display();
		/*
		 * int duplicateHashcode = node2duplicate.hashCode();
		 * 
		 * System.out.println("pre: "+preHashcode+"  duplicate: "+duplicateHashcode);
		 */

		fifthNode.next = secondNode;
		// linkedList.display();
		boolean findLoopInLinkedList = linkedList.findLoopInLinkedList(linkedList);
		// System.out.println("result: "+findLoopInLinkedList);
		// linkedList.display();

		/*
		 * Integer a =new Integer(20); Integer b=new Integer(20); new Integer(30);
		 * System.out.println(a.hashCode()); System.out.println(b.hashCode());
		 */
		// How are duplicate nodes removed in an unsorted linked list? (
//		How do you find the third node from the end in a singly linked list? 

	}

}

class MyLinkedList {
	Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	@Override
	public String toString() {
		return "MyLinkedList [head=" + head + "]";
	}

	public Node add(int data) {
		Node node = new Node();
		node.data = data;
		if (head == null) {
			head = node;
		} else {
			Node tempNode = head;
			while (tempNode.next != null) {
				tempNode = tempNode.next;
			}
			tempNode.next = node;
		}
		return node;

	}

	public void display() {
		if (head == null) {
			System.out.println("Empty Linkedlist!");
		} else {
			Node tempNode = head;
			while (tempNode != null) {
				System.out.print(tempNode.data + ", ");
				System.out.println(tempNode.hashCode());
				tempNode = tempNode.next;
			}
//			System.out.println(tempNode.data);
		}
	}

	/**
	 * This method will find the loop in linkedlist and will remove the loop
	 * 
	 * @param linkedList
	 * @return boolean
	 */
	public boolean findLoopInLinkedList(MyLinkedList linkedList) {
		// flag to check loop is there or not
		boolean flag = false;
		Node headNode = linkedList.getHead();
		Node tempNode = headNode;
		Node previous = null;
		// map to hold nodes, making node's hashcode as key and node as value
		Map<Integer, Node> nodeMap = new HashMap<Integer, Node>();
		Node put = nodeMap.put(tempNode.hashCode(), tempNode);

		while (tempNode != null) {

			previous = tempNode;
			tempNode = tempNode.next;

			if (tempNode != null) {
				put = nodeMap.put(tempNode.hashCode(), tempNode);
			}

			if (put != null) {
				System.out.println("There is loop in the linkedlist");
				flag = true;
				// removing the loop from linked list
				previous.next = null;
				break;
			}
		}
		return flag;
	}

	Node findThirdNodeFromLast(MyLinkedList linkedList) {

		// reverse linkedList and find the third node
		Node head = linkedList.getHead();
		Node current = head;
		Node previous = null, next = null;

		// reverse linked list
		/*
		 * while(current != null) { next = current.next; current.next = previous;
		 * previous = current;
		 * 
		 * current = next; }
		 */
		while (current != null) {
			current = current.next;
			if (current.next.next.next == null) {
				System.out.println("third node: " + current.data);
				break;
			}
		}
		/*
		 * System.out.println("reversed linkedlist: "+previous);
		 * System.out.println("Third Node from last: "+previous.next.next.data);
		 */
		return previous;

	}



}
