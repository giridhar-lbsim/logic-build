package com.giridhar.collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		//LinkedHashSet preserves the insertion order
		//It uses the mix of HashTable and LinkedList
		//LinkedHashSet came in java 1.4 version
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("B");
		lhs.add("C");
		lhs.add("Z");
		lhs.add(null);
		lhs.add(10);
		System.out.println(lhs);//it will print B C Z null 10
		

	}

}
