package com.giridhar.designpatterns.builderpattern;

public class Shop {
	
	public static void main(String[] args) {
		//here for creating phone all parameters are mandatory in sequence as in constructor 
		/*
		 * Phone phone = new Phone("Android", 2, "MIUI", 5.5, 4000);
		 * System.out.println(phone.toString());
		 */
		
		//now we will use phone builder for creating phone
		Phone phone2 = new PhoneBuilder().setOs("Android").setRam(2).getPhone();
		phone2
		System.out.println(phone2.toString());
	}

}
