package logictest;

import java.util.Scanner;

public class SubString {
	public static String findSubString(int startIndex, int endIndex, String inputString) {
		int length = inputString.length();
		if(length == endIndex) {
			endIndex = endIndex-1;
		}
		System.out.println("length: "+length+" endIndex: "+endIndex);
		String outputString = "";
		if (inputString != null && startIndex < endIndex && length > endIndex) {
			outputString = inputString.substring(startIndex, endIndex);
		} else {
			outputString = "Invalid input";
		}

		return outputString;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter start index: ");
		int start = in.nextInt();
		System.out.println("Enter end index: ");
		int end = in.nextInt();
		System.out.println("Enter input string: ");
		String inputString = in.next();
		String findSubString = findSubString(start, end, inputString);
		System.out.println("result substring is: " + findSubString);

	}

}
