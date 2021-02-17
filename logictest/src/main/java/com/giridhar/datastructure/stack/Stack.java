package com.giridhar.datastructure.stack;

public class Stack {

	int[] stack;
	int top = 0;

	public Stack() {
		this.stack = new int[5];
	}

	/**
	 * push method, this method add element on top of the stack
	 * 
	 * @param data
	 */
	public void push(int data) {
		
		

		if (top < stack.length) {
			stack[top] = data;
			top++;

		}else {
			System.out.println("Stack is full. ");
		}

	}

	/**
	 * pop method, this method remove/delete top element from the stack
	 * 
	 * @return
	 */
	public int pop() {
		int data = 0;
		if (top >= 0) {

			data = stack[top - 1];
			stack[top - 1] = 0;
			top--;
		}else {
			System.out.println("Stack is empty: ");
		}

		return data;
	}

	/**
	 * peek method, this method get top element of stack but don't delete that
	 * element as of push operations
	 * 
	 * @return int element
	 */
	public int peek() {
		int data = 0;
		if(isEmpty())
		{
			throw new RuntimeException("Stack is empty: ");
		}else {
			
			data = stack[top - 1];
			
		}
		return data;
		
		
	}

	public void search() {

	}

	/**
	 * show method will traverse the stack and print the value
	 * 
	 * @return void
	 */
	public void show() {
		for (int data : stack) {
			System.out.print(data + ", ");
		}
	}

	/**
	 * check if stack is empty or not
	 * 
	 * @return boolean
	 */
	public boolean isEmpty() {
		return top <= 0;
	}

	/**
	 * size method of stack retuns the size of stack
	 * @return size
	 */
	public int size() {
		return top;
	}

}
