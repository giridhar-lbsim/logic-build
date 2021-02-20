package com.giridhar.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Apple {
	private String color;
	private int weight;

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

	public Apple(String color, int weight) {
		this.color = color;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Apple [color=" + color + ", weight=" + weight + "]";
	}

}

interface ApplePredicate {
	public boolean test(Apple a);
}

class AppleGreenColorPredicate implements ApplePredicate {

	@Override
	public boolean test(Apple a) {
		return "green".equals(a.getColor());
	}

}

class AppleHeavyWeightPredicate implements ApplePredicate {
	@Override
	public boolean test(Apple a) {
		return a.getWeight() > 150;
	}
}

public class AppleFilter {

	public static List<Apple> filterApple(List<Apple> inventry, ApplePredicate ap) {
		List<Apple> resultList = new ArrayList<>();
		for (Apple apple : inventry) {
			if (ap.test(apple)) {
				resultList.add(apple);
			}

		}
		return resultList;
	}

	public static void main(String[] args) {
		Apple a1 = new Apple("red", 130);
		Apple a2 = new Apple("blue", 190);
		Apple a3 = new Apple("green", 140);
		Apple a4 = new Apple("green", 160);
		List<Apple> inventry = Arrays.asList(a1, a2, a3, a4);

		List<Apple> filterAppleResult = filterApple(inventry, new AppleGreenColorPredicate());
		List<Apple> filterHeavyApple = filterApple(inventry, new AppleHeavyWeightPredicate());
		System.out.println("number of green apple:" + filterAppleResult.size());
		System.out.println("green apple:" + filterAppleResult);

		System.out.println("number of heavy apple: " + filterHeavyApple);
		// apple comparator
		Comparator<Apple> appleComparator = (Apple apple1, Apple apple2) -> apple1.getColor()
				.compareTo(apple2.getColor());
		
		display(null);

	}

	private static void display(Object o) {
		System.out.println("Object parameter");
		
	}

	/*
	 * private static void display(String o) {
	 * System.out.println("String parameter"); }
	 */
	private static void display(Integer o) {
		System.out.println("Integer parameter");
	}

}
