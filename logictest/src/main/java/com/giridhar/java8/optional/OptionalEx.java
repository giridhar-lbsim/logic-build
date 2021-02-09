package com.giridhar.java8.optional;

import java.util.Optional;

public class OptionalEx {

	public Optional<Insaurance> findNullSafeCheapestInsaurance(Optional<Person> person, Optional<Car> car) {

		if (person.isPresent() && car.isPresent()) {
			return Optional.of(findCheapestInsaurance(person.get(), car.get()));

		} else {
			return Optional.empty();
		}

	}

	// instead of putting if condition we can do in single statement
	public Optional<Insaurance> nullSafeFindCheapestInsaurance(Optional<Person> person, Optional<Car> car) {
		return person.flatMap(p -> car.map(c -> findCheapestInsaurance(p, c)));

	}

	private Insaurance findCheapestInsaurance(Person p, Car c) {
		// busuness logic for fetching cheapest insaurance
		return null;
	}

	private void filterInOptional() {
		/*
		 * Insaurance insaurance = new Insaurance();
		 * 
		 * if(insaurance !=null && "CambridgeInsaurance".equals(insaurance.getName()));
		 */

		// This pattern can be rewritten using the filter method on an Optional object,
		// as follows:
		Optional<Insaurance> optInsaurance = Optional.ofNullable(new Insaurance());
		optInsaurance.filter(insaurance -> "CambridgeInsaurance".equals(insaurance.getName()))
				.ifPresent(i -> System.out.println("Ok"));
	}

	public String getInsauranceName(Optional<Person> person, int minAge) {

		return person.filter(p -> p.getAge() >= minAge).flatMap(Person::getCar).flatMap(Car::getInsaurance)
				.map(Insaurance::getName).orElse("Unknown");

	}

}
