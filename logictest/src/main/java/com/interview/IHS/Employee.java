package com.interview.IHS;

public class Employee {
	
	public static void main(String[] args) {
		Salary s = new Salary(5);
		System.out.println(s.getSalary());
		change(s);
		System.out.println(s.getSalary());
	}

	public static void change(Salary s) {
		s = null;
	}

}

class Salary {
	int salary;

	public Salary(int salary) {
		this.salary = salary;

	}

	public int getSalary() {
		return this.salary;
	}
}
