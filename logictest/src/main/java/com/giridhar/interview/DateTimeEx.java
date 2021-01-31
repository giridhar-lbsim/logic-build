package com.giridhar.interview;

import java.time.LocalDate;
import java.time.LocalTime;

import sun.util.resources.TimeZoneNames;

public class DateTimeEx {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		TimeZoneNames timeZoneNames = new TimeZoneNames();
		System.out.println(timeZoneNames);
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);

	}

}
