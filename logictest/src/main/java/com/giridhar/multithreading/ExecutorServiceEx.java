package com.giridhar.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceEx{

	public static void main(String[] args) {
		ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
		newSingleThreadExecutor.submit(new Callable<String>() {

			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				return "Result";
			}
			
		});
	}

}
