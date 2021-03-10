package com.giridhar.java8.data_time_api;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateLocalTimeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		System.out.println("current date: "+date);
		System.out.println("day of month: "+date.getDayOfMonth());
		System.out.println("get month value: "+date.getMonthValue());
		System.out.println("get year: "+date.getYear());
		

		System.out.printf("%d-%d-%d",date.getDayOfMonth(),date.getMonthValue(),date.getYear());
		
		
		LocalTime time = LocalTime.now(); 
		System.out.println("\ncurrent time: "+time);
		
		System.out.printf("\n%d-%d-%d-%d",time.getHour(),time.getMinute(),time.getSecond(),time.getNano());
		

	}

}
