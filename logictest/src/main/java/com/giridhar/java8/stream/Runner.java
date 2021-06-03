package com.giridhar.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(500,800,1100,1200);
		
		OptionalDouble average = numbers.stream().filter(n->n>1000).mapToInt(Integer::intValue).average();
	}

}
