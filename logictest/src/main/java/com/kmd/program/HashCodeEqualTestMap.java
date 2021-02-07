package com.kmd.program;

import java.util.HashMap;

public class HashCodeEqualTestMap {
	public static void main(String[] args) {
		Emp e1 = new Emp();
		Emp e2 = new Emp();

		e1.setId(100);
		e2.setId(100);

		System.out.println(e1.equals(e2));

		HashMap<Emp, Integer> employees = new HashMap<Emp, Integer>();
		employees.put(e1, 1);
		employees.put(e2, 3);
		System.out.println(employees);
	}
}
