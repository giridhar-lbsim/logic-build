package com.giridhar.java8.stream;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

class Filter{
	
}

public class DixtinctCharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("aaryanna","aayanna","airianna");
		
		//names.stream().filter(name->name.startsWith("aa")).map(name->name.chars().distinct().count()).forEachOrdered(System.out::println);
		names.stream().filter(startsWithPrefix("aa")).map(distinctCharacterCount()).forEachOrdered(System.out::println);

	}
	public static Predicate<String> startsWithPrefix(String prefix){
		return t->t.startsWith(prefix);
		
	}
	public static Function<String, Long> distinctCharacterCount(){
		
		return name->name.chars().distinct().count();
		
	}

}
 