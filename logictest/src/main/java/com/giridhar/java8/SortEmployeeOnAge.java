package com.giridhar.java8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class EmployeeAgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getAge() - o2.getAge();
	}

}

public class SortEmployeeOnAge {

	public static List<Employee> sortEmployeeOnAge(List<Employee> employeeList) {
		// employeeList.sort((e1,e2)->e1.getAge()-e2.getAge());
		employeeList.sort(new EmployeeAgeComparator());
		// employeeList.forEach(System.out::println);
		return employeeList;
//		employeeList.stream().sorted(comparator)

	}
	public static List<String> joinNameWithComma(List<Employee> employeeList) {
		return employeeList.stream().map(Employee::getFirstName).collect(Collectors.toList());
		
	}

	public static void main(String[] args) {
		List<Employee> listOfEmployee = Employee.listOfEmployee();
		List<String> joinNameWithComma = joinNameWithComma(listOfEmployee);
		System.out.println(String.join(",", joinNameWithComma));
		System.out.println(sortEmployeeOnAge(listOfEmployee));
		


	}

}
