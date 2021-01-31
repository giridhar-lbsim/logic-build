package com.giridhar.java8;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindEmployeeWithName {
	
	public static Employee filterEmployeeWithName(List<Employee> employeeList) throws Exception {
		Optional<Employee> employee = employeeList.stream()
				.filter(e->e.getFirstName().equalsIgnoreCase("Gudiya"))
				//.findFirst();
				.findAny();
				//.collect(Collectors.toList());
		if(employee.isPresent())
		return employee.get();
		else {
			throw new Exception("No user found");
			
		}
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(filterEmployeeWithName(Employee.listOfEmployee()));
		
	}

}
