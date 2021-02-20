package com.giridhar.datastructure.stack;

public class StackImplementationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		stack.push(10);
		stack.push(15);
		stack.push(20);
		stack.pop();
		stack.pop();
		stack.pop();

		stack.show();
		int peek = stack.peek();
		System.out.println("peek: " + peek);
		stack.pop();
		System.out.println("peek: " + stack.peek());
		System.out.println("size of stack: " + stack.size());
		System.out.println("isEmpty: " + stack.isEmpty());

	}

}
