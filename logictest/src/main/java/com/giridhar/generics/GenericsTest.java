package com.giridhar.generics;

import java.util.ArrayList;

public class GenericsTest {
	public static void m1(ArrayList al){
		al.add(10);
		al.add(10.5);
		al.add(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("giridhar");
		al.add("kumar");
		//al.add(10);//CE
		m1(al);
		//al.add(10.5);//Compile Error

	}

}



