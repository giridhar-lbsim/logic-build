package com.kmd.program.ds;

import java.util.*;
import java.util.Queue;

public class StackUsingQueue {

	public static void main(String[] args) {
		StackUsingQueueTest sq = new StackUsingQueueTest();
		System.out.printf("\n Adding element\n");
		sq.push(10);
		sq.push(15);
		sq.push(35);
		sq.queueDisplay();
		System.out.printf("\n Removing element\n");
		sq.pop();
		System.out.printf("\n Elemets after removal : \n");
		sq.queueDisplay();
	}

}

class StackUsingQueueTest {
	Queue<Integer> queue = new LinkedList<Integer>();

	public void push(int data) {
		int size = queue.size();
		queue.add(data);
		for (int i = 0; i < size; i++) {
			queue.add(queue.remove());
		}
	}

	public void queueDisplay() {
		System.out.printf("\n element: " + queue);
	}

	public void pop() {
		System.out.println("\n An element removed from a stack is: " + queue.remove());
	}

}
