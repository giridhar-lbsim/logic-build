package com.giridhar.oopsconcepts;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent{
	public static void m1() throws IOException {
		System.out.println("parent's class m1 method.");
	}
}
class Child extends Parent{
	public static void m1() throws FileNotFoundException{
		System.out.println("child's class static method");
	}
}

public class StaticMethodOverrideEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent chobj = new Child();
		
		try {
			chobj.m1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
