package logictest.corejava;

class A {
	
	synchronized void foo(B b) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered A.foo");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Thread A interrunpted!!");
		}
		System.out.println(name + " Trying to call B's last");
		b.last();

	}

	synchronized void last() {
		System.out.println("Inside A.last");
	}

}

class B {
	synchronized void bar(A a) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " Entered B.bar");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Thread B interrupted!!");
		}
		System.out.println(name + " Tyring to call A.last");
		a.last();
	}
	synchronized void last() {
		System.out.println("Inside B.last");
	}
}

public class DeadlockExample implements Runnable{
	A a = new A();
	B b = new B();
	
	DeadlockExample(){
	Thread.currentThread().setName("MainThread");
	Thread t = new Thread(this,"RacingThread");
	t.start();
	
	a.foo(b); // get lock on A in this thread
	System.out.println("back in the main thread");
	}

	public static void main(String[] args) {
		new DeadlockExample();
	}

	@Override
	public void run() {
		b.bar(a); // get lock on b in other thread
		System.out.println("back in other thread");
	}

}
