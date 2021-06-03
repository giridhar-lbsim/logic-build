package com.giridhar.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapIterationEx {

	public static void main(String[] args) {
		Map<String, Integer> entries = new HashMap<>();
		entries.put("giridhar", 1);
		entries.put("Kumod", 2);
		entries.put("Ravi",3);
		entries.put("Raja", 4);
		entries.forEach((key,value)->System.out.println("key: "+key+" value: "+value));

	}

}
