package com.giridhar.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastAndFailSafeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(11);
		numbers.add(12);
		numbers.add(13);
		numbers.add(14);
		numbers.add(15);
		Iterator<Integer> iterator = numbers.iterator();
		while(iterator.hasNext()) {
			Integer number = iterator.next();
			System.out.println(number);
			//numbers.add(16);
		}
		
		HashMap<String, Integer> person = new HashMap<>();
		person.put("Manish", 30);
		person.put("Gantu", 31);
		person.put("Sintu", 32);
		person.put("mantu", 33);
		person.put("Suresh", 34);
		
		Iterator<Entry<String, Integer>> personIterator = person.entrySet().iterator();
		while(personIterator.hasNext()) {
			Entry<String, Integer> data = personIterator.next();
			//System.out.println(data.getKey()+" "+data.getValue());
			//person.put("Sanjay", 35);
			personIterator.remove();
			
		}
		
		ConcurrentHashMap<String, Integer> chm = new ConcurrentHashMap<>();
		chm.put("Manish", 30);
		chm.put("Gantu", 31);
		chm.put("Sintu", 32);
		chm.put("mantu", 33);
		chm.put("Suresh", 34);
		
		Iterator<Entry<String, Integer>> chmIterator = chm.entrySet().iterator();
		while(chmIterator.hasNext()) {
			Entry<String, Integer> data = chmIterator.next();
			//System.out.println(data.getKey()+" "+data.getValue());
			//chm.put("Sanjay", 35);
			
			
		}
		System.out.println(chm.size());
		System.out.println("copyonWriteArrayList========================================");
		CopyOnWriteArrayList<Integer> copyOnWriteAL = new CopyOnWriteArrayList<>();
		copyOnWriteAL.add(10);
		copyOnWriteAL.add(11);
		copyOnWriteAL.add(12);
		copyOnWriteAL.add(13);
		copyOnWriteAL.add(14);
		copyOnWriteAL.add(15);
		
		Iterator<Integer> copyOnWriteALIterator = copyOnWriteAL.iterator();
		while(copyOnWriteALIterator.hasNext()) {
			Integer data = copyOnWriteALIterator.next();
			System.out.println(data);
			copyOnWriteAL.add(20);
		}
		

	}

}
