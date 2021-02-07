package com.kmd.program.designpattern;

import java.util.List;

public class ProtoTypeDesignPattern {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employees emp = new Employees();
		emp.loadData();
		Employees emp1 = (Employees) emp.clone();
		Employees emp2 = (Employees) emp.clone();
		List<String> list1 = emp1.getEmpList();
		list1.add("Mohan Ram");
		List<String> list2 = emp2.getEmpList();
		list2.remove("Manish");

		System.out.println("emps List: " + emp.getEmpList());
		System.out.println("empsNew List: " + list1);
		System.out.println("empsNew1 List: " + list2);
	}
}
