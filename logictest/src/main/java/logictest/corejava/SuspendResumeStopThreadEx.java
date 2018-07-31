package logictest.corejava;

class ThreadDemo implements Runnable {
	String name;
	Thread t;

	ThreadDemo(String threadName) {
		name = threadName;
		t = new Thread(this, name);
		t.start();
	}

	/**
	 * Entry point of thread
	 */
	public void run() {

		try {
			for (int i = 15; i > 0; i--) {
				System.out.println(name + " : " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(name+" interrupted");
		}
		System.out.println("Exiting...");
	}

}

public class SuspendResumeStopThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo firstThread = new ThreadDemo("One");
		ThreadDemo secondThread = new ThreadDemo("Two");
		try {
				
			Thread.sleep(1000);
			firstThread.t.suspend();
			System.out.println(" Suspending thread one");
			Thread.sleep(1000);
			firstThread.t.resume();
			System.out.println("resuming thread one");
			secondThread.t.suspend();
			System.out.println("suspending thread two");
			secondThread.t.resume();
			System.out.println("resuming thread two");
			
			
		}catch(InterruptedException e) {
			System.out.println("main thread interrupted!!");
		}
		
		// wait for thread to finish
		try {
			System.out.println("waiting for thread to finish");
			firstThread.t.join();
			secondThread.t.join();
		}catch(InterruptedException e) {
			System.out.println("main thread interrupted");
		}
		System.out.println("main thread exiting....");
	}

}
