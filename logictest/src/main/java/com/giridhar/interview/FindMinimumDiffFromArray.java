package com.giridhar.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindMinimumDiffFromArray {

	private static int findMinimumDiffFromArray(int[] numbers, int size) {
		int diff = Integer.MAX_VALUE;
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (Math.abs((numbers[i] - numbers[j])) < diff) {
					diff = Math.abs((numbers[i] - numbers[j]));
				}
			}

		}
		return diff;

	}

	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<Integer>();

		List<Integer> numbers = Arrays.asList(1, 5, 3, 19, 18, 25);
		int arr[] = new int[] { 1, 5, 3, 19, 17, 25 };
		int size = arr.length;

		System.out.println(findMinimumDiffFromArray(arr, size));

	}

}
