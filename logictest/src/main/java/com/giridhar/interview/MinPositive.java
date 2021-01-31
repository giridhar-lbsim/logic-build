package com.giridhar.interview;

import java.util.HashMap;

public class MinPositive {
	
	public static final Integer solution(int[] A) {
	    HashMap<Integer, Integer> map = new HashMap<>(A.length); //O(n) space

	    for (int i : A) {
	        if (!map.containsKey(i)) {
	            map.put(i, i);
	        }
	    }

	    int minorPositive = 100000;
	    for (int i : A) {
	        if (!map.containsKey(i + 1)) {
	            if (i < minorPositive) {
	                minorPositive = i + 1;
	            }
	        }
	    }

	    if (minorPositive < 0){
	        minorPositive = 1;
	    }
	    return minorPositive;

	}

	public static void main(String[] args) {
		int[] array = new int[] {1,2,3};
		System.out.println("result: "+solution(array));

	}

}
