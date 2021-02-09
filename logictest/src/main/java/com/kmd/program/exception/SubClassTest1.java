package com.kmd.program.exception;

public class SubClassTest1 extends SuperClassTest1 {

	// SubClass declaring an exception
	// which are not a child exception of RuntimeException
	void method() /* throws Exception */
	{

		// Exception is not a child exception
		// of the RuntimeException
		// So the compiler will give an error

		System.out.println("SubClass");
	}

	// Driver code
	public static void main(String args[]) {
		SuperClassTest1 s = new SubClassTest1();
		s.method();
	}
}