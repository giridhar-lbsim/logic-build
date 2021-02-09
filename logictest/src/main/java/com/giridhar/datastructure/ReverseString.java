package com.giridhar.datastructure;

import java.util.PriorityQueue;
import java.util.Queue;

public class ReverseString {
	
	public static String reverseString(String inputString) {
		String result="";
		if(inputString !=null) {
			char[] inputArray = inputString.toCharArray();
			int length = inputString.length();
			int iterateTimes = length/2;
			System.out.println("iterateTimes: "+iterateTimes);
			for(int i=0;i<iterateTimes;i++) {
				
				//swaping logic
				char fromBegining = inputArray[i];
				char fromEnd = inputArray[length-1-i];
				inputArray[i] = fromEnd;
				inputArray[length-1-i] = fromBegining;
			}
			result = new String(inputArray);
		}
		return result;
		
	}

	public static void main(String[] args) {
		System.out.println(reverseString("GIRIDHARK"));

	}

}
