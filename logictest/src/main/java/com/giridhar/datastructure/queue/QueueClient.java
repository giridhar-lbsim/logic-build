package com.giridhar.datastructure.queue;

public class QueueClient {
	
	public static void main(String[] args) {
		//custom queue
		Queue queue = new Queue();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		queue.add(60);
		//queue.display();
		
		//removing element
		System.out.println("removed element: "+queue.remove());
		//display after remove operation of que
		queue.display();
		
		
		
		
		/*
		 * java implemented queue
		Queue<Integer> queue = new PriorityQueue<Integer>();
		
		queue.add(10);
		queue.add(20);
		
		 * Queue interface method
		 * 
		 * boolean add(E e);
		 * boolean offer(E e); 
		 * E remove();
		 * E poll();
		 * E element();
		 * E peek();
		 */
	}

}
