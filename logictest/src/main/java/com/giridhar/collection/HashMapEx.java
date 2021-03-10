package com.giridhar.collection;

import java.util.HashMap;
import java.util.Map;

class CustomInteger{
	private int vaule;
	public CustomInteger(int value) {
		this.vaule = value;
	}

	/*
	 * @Override public int hashCode() { return 1; }
	 * 
	 * @Override public boolean equals(Object obj) { // TODO Auto-generated method
	 * stub if(this == obj) return true; if(!(obj instanceof CustomInteger)) return
	 * false; CustomInteger other = (CustomInteger)obj;
	 * 
	 * return this.vaule == other.vaule; }
	 */
	@Override
	public String toString() {
		return "CustomInteger [vaule=" + vaule + "]";
	}
	
}
public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<CustomInteger, Integer> mapObj = new HashMap<>();
		mapObj.put(new CustomInteger(1), 1);
		mapObj.put(new CustomInteger(2), 2);
		mapObj.put(new CustomInteger(2), 4);
		mapObj.put(new CustomInteger(1), 7);
		System.out.println(mapObj);
	}

}
