package logictest.corejava;


/**
 * This will show the new ways to suspending, resuming and stopping thread instead of using deprecated methods like suspend(), resume() and stop()
 * 
 * @author 52033410
 *
 */

class SuspendResumeThread implements Runnable{
	String name;
	Thread t;
	boolean suspendFlag;
	
	SuspendResumeThread(String threadName){
		name = threadName;
		t = new Thread(this,name);
		suspendFlag = false;
		t.start();
		
	}
	public void run() {
		
		try {
			for(int i=15;i>0;i--) {
				System.out.println(name +" : "+i);
				Thread.sleep(1000);
				synchronized(this) {
					while(suspendFlag) {
						wait();
					}
				}
			}
			
		}catch(InterruptedException e) {
			System.out.println(name+" interrupted");
		}
		System.out.println(name+" exiting");
	}
	synchronized void mysuspend() {
		suspendFlag = true;
	}
	synchronized void myresume() {
		suspendFlag = false;
		notify();
	}
}
public class SuspendingResumingStoppingThreadModernWays {

	public static void main(String[] args) {
		SuspendResumeThread firstThread = new SuspendResumeThread("one");
		SuspendResumeThread secondThread = new SuspendResumeThread("Two");
		
		try {
			Thread.sleep(1000);
			firstThread.mysuspend();
			System.out.println("suspending thread one");
			Thread.sleep(1000);
			firstThread.myresume();
			System.out.println("resuming thread one");
			secondThread.mysuspend();
			System.out.println("suspending thread two");
			Thread.sleep(1000);
			secondThread.myresume();
			System.out.println("resuming thread two");
				
		}catch(InterruptedException e) {
			System.out.println("main thread Interrupted!!");
			
		}
	}

}
