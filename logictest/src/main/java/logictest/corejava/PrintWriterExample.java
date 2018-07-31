package logictest.corejava;

import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter(System.out,true);
		pw.println("printwriter is recommended method to writing to the console");
		int i=-7;
		pw.println(i);
		double d = 10.32;
		pw.println(d);

	}

}
