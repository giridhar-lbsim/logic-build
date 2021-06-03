package com.giridhar.multithreading;

public class ThreadCreationUsingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(()->{
			for(int i=1;i<=10;i++) {
				System.out.println("Child Thread: "+i);
			}
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}).start();

	}

}
