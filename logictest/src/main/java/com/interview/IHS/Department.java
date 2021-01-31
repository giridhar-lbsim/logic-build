package com.interview.IHS;

public class Department {
	private String name;
	private String address;
	private String telephoneNumber;

	public Department(String name, String address, String telephoneNumber) {
		this.name = name;
		this.address = address;
		this.telephoneNumber = telephoneNumber;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", address=" + address + ", telephoneNumber=" + telephoneNumber + "]";
	}

}
