package com.giridhar.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
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
	private long salary;
	private Date dob;

	

	public Employee(Integer age, String firstName, String lastName, Gender gender, String phone, long salary) {
		super();
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phone = phone;
		this.salary = salary;
	}
	
	
	public Employee(Integer age, String firstName, String lastName, Gender gender, String phone, long salary,
			Date dob) {
		super();
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phone = phone;
		this.salary = salary;
		this.dob = dob;
	}




	public long getSalary() {
		return salary;
	}


	public void setSalary(long salary) {
		this.salary = salary;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public void setPhone(String phone) {
		this.phone = phone;
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
		Employee kumod = new Employee(24, "Kumod", "Sharma", Gender.MALE, "1234567890",55000);
		Employee giridhar = new Employee(30, "Giridhar", "Kumar", Gender.MALE, "8527782840",56000);
		Employee ketan = new Employee(34, "Ketan", "Bhardwaj", Gender.MALE, "9087654321",45000);
		Employee manish = new Employee(33, "Manish", "Shinha", Gender.MALE, "9807654321",60000);
		Employee gudiya = new Employee(25, "Gudiya", "Singh", Gender.FEMALE, "9807654321",35000);
		Employee gudiya2 = new Employee(25, "Gudiya", "Bharti", Gender.FEMALE, "9807654321",75000);
		return employeeList = Arrays.asList(kumod, giridhar, ketan, manish, gudiya,gudiya2);

	}
}
