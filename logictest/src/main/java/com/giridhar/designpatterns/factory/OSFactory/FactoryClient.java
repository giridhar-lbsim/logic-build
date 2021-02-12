package com.giridhar.designpatterns.factory.OSFactory;

public class FactoryClient {
	
	public static void main(String[] args) {
		/*
		 * OS android = new Android(); android.spec();
		 */
		OSFactory factory = new OSFactory();
		OS os = factory.getInstance("ios");
		os.spec();
		
		
		
	}

}
