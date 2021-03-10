package com.giridhar.designpatterns.singleton;

class Employee {
	// static field containing its only instance
	private static volatile Employee instance;

	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// private constructor
	private Employee() {

	}

	// static factory method for obtaining the instance
	/*
	 * public static Employee getInstance() { if (instance == null) {
	 * System.out.println("instance is null"); instance = new Employee(); } return
	 * instance; }
	 */
	//thread safe getInstance method
	/*
	 * public static synchronized Employee getInstance() { if(instance == null) {
	 * instance =new Employee(); } return instance; }
	 */
	//double checked locking implementation
	public static Employee getInstance() {
		if(instance == null) {
			synchronized(Employee.class) {
				if(instance == null) {
					instance = new Employee();
				}
			}
		}
		return instance;
	}
}

public class SingletonPatternEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee singletonInstance = Employee.getInstance();
		singletonInstance.setFirstName("Giridhar");
		singletonInstance.setLastName("Kumar");
		Employee singletoninstance2 = Employee.getInstance();
		singletoninstance2.setLastName("Yadav");
		Employee instance3 = Employee.getInstance();

		System.out.println(singletoninstance2.getFirstName() + "   " + singletoninstance2.getLastName());

	}

}
