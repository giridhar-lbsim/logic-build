package com.giridhar.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<Object>{

	public int compare(Object obj1, Object obj2) {
		//logic for descending order
		Integer i1 = (Integer)obj1;
		Integer i2 = (Integer)obj2;
		/*
		 * if(i1<i2) return +1; else if(i1>i2) return -1; else return 0;
		 */
		return i2.compareTo(i1);
		
	}
	
}

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>(new MyComparator());
		
		t.add(5);
		t.add(10);
		t.add(0);
		t.add(20);
		t.add(15);
		
		System.out.println(t);

	}

}
