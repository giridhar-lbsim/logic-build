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
		fifthNode.next = secondNode;
		// linkedList.display();
		linkedList.findLoopInLinkedList(linkedList);
		linkedList.display();

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

}
