package com.giridhar.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee implements Comparable<Employee> {
	private int salary;

	public Employee(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return  o.getSalary()-this.getSalary();
	}

}

public class EpamInterView {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(6, 30, 40, 50);
		// filter element>10 then square then >1000 and avrg
		// list.stream().filter(el->el>10).filter(el->el*el).filter(el->el>1000).collect(Collectors.toList()));
		Predicate<Integer> isGreaterThan10 = e -> e > 10;
		Function<Integer, Integer> squareFunction = e -> e * e;
		Predicate<Integer> isGreaterThan1000 = e -> e > 1000;
		OptionalDouble result = list.stream().filter(isGreaterThan10).map(squareFunction).filter(isGreaterThan1000)
				.mapToInt(Integer::intValue).average();
		System.out.println("result: " + result.getAsDouble());

		/////// get top 5 salaried employee
		List<Employee> empList = Arrays.asList(new Employee(30000), new Employee(40000), new Employee(50000),
				new Employee(60000),new Employee(70000),new Employee(55000),new Employee(65000));
		List<Employee> collect = empList.stream().filter(emp->emp.getSalary()>50000).sorted().limit(3).collect(Collectors.toList());
		System.out.println("top 3: " + collect);
	}

}
