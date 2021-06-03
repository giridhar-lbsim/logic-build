package com.giridhar.multithreading;

import java.util.Iterator;

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("==============thread1=========================");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
}
class MyThread2 extends Thread{
	@Override
	public void run() {
		System.out.println("==============thread2=========================");
		for(int i=11;i<=20;i++) {
			
			System.out.println(i);
		}
	}
}
class MyThread3 implements Runnable{
	@Override
	public void run() {
		for(int i=21;i<=30;i++) {
			System.out.println(i);
		}
		
	}
}

public class ThreadCreationEx {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Thread t = new MyThread(); t.start(); t.join(); Thread t2 = new MyThread2();
		 * t2.start();
		 */
		Thread t1 = new Thread(new MyThread(),"T1");
		Thread t2 = new Thread(new MyThread2());
		Thread t3 = new Thread(new MyThread3());
		//t1.join();
		t1.start();
		t2.join();
		t2.start();
		//t3.start();
		

	}

}
