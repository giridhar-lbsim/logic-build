package com.giridhar.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//mindtree interview questions
/*@RestController
class EmployeeController{
	@MediaType(Application.JSON)
	@Postmapping(value="/employee")
	public ResponseEntity<> registerUser(@RequestBody Employee emp){
		
	}
	

}*/

class EmployeeSingleton {

	public static volatile EmployeeSingleton INSTANCE = null;

	private EmployeeSingleton() {

	}

	synchronized public static EmployeeSingleton getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new EmployeeSingleton();
		}
		return INSTANCE;
	}

}

/*
 * interface Employee{} class EmployeeCriteria{
 * 
 * }
 * 
 * EmployeeRepository extends JpaRepository<Employee, Long>{
 * 
 * @Qy findAll(EmployeeCriteria criteria); findByNameAndCityAndAge }
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// filter list >10 and then square than greater than 1000 and then get average
		List<Integer> list = Arrays.asList(8,30,40,50);
		/*
		 * list.stream().filter(num -> num >
		 * 10).collect(Collectors.toList()).stream().map(num -> num * num)
		 * .collect(Collectors.toList()).stream().filter(num -> num >
		 * 1000).collect(Collectors.toList()).stream() .map();
		 */
		Predicate<Integer> isGreaterThan10 = e -> e > 10;
		Function<Integer, Integer> square = e -> e * e;
		Predicate<Integer> isGreaterThan1000 = e -> e > 1000;
		OptionalDouble result = list.stream().filter(isGreaterThan10).map(square).filter(isGreaterThan1000)
				.mapToInt(Integer::intValue).average();
		System.out.printf("result: %d",result);

		// find the duplicate characters
		String input = "java";// a
		int count = 0;
		int length = input.length();
		for (int i = 0; i < length; i++) {
			char charAt = input.charAt(i);
			char nextChar = input.charAt(i + 1);

			ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(5);

		}

	}

}
