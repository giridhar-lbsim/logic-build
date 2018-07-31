package logictest.corejava;

public class ThrowsEx {

	static void throwsOne() throws IllegalAccessException {
		System.out.println("Inside throwOne");
		throw new IllegalAccessException("IllegalAcessException");
	}

	public static void main(String[] args) {
		try {
			throwsOne();
			return;
		} catch (IllegalAccessException e) {
			System.out.println("cought: " + e);
			System.exit(1);
		}
		finally {
			System.out.println("finally block executed");
		}
		System.out.println("outside finally block");
	}

}
