package com.giridhar.java8.asynchronous_computations;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureEx2 {

	public static void main(String[] args) {
		ExecutorService cpuBound = Executors.newFixedThreadPool(4);
		ExecutorService ioBound = Executors.newCachedThreadPool();
		for(int i=0;i<100;i++) {
			//uses forkJoinPool.commonPool() internally
			/*
			 * CompletableFuture.supplyAsync(()->getOrder())
			 * .thenApplyAsync(order->enrichOrder(order)) .exceptionally(e->new FailOrder())
			 * .thenApplyAsync(order->dispath(order)) .thenAccept(order->sendEmail(order));
			 */	
			
			//if business logic is very complex then use Reactive Framework Rx java
		}
		

	}

}
