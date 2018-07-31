package logictest.corejava;

class MyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int detail;

	MyException(int a) {
		detail = a;
	}

	@Override
	public String toString() {
		return "MyException [detail=" + detail + "]";
	}

}

public class CustomExceptionExample {

	static void compute(int a) throws MyException {
		System.out.println("Called compoute(" + a + ")");
		if (a > 10)
			throw new MyException(a);

		System.out.println("Normal Exit");

	}

	public static void main(String[] args) {
		try {
			compute(4);
			compute(20);
		} catch (MyException e) {

			System.out.println("Cought: " + e);

		}
	}

}
