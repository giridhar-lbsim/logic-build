package com.giridhar.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		// linkedHashmap preserves the insertion order
		// Hashmap doesn't give any guarantee of order
		
		// Treemap =>A Red-Black tree based NavigableMap implementation.The map is
		// sorted according to the naturalordering of its keys, or by a Comparator
		// provided at mapcreation time, depending on which constructor is used
		
		// HashMap<Integer, String> students = new HashMap<>();
		TreeMap<Integer, String> students = new TreeMap<>();

		students.put(105, "Suresh");
		students.put(103, "Ganesh");
		students.put(104, "Ravish");

		students.put(101, "Giridhar");
		students.put(102, "Manish");
		/*
		 * Iterator<Entry<Integer, String>> iterator = students.entrySet().iterator();
		 * while(iterator.hasNext()) { Entry<Integer, String> entry = iterator.next();
		 * System.out.println(entry.getKey()+" : "+entry.getValue()); }
		 */
		students.forEach((key, value) -> System.out.println(key + " :" + value));

	}

}
