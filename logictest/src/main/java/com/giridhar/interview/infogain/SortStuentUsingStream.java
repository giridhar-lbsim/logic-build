package com.giridhar.interview.infogain;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


class Student {
	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}

public class SortStuentUsingStream {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(new Student(1, "giridahr"), new Student(3, "Kumod"),
				new Student(2, "Raja"), new Student(6,"Dhiraj"),new Student(4,"Ravi"));
		List<Student> sortedStudent = studentList.stream().sorted(Comparator.comparing(Student::getId))
				.collect(Collectors.toList());

		//sortedStudent.forEach(student -> System.out.println(student));
		Consumer<Student> consumer = student->System.out.println(student);
		//forEach takes consumer as an argument
		sortedStudent.forEach(consumer);
	
		//mindtree question
		// filter list >10 and then square than greater than 1000 and then get average
		List<Integer> list = Arrays.asList(8,30,40,50);
		Predicate<Integer> isGreaterThan10 = e -> e > 10;
		Function<Integer, Integer> square = e -> e * e;
		Predicate<Integer> isGreaterThan1000 = e -> e > 1000;
		
		OptionalDouble result = list.stream().filter(isGreaterThan10).map(square).filter(isGreaterThan1000)
				.mapToInt(Integer::intValue).average();
		System.out.println("result:"+result.getAsDouble());
	}

}
