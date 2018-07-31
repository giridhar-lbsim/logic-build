package logictest.corejava;

public class ChainExceptionExample {

	static void demoproc() {
		// create an exception
		NullPointerException npe = new NullPointerException("top layer");

		npe.initCause(new ArithmeticException("cause"));
		
		throw npe;
	}

	public static void main(String[] args) {
		try {
			demoproc();
		}catch(NullPointerException e) {
			//display top level exception
			System.out.println("Caught: "+e);
			// display cause exception
			System.out.println("Original cause: "+e.getCause());
		}
	}

}
