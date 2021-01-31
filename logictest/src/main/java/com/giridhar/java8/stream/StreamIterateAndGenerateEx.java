package com.giridhar.java8.stream;

import java.util.stream.Stream;

public class StreamIterateAndGenerateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print all even number to n
		//Stream.iterate(0, n->n+2).limit(10).forEach(System.out::println);
		//print all odd number
		//Stream.iterate(1, n->n+2).limit(10).forEach(System.out::println);
		//print fibonacci series upto 20
		Stream.iterate(new int[] {0,1}, t->new int[] {t[1],t[0]+t[1]}).limit(20).map(t->t[0]).forEach(System.out::println);
	}

}
