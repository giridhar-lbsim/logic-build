package com.giridhar.concurrency;

import java.util.HashMap;
import java.util.StringJoiner;

public class ThreadCreation {

	public static void main(String[] args) {
		
		Thread thread = new Thread();
		//thread.
		//java 8 changes in hashmap: while putting element at same index in map, instead of creating very very long link list it creates binary tree
		//for putting element in map. After certain threshold it start putting element in binary tree.
		HashMap<String, Integer> map = new HashMap<>();
		//StringJoiner is used to construct a sequence of characters separatedby a delimiter and optionally starting with a supplied prefixand ending with a supplied suffix.
		//add(): StringJoiner is used to construct a sequence of characters separatedby a delimiter and optionally starting with a supplied prefixand ending with a supplied suffix.
		//Adds the contents of the given StringJoiner without prefix andsuffix as the next element if it is non-empty. If the given StringJoiner is empty, the call has no effect. 
		StringJoiner sj = new StringJoiner(null);

	}

}
