package com.giridhar.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeFilter {

	// you need to filter all the employee whose age is greater than 20 and print
	// the employee names.(Java 8 APIs only)
	public static List<String> filterEmployee(List<Employee> employeeList) {
		return employeeList.stream().filter(e -> e.getAge() > 20).map(Employee::getFirstName)
				.collect(Collectors.toList());
	}
	//filter employee from list and map it into map
	public static Map<String,Employee> filterEmployeeAndReturnMap(List<Employee> employeeList) {
		 Map<String, Employee> employeeMap =  employeeList.stream().filter(e -> e.getAge() > 20)
				.collect(Collectors.toMap(Employee::getPhone, employee->employee));
		 return employeeMap;
	}

	// count number of employees with age 25
	public static long countEmployeeWithAge(List<Employee> employeeList) {
		return employeeList.stream().filter(e -> e.getAge().equals(25)).count();

	}

	public static void main(String[] args) {

		List<Employee> listOfEmployee = Employee.listOfEmployee();

		System.out.println(filterEmployee(listOfEmployee));
		System.out.println(countEmployeeWithAge(listOfEmployee));

	}

}
