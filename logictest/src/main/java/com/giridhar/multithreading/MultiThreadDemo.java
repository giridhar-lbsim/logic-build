package com.giridhar.multithreading;

class ChildThread implements Runnable{
	String name;
	Thread t;
	public ChildThread(String threadname) {
		name = threadname;
		t = new Thread(this, name);
		System.out.println("Child Thread: "+t);
		
	}
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println(name+" : "+i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Child thread interrupted.");
		}
		System.out.println("Exiting child Thread.");
	}
}

public class MultiThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread t1 = new ChildThread("one");
		ChildThread t2 = new ChildThread("two");
		ChildThread t3 = new ChildThread("three");
		try {
			t2.t.start();
			t2.t.join();
			t1.t.start();
			t1.t.join();
			t1.t.setPriority(Thread.MAX_PRIORITY);
			
			t3.t.start();
			t3.t.join();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("main thread interrupted");
		}
		

	}

}
