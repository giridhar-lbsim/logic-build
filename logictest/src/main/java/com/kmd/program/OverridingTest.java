package com.kmd.program;

public class OverridingTest {
	public static void main(String[] args) {

	}
}

class B {
	B m1() {
		System.out.println("Inside B");
		return new B();

	}
}

class A extends B {
	A m1() {
		System.out.println("Inside A");
		return new A();

	}
}
