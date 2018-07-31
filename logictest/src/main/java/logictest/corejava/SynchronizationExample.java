package logictest.corejava;

class CallMe {
	
	void call(String msg) {
		System.out.println("[ " + msg);
		try {
			Thread.sleep(1000);

		} catch (InterruptedException e) {
			System.out.println("Interrupted!");
		}
		System.out.print(" ]");

	}
}

class Caller implements Runnable {
	String msg;
	CallMe target;
	Thread t;

	public Caller(CallMe targ, String s) {
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();

	}

	public void run() {
		target.call(msg);
	}
}

public class SynchronizationExample {

	public static void main(String[] args) {
		CallMe target = new CallMe();
		Caller obj1 = new Caller(target, "Hello");
		Caller obj2 = new Caller(target,"Synchronozed");
		Caller obj3  =  new Caller(target, "World");
		//wait for thread to end
		try {
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();
		}catch(InterruptedException e) {
			System.out.println("Interrupted");
			
		}

	}

}
