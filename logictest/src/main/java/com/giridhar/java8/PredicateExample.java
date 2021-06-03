package com.giridhar.java8;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
	
	public static List<Employee> filterEmployee(List<Employee> empList, Predicate<Employee> p) {
		return empList.stream().filter(p).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<Employee> listOfEmployee = Employee.listOfEmployee();

		List<Employee> filteredEmployee = filterEmployee(listOfEmployee,
				EmployeePredicates.isOldAge());
		List<Employee> filteredEmployee2 = filterEmployee(listOfEmployee,
				EmployeePredicates.isChild());
		System.out.println(filteredEmployee2);

	}

}

class EmployeePredicates {
	public static Predicate<Employee> isOldAge() {
		return p -> p.getAge() > 25;
	}
	
	public static Predicate<Employee> isChild() {
		return p -> p.getAge() < 25;
	}

	
}
