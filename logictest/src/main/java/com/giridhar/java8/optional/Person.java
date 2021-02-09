package com.giridhar.java8.optional;

import java.util.Optional;

public class Person {
	private Optional<Car> car;
	private Integer age;

	public Optional<Car> getCar() {
		return car;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
