package com.giridhar.datastructure.queue;

import java.util.Arrays;

public class Queue {
	int front = 0, rear = 0, capacity = 5;
	int queue[] = new int[capacity];

	public void add(int data) {

		// checking if queue is full
		if (rear == capacity) {
			System.out.println("Queue is full.");
		} else {
			// if queue is not empty then add
			queue[rear] = data;
			rear++;
		}

	}
	public int remove() {
		int removedElement=0;
		//remove operation will happen from front
		//check if queue is empty
		if(front == rear) {
			System.out.println("Queue is empty");
		}else {
			removedElement = queue[front];
			//here queue is not empty so remove element from front and shift the remaining element
			//for shifting iteration is required
			//iteration is needed upto rear length here i=0 so iteration will be i<rear-1
			for(int i=front;i<rear-1;i++) {
				queue[i] = queue[i+1];
			}
			//updating the rear index value 
			queue[rear - 1] = 0;
			//decreasing the rear value by 1
			rear--;
		}
		return removedElement;
	}

	public void display() {
		// checking if queue is empty
		if (front == rear) {
			System.out.println("Queue is empty");
		} else {
			// print the queue element
			for (int el : queue) {
				System.out.println(el);
			}
		}
	}

	@Override
	public String toString() {
		return "Queue [queue=" + Arrays.toString(queue) + "]";
	}
	
	

}
