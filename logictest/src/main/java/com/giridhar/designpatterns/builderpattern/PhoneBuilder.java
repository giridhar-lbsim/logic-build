package com.giridhar.designpatterns.builderpattern;

public class PhoneBuilder {

	// phone builder will have the same property as of Phone
	private String os;
	private int ram;
	private String processor;
	private double screenSize;
	private int battery;

	// now we need to create only setters with return type PhoneBuilder
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}

	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}

	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}

	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}

	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	//we will create a method which will return Phone object
	public Phone getPhone() {
		return new Phone(os, ram, processor, screenSize, battery);
	}

}
