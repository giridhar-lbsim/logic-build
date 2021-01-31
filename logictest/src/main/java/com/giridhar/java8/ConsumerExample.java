package com.giridhar.java8;

import java.util.Arrays;
import java.util.List;

/**
 * In Java 8, Consumer is a functional interface; it takes an argument and
 * returns nothing.
 * 
 * @FunctionalInterface public interface Consumer<T> { void accept(T t); }
 * 
 * @author Giridhar Kumar
 *
 */
@FunctionalInterface
interface Consumer<T> {
	void accept(T t);
}

public class ConsumerExample {

	static <T> void forEachElement(List<T> list, Consumer<T> consumer) {
		for (T t : list) {
			consumer.accept(t);
		}

	}

	public static void main(String[] args) {
		Consumer<String> print = x -> System.out.println(x);
		print.accept("java");
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List<String> nameList = Arrays.asList("giridhar","manish","Ketan","Kumar","Ravi");
		
		Consumer<String> nameConsumer = (String name)->System.out.println(name);
		System.out.println("Name of consumers:");
		forEachElement(nameList,nameConsumer);
		//calling forEachElement method directly
		
		//forEachElement(nameList, (String name)->System.out.println(name));

		Consumer<Integer> consumer = (Integer x) -> System.out.println(x);
		forEachElement(list, consumer);

	}

}
