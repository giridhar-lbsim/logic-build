package com.giridhar.java8;

import java.util.Arrays;
import java.util.TreeSet;

public class SmallestPositiveInList {
	
	public static int getMin(int[] arr) {
		int min=0;
		TreeSet<Integer> sortedSet = new TreeSet<>();
		for(int elem:arr) {
			sortedSet.add(elem);
		}
		for(Integer elem:sortedSet) {
			if(!sortedSet.contains(++elem)) {
				min=elem;
				break;
			}
		}
		return min;
		
	}

	public static int solution(int[] list) {
		Arrays.sort(list);
		System.out.println(list.length);
		int result = 0, i, size = list.length;
		for (i = 0; i < size; i++) {
			int sum;
			System.out.println(list[i]);
			sum = list[i + 1] - list[i];
			if (sum > 1) {
				result = list[i] + 1;
			}

		}
		return result;
	}

	public static void main(String[] args) {
		int[] list1 = { 1, 2, 3, 5, 6, 7, 8 };
		int[] list2 = { -1, -3, -2 };
		int[] list3 = {0, 10, 2, -10, -20};
		//int result = solution(list2);
		System.out.println("result: " + getMin(list2));

	}

}
