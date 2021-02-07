package com.kmd.program.exception;

public class SubClassTest2 extends SuperClassTest2 {
	// SubClass declaring a child exception
	// of RuntimeException
	void method() throws ArithmeticException {
		// ArithmeticException is a child exception
		// of the RuntimeException
		// So the compiler won't give an error
		System.out.println("SubClass");
	}

	// Driver code
	public static void main(String args[]) {
		SuperClassTest2 s = new SubClassTest2();
		s.method();
	}
}