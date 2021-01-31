package com.giridhar.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class FlatmapEx {

	public static List<String> findUniqueCharacterFromList(List<String> wordsList) {

		List<String> resultList = wordsList.stream().map(word -> word.split("")).flatMap(Arrays::stream).distinct()
				.collect(Collectors.toList());
		return resultList;

	}

	public static List<Integer> findListOfSquareOfEachNumber(List<Integer> numberList) {

		List<Integer> resultList = numberList.stream().map(n -> n * n).collect(Collectors.toList());

		return resultList;

	}

	/**
	 * Given two lists of numbers, how would you return all pairs of numbers? For
	 * example, given a list [1, 2, 3] and a list [3, 4] you should return [(1, 3),
	 * (1, 4), (2, 3), (2, 4), (3, 3), (3, 4)]. For simplicity, you can represent a
	 * pair as an array with two elements.
	 * 
	 * @param args
	 * @return
	 */
	public static List<int[]> findCombinationOfTwoNumberList(List<Integer> numberListOne,
			List<Integer> numberListSecond) {

		List<int[]> resultList = numberListOne.stream()
				.flatMap(i -> numberListSecond.stream().map(j -> new int[] { i, j })).collect(Collectors.toList());
		return resultList;
	}

	/**
	 * 3. How would you extend the previous example to return only pairs whose sum
	 * is divisible by 3? For example, (2, 4) and (3, 3) are valid
	 * 
	 * @param args
	 * @return 
	 */
	
	public static List<int[]> findSumOfPair(List<Integer> numberListOne,
			List<Integer> numberListSecond) {
		
		 List<int[]> resultList = numberListOne.stream().flatMap(i->numberListSecond.stream().filter(j->(i+j)%3==0).map(j->new int[] {i,j})).collect(Collectors.toList());
		 return resultList;
		
	}

	public static void main(String[] args) {
		List<String> wordsList = Arrays.asList("giridhar", "kumod", "ketan", "manish");
		List<String> resultList = findUniqueCharacterFromList(wordsList);
		System.out.println("result: " + resultList);

		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> squareOfNumber = findListOfSquareOfEachNumber(numberList);
		System.out.println("squareOfNumber: " + squareOfNumber);

		List<Integer> numberListOne = Arrays.asList(1, 2, 3);
		List<Integer> numberListSecond = Arrays.asList(2, 3);
		List<int[]> combinationOfList = findCombinationOfTwoNumberList(numberListOne, numberListSecond);
		combinationOfList.forEach(System.out::println);// not working
		
		List<int[]> findSumOfPair = findSumOfPair(numberListOne, numberListSecond);
		System.out.println(findSumOfPair);
	}

}
