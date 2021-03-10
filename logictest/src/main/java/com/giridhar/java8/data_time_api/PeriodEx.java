package com.giridhar.java8.data_time_api;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.util.HashMap;
import java.util.Map;

public class PeriodEx {

	public static void main(String[] args) {
		//get my age
		LocalDate dob = LocalDate.of(1988,Month.MARCH, 04);
		LocalDate currentDate=LocalDate.now();
		Period period = Period.between(dob, currentDate);
		System.out.printf("I am %d years and %d months and %d days",period.getYears(),period.getMonths(),period.getDays());;
		
		//get how many days you are going to be on earth
		LocalDate deathDay= LocalDate.of(1988, Month.MARCH, 04);
		Period deathPeriod = Period.between(deathDay, currentDate);
		int remainingDays = deathPeriod.getYears()*365+deathPeriod.getMonths()*30+deathPeriod.getDays();
		System.out.println("\nYou are going to live only: "+remainingDays+" days, hurry up finish all your important work");
		
		///////////////////////////Year java8 class
		//check leap year
		int inputYear = 1985;
		Year year = Year.of(inputYear);
		if(year.isLeap()) {
			System.out.printf("%d year is leap year",inputYear);
		}else
			System.out.printf("%d year is not a leap year",inputYear);
		//get all character count
		String input = "My name is giridhar";
		Map<Character,Integer> charCount = new HashMap<>();
		int size = input.length();
		for(int i=0;i<size;i++) {
			char ch = input.charAt(i);
			 
		}

	}

}
