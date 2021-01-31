package com.giridhar.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumberInArray {

	public static int[] oddNumberFromArray(int[] array) {
		int[] resultArray = new int[array.length];
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {

				resultArray[j++] = array[i];
			}
		}
		return resultArray;

	}

	public static List<Integer> oddNumberFromArray(List<Integer> list){
		List<Integer> resultList = new ArrayList<>();
		list.forEach(n->{
			if(n%2!=0) {
				resultList.add(n);
				System.out.println(n);
			}
			
		
		});
		//using stream
		List<Integer> oddList = list.stream().filter(el->el%2 !=0).collect(Collectors.toList());
		return oddList;
	
		
	}

	public static void main(String[] args) {
		/*
		 * List<String> list =
		 * Arrays.asList("giridhar","kumod","manish","ketan","giridhar"); Stream<String>
		 * filteredStream = list.stream().filter(a->a.equals("giridhar")); long count =
		 * filteredStream.count(); List<String> collect =
		 * filteredStream.collect(Collectors.toList());
		 * System.out.println("count:"+count); System.out.println("collect: "+collect);
		 */

		int[] inputArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13,14,15,16 };
		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> oddNumberFromArray = oddNumberFromArray(asList);
		System.out.println(oddNumberFromArray);
		
	}

}
