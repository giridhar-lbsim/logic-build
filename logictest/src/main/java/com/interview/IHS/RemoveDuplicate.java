package com.interview.IHS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr [] = { "AB", "BA", "AB", "CA"};
		//to remove duplicate using hashset
		HashSet<String> hs = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			hs.add(arr[i]);
		}
		//for sorting hashset convert hashset into arraylist
		//use this arraylist in sort method of Collections
		ArrayList<String> arrayList = new ArrayList<String>(hs);
		Collections.sort(arrayList);
		//convert hashset into TreeSet
		TreeSet<String> treeSet = new TreeSet<>(hs);
		System.out.println(treeSet);
		System.out.println(arrayList);

	}

}
