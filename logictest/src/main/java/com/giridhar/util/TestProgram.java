package com.giridhar.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import com.interview.IHS.Department;

public class TestProgram implements Cloneable {

	private String firstName;
	private String lastName;
	private String age;
	private Department department;

	public TestProgram(String fname, String lname, String age, Department department) {
		this.firstName = fname;
		this.lastName = lname;
		this.age = age;
		this.department = department;
	}

	public TestProgram() {
		// TODO Auto-generated constructor stub
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "TestProgram [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", department="
				+ department + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		//we can't create object of Abstract class, although we can create constructor of abstract class.
    	//AbstractExample abstractExample = new AbstractExample();
		
		//we can't create object of Collections utility class because it has private constructor. Collections utility class has all the static methods.
		 //Collections objCollections;
		
		Department department = new Department("ABC", "Noida", "1234567890");
		TestProgram obj1 = new TestProgram("giridhar", "kumar", "30", department);

		TestProgram obj2 = new TestProgram(obj1.getFirstName(), obj1.getLastName(), obj1.getAge(), obj1.getDepartment());

		// TestProgram obj3 =obj;
		if (obj1.equals(obj2))
			System.out.println("Both the object are equal");
		else
			System.out.println("Both the object are not equal");
		if (obj1 == obj2)
			System.out.println("== equal");
		else
			System.out.println("== not equal");
		
		System.out.println("hashcode of obj1= "+obj1.hashCode()+"  hashcode of obj2 = "+obj2.hashCode());
		/*
		 * TestProgram obj1; try { obj1 = (TestProgram) obj.clone();
		 * System.out.println(obj1.getDepartment()); } catch (CloneNotSupportedException
		 * e) { e.printStackTrace(); }
		 */

		// TestProgram deepCopy = new TestProgram(obj.getFirstName(), lname, age)
		Thread t;
		
		int min1 = Arrays.stream(new int[]{1, 2, 3, 4, 5})
				  .min()
				  .orElse(0);
				//assertEquals(1, min1);

				int min2 = Arrays.stream(new int[]{})
				  .min()
				  .orElse(0);
				//assertEquals(0, min2);
				
				//Collection<E>
		
		
	}
}
