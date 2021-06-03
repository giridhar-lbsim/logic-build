package com.giridhar.java8.asynchronous_computations;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class CompletableFutureEx {

	public static void main(String[] args) {
		
		CompletableFuture<String> calculateAsync = calculateAsync();
		/*
		 * try { String result = calculateAsync.get();
		 * System.out.println("result:"+result);
		 * System.out.println(Thread.currentThread().getName());
		 * System.out.println("================================="); } catch
		 * (InterruptedException | ExecutionException e) { e.printStackTrace(); }
		 */
		

	}

	private static CompletableFuture<String> calculateAsync() {
		CompletableFuture<String> cf = new CompletableFuture<>();
		List<String> list = Arrays.asList("Giridhar","Kumar","Yadav");
		
		
		Executors.newCachedThreadPool().submit(()->{
			try {
				Thread.sleep(20);
				String joinStr = String.join(",", list);
				System.out.println("joinStr: "+joinStr);
				System.out.println(Thread.currentThread().getName());
				cf.complete(joinStr);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return null;
		});
		return cf;
	}

}
