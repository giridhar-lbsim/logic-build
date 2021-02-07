package com.kmd;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[] = { 2, 3, 4, 10, 40, 45, 65 };
		int len = arr.length;
		int key = 40;
		int result = searchElement(arr, len, key);
		if (result == -1)
			System.out.println("Element not present!");
		else
			System.out.println("Element found at index " + result);
		
	}

	private static int searchElement(int[] arr, int len, int key) {
		int left = 0, right = len - 1;
		while (left <= right) {
			int medium = left + (right - left) / 2;
			if (arr[medium] == key)
				return medium;
			if (arr[medium] < key)
				left = medium + 1;
			else
				right = medium - 1;
		}
		return -1;
	}
}
