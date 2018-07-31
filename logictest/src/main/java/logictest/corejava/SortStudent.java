package logictest.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

class Student {

	private int id;
	private String firstName;
	private double cgpa;

	public Student() {
		super();
	}

	public Student(int id, String firstName, double cgpa) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", cgpa=" + cgpa + "]";
	}

}

public class SortStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = new ArrayList<Student>();
		Student rumpa = new Student(33, "Rumpa", 3.68);
		Student ashis = new Student(85, "Ashis", 3.85);
		Student samiha = new Student(56, "Samiha", 3.75);
		Student samara = new Student(19, "Samara", 3.75);
		Student fahim = new Student(22, "Fahim", 3.76);
		studentList.add(rumpa);
		studentList.add(ashis);
		studentList.add(samiha);
		studentList.add(samara);
		studentList.add(fahim);

		for (Student st : studentList) {
			System.out.println(st.getFirstName());
		}

	}

}
