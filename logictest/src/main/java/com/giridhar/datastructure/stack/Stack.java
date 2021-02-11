package com.giridhar.datastructure.stack;

public class Stack {

	int[] stack;
	int top = 0;

	public Stack() {
		this.stack = new int[5];
	}

	public void push(int data) {
		
		if(top<stack.length) {
			stack[top] = data;
			top++;

		}

		
	}

	public int pop() {
		int data=0;
		if(top >=0) {
			
			data = stack[top - 1];
			stack[top - 1] = 0;
			top--;
		}
		
		return data;
	}

	public int peek() {
		int data;
		data = stack[top - 1];
		return data;
	}

	public void search() {

	}

	public void show() {
		for (int data : stack) {
			System.out.println(data + " ");
		}
	}

	public boolean empty() {
		boolean isEmpty = false;
		if (stack.length == 0) {
			isEmpty = true;
		}
		return isEmpty;
	}

}
