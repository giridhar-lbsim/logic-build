package com.giridhar.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetEx {

	public static void main(String[] args) {
		// HashSet doesn't preserves the insertion order
		// It uses the HashTable as Data Structure
		// HashSet came in java 1.2 version
		// Duplicates are not allowed
		HashSet<Employee> hs = new HashSet<>();
		Employee emp1 = new Employee(1, "giridhar", "8527782840");
		Employee emp2 = new Employee(1, "giridhar", "8527782840");
		System.out.println(emp1.hashCode()+", emp2: "+emp2.hashCode());
		hs.add(emp1);
		hs.add(emp2);//after overriding hashcode and equals it won't addd emp2 and add will return false
		System.out.println(hs);// it will print value in any order
	}

}
