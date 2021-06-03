package com.giridhar.util;

class MyThread extends Thread{
	public MyThread() {
		System.out.println("MyThread");
	}
	public void run() {
		System.out.println("Foo");
	}
	public void run(String s) {
		System.out.println("Baz");
	}
}
public class FizzBuzz {
	private int x=2;
	protected int y=3;
	private static int x1=4;
	protected static int y1=5;
	public static void main(String[] args) {
		int x=6,y=7,x1=8,y1=9;
		new FizzBuzz().new Secret().go();
	}
	class Secret{
		void go() {
			System.out.println(x+", y= "+y+", x1="+x1+", y1 = "+y1);
		}
	}
	

	private static void fizzBuzz(int num) {
		// TODO Auto-generated method stub
		if(num%3 == 0 && num%5 == 0) {
			System.out.println("FizzBuzz");
		}else if(num%3 == 0 && num%5 !=0) {
			System.out.println("Fizz");
		}else if(num%5==0 && num%3 !=0) {
			System.out.println("Buzz");
		}else {
			System.out.println(num);
		}
	}

}
