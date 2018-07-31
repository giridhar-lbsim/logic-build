package logictest.corejava;


class NewThread implements Runnable{
	Thread thread;
	NewThread(){
		thread = new Thread(this,"demo thread");
		System.out.println("child ");
	}
	public void run() {
		
		System.out.println("thread by runnable");
	}
	
}
public class ThreadRunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewThread newThread = new NewThread();
		Thread mainThread = Thread.currentThread();	
		mainThread.setName("updated main thread name");
		System.out.println(mainThread.getName());

	}

}
