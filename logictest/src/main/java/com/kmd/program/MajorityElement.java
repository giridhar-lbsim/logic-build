package com.kmd.program;

import java.util.HashMap;

public class MajorityElement {
	 private static int findMajority(int[] arr) 
	    {
	        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
	 
	        for(int i = 0; i < arr.length; i++) {
	            if (map.containsKey(arr[i])) {
	                    int count = map.get(arr[i]) +1;
	                    if (count > arr.length /2) {
	                        return arr[i];
	                    } else
	                        map.put(arr[i], count);
	            }
	            else
	                map.put(arr[i],1);
	            }
	        
	            return -1;
	    }
	  
	    public static void main(String[] args) 
	    {
	        int a[] = new int[]{2,2,2,2,5,5,2,3,3};
	         
	       System.out.println(findMajority(a));
	    }
}