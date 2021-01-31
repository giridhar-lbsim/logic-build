package com.giridhar.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDupsFromList {

	public static void removeDuplicateFromList(List<Integer> list) {
		Set<Integer> resultList = list.stream().collect(Collectors.toSet());
		resultList.forEach(System.out::println);
	}
	public static void main(String[] args) {
		
		removeDuplicateFromList(Arrays.asList(1,2,2,2,2,2,2,2,3,4,5,6,7,8,1,2,3,4));
	}

}
