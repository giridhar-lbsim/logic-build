package logictest.corejava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HRExxceptionHandling {

	public static void main(String[] args) {

		try {
			int result;
			Scanner in = new Scanner(System.in);
			int x = in.nextInt();
			int y = in.nextInt();
			result = x / y;
			System.out.println("result: " + result);
		} catch (InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
