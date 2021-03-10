package com.giridhar.java8.data_time_api;

import java.time.Year;

public class YearEx {

	public static void main(String[] args) {

		///////////////////////////Year java8 class
		//check leap year
		int inputYear = 1985;
		Year year = Year.of(inputYear);
		if (year.isLeap()) {
			System.out.printf("%d year is leap year", inputYear);
		} else
			System.out.printf("%d year is not a leap year", inputYear);
	}

}
