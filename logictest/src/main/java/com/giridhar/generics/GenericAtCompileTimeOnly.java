package com.giridhar.generics;

import java.util.ArrayList;

public class GenericAtCompileTimeOnly {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<String>();
		al.add(10);
		al.add("giridhar");
		al.add(true);
		System.out.println("list: "+al);

	}

}
