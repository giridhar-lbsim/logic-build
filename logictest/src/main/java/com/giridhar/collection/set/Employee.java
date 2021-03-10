package com.giridhar.collection.set;

public class Employee {
	
	private int empId;
	private String name;
	private String phoneNumber;
	
	
	public Employee(int empId, String name, String phoneNumber) {
		super();
		this.empId = empId;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee)obj;
		return ( emp.getEmpId() == this.getEmpId() )&& (emp.getName().equals(this.getName())) && (emp.getPhoneNumber().equals(this.getPhoneNumber()));
	}
	
	@Override
	public int hashCode() {
		return 17*empId*name.hashCode()*phoneNumber.hashCode();
	}
	
	

}
