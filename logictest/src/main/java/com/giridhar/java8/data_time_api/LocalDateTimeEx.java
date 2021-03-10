package com.giridhar.java8.data_time_api;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("current date and time: "+dt);
		int dayOfMonth = dt.getDayOfMonth();
		int monthValue = dt.getMonthValue();
		Month month = dt.getMonth();
		int year = dt.getYear();
		
		System.out.printf("\nDate: %d-%d-%d ",dayOfMonth,monthValue,year);
		
		int hour = dt.getHour();
		int minute = dt.getMinute();
		int second = dt.getSecond();
		int nano = dt.getNano();
		System.out.printf("\nTime: %d:%d:%d:%d ",hour,minute,second,nano);
		
		//to represent perticular date and time
		LocalDateTime dob = LocalDateTime.of(1988,Month.MARCH,04,16,45);
		System.out.println("\nMy DOB: "+dob);
		System.out.println("after 6 months: "+dob.plusMonths(6));
		System.out.println("Before 6 months: "+dob.minusMonths(6));

	}

}
