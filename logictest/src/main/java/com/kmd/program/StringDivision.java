package com.kmd.program;

import java.util.HashMap;
import java.util.Map;

public class StringDivision {
	public static void main(String[] args) {
		String str = "geeesekforgeeks";
		System.out.println("Result : " + getDividedString(str));
	}

	private static String getDividedString(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ch = str.toCharArray();
		int k = 4, divCount = 0, startIndex = 0;
		String result = "";
		int count = 0;
		for (char c : ch) {
			if (!map.containsKey(c)) {
				map.put(c, count);
				count++;
			}
			startIndex++;
			result = result + Character.valueOf(c);
			if (count == k) {
				map = new HashMap<Character, Integer>();
				result = result + " ";
				count = 0;
				divCount++;
				if (divCount == 2) {
					result = result.trim() + str.substring(startIndex, str.length());
					break;
				}
			}
		}
		return result;
	}
}
