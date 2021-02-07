package com.kmd.program.exception;

public class SubClass extends SuperClass {

	// method() declaring Checked Exception IOException
	void method() /* throws IOException */ {
		// IOException is of type Checked Exception
		// so the compiler will give Error
		System.out.println("SubClass");
	}

	// Driver code
	public static void main(String args[]) {
		SuperClass s = new SubClass();
		s.method();
	}
}