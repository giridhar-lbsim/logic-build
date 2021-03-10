package com.giridhar.java8.data_time_api;

import java.time.ZoneId;

public class ZoneIdEx {

	public static void main(String[] args) {
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
	}

}
