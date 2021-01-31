package com.giridhar.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeeByName {

	public static void groupEmployeeByName(List<Employee> employeeList) {
		Map<String, List<Employee>> collect = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getFirstName));
		collect.forEach((name, employeeListTemp) -> System.out.println(name + " " + employeeListTemp));
	}

	public static void main(String[] args) {
		List<Employee> listOfEmployee = Employee.listOfEmployee();
		groupEmployeeByName(listOfEmployee);

	}

}
