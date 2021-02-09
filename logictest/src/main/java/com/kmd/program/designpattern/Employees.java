package com.kmd.program.designpattern;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

	private List<String> empList;

	public Employees() {
		empList = new ArrayList<>();
	}

	public Employees(List<String> list) {
		this.empList = list;
	}

	public void loadData() {
		empList.add("Komal");
		empList.add("Sweta");
		empList.add("Ketan");
		empList.add("Manish");
		empList.add("Sandy");
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for (String s : this.getEmpList()) {
			temp.add(s);
		}
		return new Employees(temp);
	}

	public List<String> getEmpList() {
		return empList;
	}
	
}
