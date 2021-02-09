package com.kmd.program.exception;

import java.io.IOException;

public class SubClassTest3 extends SuperClassTest3 {

	// SubClass declaring without exception
	void method() {
		System.out.println("SubClass");
	}

	// Driver code
	public static void main(String args[]) {
		SuperClassTest3 s = new SubClassTest3();
		try {
			s.method();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
/*
Conclusion for Handling such Exceptions: Hence, following conclusions can be derived from the above examples:

1. If SuperClass does not declare an exception, then the SubClass can only declare unchecked exceptions, but not the checked exceptions.
2. If SuperClass declares an exception, then the SubClass can only declare the child exceptions of the exception declared by the SuperClass, but not any other exception.
3. If SuperClass declares an exception, then the SubClass can declare without exception.

*/


