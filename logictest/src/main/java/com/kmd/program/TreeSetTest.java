package com.kmd.program;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		String s1 = "kumod";
		String s2 = new String("kumod");
		StringBuffer s3 = new StringBuffer("Kumod");
		StringBuffer s4 = new StringBuffer("Kumar");
		StringBuffer s5 = new StringBuffer("Kumod");
		TreeSet t = new TreeSet();
		t.add(s1);
		t.add(s2);
		/**
		 * The issue is that TreeSet sorts the items you put in it. Because StringBuffer doesn't
		 * implement  Comparable, the TreeSet doesn't know how to sort them.
		 */
		//t.add(s3);
		//t.add(s4);
		TreeSet<StringBuffer> ts = new TreeSet<>(new Comparatorbuff());
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		System.out.println("result : "+ ts);
	}
}

class Comparatorbuff implements Comparator<StringBuffer> {

    @Override
    public int compare(StringBuffer s1, StringBuffer s2) {
        return s1.toString().compareTo(s2.toString());
    }

}

