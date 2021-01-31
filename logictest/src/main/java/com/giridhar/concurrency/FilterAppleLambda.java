package com.giridhar.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

class Apple {
	private String color;;
	private int weight;

	public Apple(String color, int weight) {
		this.color = color;
		this.weight = weight;
	}
	public static boolean isAppleGreen(Apple apple) {
		return "green".equals(apple.getColor());
	}

	public static boolean isHeavyApple(Apple apple) {
		return apple.getWeight() > 150;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}

/*
 * interface Predicate<T> { boolean test(T t); }
 */

public class FilterAppleLambda {



	static List<Apple> filterApples(List<Apple> inventry, Predicate<Apple> p) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventry) {
			if (p.test(apple)) {
				result.add(apple);
			}
		}
		return result;

	}

	public static void main(String[] args) {
		List<Apple> inventry = new ArrayList<>();
		Apple greenApple = new Apple("green",190);
		Apple redApple = new Apple("red",180);
		Apple greenApple2 = new Apple("green",120);
		inventry.add(greenApple);
		inventry.add(greenApple2);
		inventry.add(redApple);
		List<Apple> filterApples = filterApples(inventry, Apple::isAppleGreen);
		List<Apple> filterApples2 = filterApples(inventry,Apple::isHeavyApple);
		System.out.println("number of green apple:"+filterApples.size());
		System.out.println("number of heavy apple: "+filterApples2.size());
		

		// TODO Auto-generated method stub

	}

}
