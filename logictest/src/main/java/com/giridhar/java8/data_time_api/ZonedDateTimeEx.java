package com.giridhar.java8.data_time_api;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeEx {

	public static void main(String[] args) {
		//get current time Americas/Los Angeles
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt = ZonedDateTime.now(la);
		System.out.println("Americas/Los Angeles current time: "+zt);
		System.out.println("Americas/Los Angeles current time: "+ZonedDateTime.now());

	}

}
