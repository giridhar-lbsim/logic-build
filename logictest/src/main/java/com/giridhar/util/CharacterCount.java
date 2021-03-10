package com.giridhar.util;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

	public static void main(String[] args) {
		String name = "asasasas";//output should be a3s3
	
		int count = 0;
		int length = name.length();
		Map<Character, Integer> map=new HashMap<>();
		for(int i=0;i<length-1;i++) {
			System.out.println(name.charAt(i));
			count=0;
			for(int j=0;j<length-1;j++) {
				if(name.charAt(i) == name.charAt(j)) {
					count++;
				}
			}
			System.out.println("count: "+count);
		}
	}

}
