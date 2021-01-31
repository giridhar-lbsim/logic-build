package com.giridhar.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientTest {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();// executors will have single worker thread
		//Executors.newFixedThreadPool(5)//exectors will have 5 worker thread in ThreadPool

		Runnable task1 = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("Task 1.");
			}
		};
		//creating task using Lambda expression
		Runnable task2 =()->{
			System.out.println(Thread.currentThread().getName());
			System.out.println("Task 2");
		};
		//creating task using external Thread class
		MyTask task3 = new MyTask();
		
		//starting the tasks, there is submit(Runnable r) for running the task/thread
		executorService.submit(task1);
		executorService.submit(task2);executorService.submit(task3);
		//closing the ThreadPool, otherwise executorservice will be up for listening for the task.
		executorService.shutdown();

	}

}
