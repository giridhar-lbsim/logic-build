package com.giridhar.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceEx {
	private static Integer sumOfNumber(List<Integer> numbers) {
		Integer sum = 0;
//		return numbers.stream().reduce(0,(a,b)->a+b);
		Optional<Integer> optional = numbers.stream().reduce(Integer::sum);
		if (optional.isPresent()) {
			sum = optional.get();
		}
		return sum;
	}

	private static Integer multiplyOfNumber(List<Integer> numbers) {
		return numbers.stream().reduce(1, (a, b) -> a * b);

	}

	private static Integer minimumOfNumber(List<Integer> numbers) {
		Integer min = 0;
		Optional<Integer> optional = numbers.stream().reduce(Integer::min);
		if (optional.isPresent()) {
			min = optional.get();
		}
		return min;

	}

	private static Integer maxOfNumber(List<Integer> numbers) {
		Integer min = 0;
		Optional<Integer> optional = numbers.stream().reduce(Integer::max);
		if (optional.isPresent()) {
			min = optional.get();
		}
		return min;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Integer sumOfNumber = sumOfNumber(numbers);
		System.out.println("sum of numbers: " + sumOfNumber);
	}

}
