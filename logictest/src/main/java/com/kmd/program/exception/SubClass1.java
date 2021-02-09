package com.kmd.program.exception;

public class SubClass1 extends SuperClassTest {

	// method() declaring Unchecked Exception ArithmeticException
	void method() throws ArithmeticException {

		// ArithmeticException is of type Unchecked Exception
		// so the compiler won't give any error
		System.out.println("SubClass");
	}

	// Driver code
	public static void main(String args[]) {
		SuperClassTest s = new SubClass1();
		s.method();
	}
}