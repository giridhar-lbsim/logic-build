package com.giridhar.java8.parallel_stream;

import java.util.stream.Stream;

public class SumNNumber {

	public static int sequentialSum(int num) {
		return Stream.iterate(0, i -> i + 1).limit(num).reduce(0, Integer::sum);
	}

	public static int parallelSum(int num) {
		return Stream.iterate(0, i -> i + 1).limit(num).parallel().reduce(0, Integer::sum);
	}

	public static void main(String[] args) {
		System.out.println(sequentialSum(30));
		System.out.println(parallelSum(Runtime.getRuntime().availableProcessors()));
		System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "12");

	}

}
