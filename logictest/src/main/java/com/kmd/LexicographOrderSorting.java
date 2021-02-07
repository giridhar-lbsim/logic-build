package com.kmd;

public class LexicographOrderSorting {
	public static void main(String[] args) {
		String str = "lexicographsort";
		int result = getLatestSubString(str);
		System.out.println("Latest substring using lexicographic order : "
				+ str.substring(str.indexOf((char) result), str.length()));
	}

	private static int getLatestSubString(String str) {
		int max = str.charAt(0);
		int i;
		for (i = 0; i < str.length(); i++) {
			if ((int) str.charAt(i) > max)
				max = str.charAt(i);
		}
		return max;
	}

}
