package com.giridhar.multithreading;


class NewThread implements Runnable{
	Thread t;
	public NewThread() {
		t = new Thread( this,"Demo Thread");
		System.out.println("Child Thread "+t);
	}
	public void run() {
		try {
			for(int i=1;i<=10;i++) {
				System.out.println("Child Thread "+i);
				Thread.sleep(5000);
			}
		}catch(InterruptedException e) {
			System.out.println("Child interrupted");
			
		}
		System.out.println("Exiting Child Thread");
		
	}
}
public class ThreadCreationDemo {
	


	public static void main(String[] args) {
		NewThread myThread = new NewThread();
		myThread.t.start();
		try {
			for(int i=1;i<10;i++) {
				System.out.println("Main Thread "+i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			System.out.println("Main Thread interrupted: "+e);
			
		}
		System.out.println("Main Thread Exiting.");

	}

}
