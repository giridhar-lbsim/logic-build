package com.giridhar.datastructure.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class FindAndRemoveDuplicateNode {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(10);
		linkedList.add(50);
		
		
		linkedList.show();
		removeDuplicateElement(linkedList);
		System.out.println("Linked list after removing duplicate element");
		linkedList.show();
		

	}

	// How are duplicate nodes removed in an unsorted linked list?
	static void removeDuplicateElement(LinkedList linkedList) {
		Map<Integer, Node> uniqueNodeMap = new HashMap<>();
		Node currentNode = linkedList.getHead();
		Node previous = null;
		while (currentNode != null) {
			//map to hold unique element
			Node putNode = uniqueNodeMap.put(currentNode.data, currentNode);
			//putNode will hold null for new element
			if (putNode != null) {
				//poinint previous node to next of current
				previous.next = currentNode.next;
				//isolating current node
				currentNode.next = null;
				//pointing current not to next of current node
				currentNode = previous.next;
			} else {
				// logic for moving next and maintaining the previous
				previous = currentNode;
				currentNode = currentNode.next;
			}

		}

	}

}
