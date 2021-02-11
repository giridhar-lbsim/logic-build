package com.kmd.program.ds;

public class ArrayImplOfQueue {
	public static void main(String[] args) {
		ArrayImplOfQueueTest q = new ArrayImplOfQueueTest(5);
		q.queueDisplay();
		System.out.printf("\n Adding element in a Queue\n");
		q.queueEnqueue(5);
		q.queueEnqueue(10);
		q.queueEnqueue(25);
		q.queueEnqueue(15);
		q.queueEnqueue(55);
		System.out.printf("\n Displaying Queue after adding elements: \n");
		q.queueDisplay();
		System.out.printf("\n Removing first element from Queue\n");
		q.queueDequeue();
		System.out.printf("\n Displaying Queue after removal of first element: \n");
		q.queueDisplay();
		q.queueDequeue();
		q.queueDequeue();
		q.queueDequeue();
		q.queueDequeue();
		System.out.printf("\n Displaying Queue after removal of all elements: \n");
		q.queueDequeue();
	}
}

class ArrayImplOfQueueTest {
	private static int front, rear, capacity;
	private static int queue[];

	public ArrayImplOfQueueTest(int c) {
		front = rear = 0;
		capacity = c;
		queue = new int[capacity];
	}

	public void queueEnqueue(int data) {
		if (capacity == rear) {
			System.out.printf("\nQueue is empty\n");
			return;
		} else {
			queue[rear] = data;
			rear++;
		}
	}

	void queueDisplay() {
		if (front == rear) {
			System.out.printf("\nQueue is empty\n");
			return;
		}
		for (int i = front; i < rear; i++) {
			System.out.println("Element : " + queue[i]);
		}
	}

	void queueDequeue() {
		if (front == rear) {
			System.out.printf("\nQueue is empty\n");
			return;
		} else {
			for (int i = 0; i < rear - 1; i++) {
				queue[i] = queue[i + 1];
			}
			if (rear < capacity)
				queue[rear] = 0;
			rear--;
		}
	}
}
