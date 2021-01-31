package com.giridhar.java8;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;

/*class AgeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getAge()>o2.getAge();
	}
	
}*/

public class MaximumAgeOfEmployee {
	
	public static Integer findMaximumAgeEmployee(List<Employee> employeeList) throws Exception {
		
		OptionalInt max = employeeList.stream().mapToInt(Employee::getAge).max();
		
		if(max.isPresent())
		{
			return max.getAsInt();
		}
		else
			throw new Exception("No element found!");
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		List<Employee> listOfEmployee = Employee.listOfEmployee();
		System.out.println(findMaximumAgeEmployee(listOfEmployee));

	}

}
