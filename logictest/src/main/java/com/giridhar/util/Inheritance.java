package com.giridhar.util;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Child(1);

	}

}

class Parent{
	/*
	 * static { System.out.println("parent's static block."); }
	 */
	public Parent() {
		System.out.println("parent's constructor");
	}
	public Parent(int data) {
		System.out.println("parent's parameterized constructor");
	}
}
class Child extends Parent{
	/*
	 * static { System.out.println("Child's static block."); }
	 */
	public Child() {
		System.out.println("Child's constructor.");
	}
	public Child(int data) {
		super(1);
		System.out.println("Child's parameterized constructor.");
	}
}

//parent's static block.
//Child's static block.
//Child's constructor.
