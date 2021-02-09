package com.kmd.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortWithoutLambda {

	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}
		
		//sort by age
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getAge() - o2.getAge();
			}
		});
	
		System.out.println("After Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}
		
	}

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("Anu", new Integer("30"), 60000));
		result.add(new Developer("Kumod", new Integer("32"), 92000));
		result.add(new Developer("Raja", new Integer("45"), 52000));
		result.add(new Developer("Sweta", new Integer("35"), 35000));
		
		return result;

	}
}
