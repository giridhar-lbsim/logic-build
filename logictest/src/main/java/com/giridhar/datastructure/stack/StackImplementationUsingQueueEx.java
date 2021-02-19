package com.giridhar.datastructure.stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class StackImplementationUsingQueueEx {
	public static void main(String[] args) {
		/*
		 * Queue<Integer> queue = new PriorityQueue<>(); queue.add(10); queue.add(20);
		 * queue.add(30);
		 * 
		 * Integer removedElement = queue.remove();
		 * System.out.println("removed element: "+removedElement);
		 * System.out.println("queue: "+queue);
		 * System.out.println("peek from queue: "+queue.peek());
		 * System.out.println("queue after peek: "+queue);
		 */
		StackUsingQueue<Integer> stack = new StackUsingQueue<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.display();
		System.out.println("poped element: "+stack.pop());
		stack.display();
		
	}

}
class StackUsingQueue<T>
{
	Queue<T> queue = new LinkedList<T>();
	
	public void push(T data)
	{
		int size = queue.size();
		queue.add(data);
		for(int i=0;i<size;i++) {
			//add element to top of stack
			queue.add(queue.remove());
		}
	}
	public T  pop() {
		return queue.remove();
	}
	public T peek()
	{
		return queue.peek();
	}
	public void display() {
		System.out.println("Stack elements: "+queue);
	}
	public int size()
	{
		return queue.size();
	}
	public boolean isEmpty()
	{
		return queue.isEmpty();
	}
}