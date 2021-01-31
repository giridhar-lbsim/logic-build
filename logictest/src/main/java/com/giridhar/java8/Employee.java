package com.giridhar.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

enum Gender {
	MALE, FEMALE, NEUTRAL;
}

public class Employee {
	private Integer age;
	private String firstName;
	private String lastName;
	private Gender gender;
	private String phone;

	public Employee(int age, String firstName, String lastName, Gender gender, String mobile) {
		super();
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phone = mobile;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setMobile(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", mobile=" + phone + "]";
	}

	public static List<Employee> listOfEmployee() {
		List<Employee> employeeList = new ArrayList<>();
		Employee kumod = new Employee(24, "Kumod", "Sharma", Gender.MALE, "1234567890");
		Employee giridhar = new Employee(30, "Giridhar", "Kumar", Gender.MALE, "8527782840");
		Employee ketan = new Employee(34, "Ketan", "Bhardwaj", Gender.MALE, "9087654321");
		Employee manish = new Employee(33, "Manish", "Shinha", Gender.MALE, "9807654321");
		Employee gudiya = new Employee(25, "Gudiya", "Singh", Gender.FEMALE, "9807654321");
		Employee gudiya2 = new Employee(25, "Gudiya", "Bharti", Gender.FEMALE, "9807654321");
		return employeeList = Arrays.asList(kumod, giridhar, ketan, manish, gudiya,gudiya2);

	}
}
