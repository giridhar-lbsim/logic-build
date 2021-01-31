package com.giridhar.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

	public static Integer findAny(List<Integer> list) {
		Integer result = 0;
		Optional<Integer> findAnyResult = list.stream().filter(i -> i % 2 == 0).findAny();
		if (findAnyResult.isPresent()) {
			result = findAnyResult.get();
		}
		return result;
	}

	public static Integer findSquareDivisibleByThree(List<Integer> list) {
		Integer result = 0;
		Optional<Integer> anySquareDivisibleThree = list.stream().map(i -> i * i).filter(j -> j % 3 == 0).findAny();
		if (anySquareDivisibleThree.isPresent()) {
			result = anySquareDivisibleThree.get();
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numList = Arrays.asList(6, 1, 2, 3, 4, 5, 6, 7, 8, 9);
		Integer result = findAny(numList);
		System.out.println("findany result: " + result);

	}

}
