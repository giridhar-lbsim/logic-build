package com.giridhar.oopsconcepts;

import java.io.IOException;

class A{
	void m1() throws Exception{
		System.out.println("In A m1");
	}
}
class B extends A{
	void m1() throws IOException{
		System.out.println("In B m1");
	}
	void m2() {
		System.out.println("In B m2");
	}
}

public class InheritanceEx {

	public static void main(String[] args) throws Exception {
		A a=new B();
		//a.m2();//reference a won't be able to m2() of B class

	}

}
