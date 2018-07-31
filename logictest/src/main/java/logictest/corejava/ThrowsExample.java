package logictest.corejava;

public class ThrowsExample {

	static void demoproc() {
		try {
			throw new NullPointerException("demo");
		} catch (NullPointerException e) {
			System.out.println("cought inside demoproc");
			throw e;

		}

	}

	public static void main(String[] args) {
		try {
			demoproc();
		} catch (NullPointerException e) {
			System.out.println("Recought e:" + e);

		}
	}

}
