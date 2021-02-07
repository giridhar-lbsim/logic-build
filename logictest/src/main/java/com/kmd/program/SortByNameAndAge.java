package com.kmd.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByNameAndAge {

	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}

		// sort by name first then age
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer t, Developer t1) {
				int comp = t.getName().compareTo(t1.getName());
				if (comp != 0) {
					return comp;
				}
				return t.getAge() - t1.getAge();
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
		result.add(new Developer("Sweta", new Integer("32"), 92000));
		result.add(new Developer("Raja", new Integer("45"), 52000));
		result.add(new Developer("Kumod", new Integer("35"), 35000));
		return result;
	}
}
