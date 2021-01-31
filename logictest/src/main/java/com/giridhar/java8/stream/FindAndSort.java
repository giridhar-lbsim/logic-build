package com.giridhar.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindAndSort {

	public static List<Transaction> sortTransaction(List<Transaction> transactions) {
		List<Transaction> sortedTransactions = transactions.stream().filter(y -> y.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue))// .reversed() to reverse the list
				.collect(Collectors.toList());
		return sortedTransactions;

	}

	/**
	 * 2. What are all the unique cities where the traders work?
	 * 
	 * @param args
	 */
	public static List<String> uniqueCities(List<Trader> traders) {
		List<String> uniqueCities = traders.stream().map(Trader::getCity).distinct().collect(Collectors.toList());
		return uniqueCities;
	}

	/**
	 * 3. Find all traders from Cambridge and sort them by name.
	 * 
	 * @param args
	 */
	public static List<Trader> findAndSortTraders(List<Trader> traders) {
		List<Trader> cambridgeTrader = traders.stream().filter(t -> t.getCity().equals("Cambridge"))
				.sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
		return cambridgeTrader;
	}

	/**
	 * 4. Return a string of all traders’ names sorted alphabetically.
	 * 
	 * @param args
	 */
	static List<String> findAndSortTraderName(List<Trader> traders) {
		return traders.stream().sorted(Comparator.comparing(Trader::getName)).map(Trader::getName)
				.collect(Collectors.toList());

	}

	/**
	 * 5. Are any traders based in Milan? 5. Are any traders based in Milan? 6.
	 * Print all transactions’ values from the traders living in Cambridge. 7.
	 * What’s the highest value of all the transactions? 8. Find the transaction
	 * with the smallest value.
	 * 
	 * @param args
	 */
	static boolean findTraderFromMilan(List<Trader> traders) {
		return traders.stream().anyMatch(t -> t.getCity().equals("Milan"));
	}

	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Trader> traders = Arrays.asList(raoul, mario, alan, brian);

		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));

		List<Transaction> sortTransactions = sortTransaction(transactions);
		/*
		 * for(Transaction t:sortTransactions) { System.out.println(t.toString()); }
		 */
		sortTransactions.forEach(System.out::println);

		List<String> uniqueCities = uniqueCities(traders);
		System.out.println("unique cities: " + uniqueCities);

		List<Trader> sortedTraders = findAndSortTraders(traders);
		System.out.println("sorted traders from cambridge:");
		sortedTraders.forEach(System.out::println);

		List<String> sortedTraderName = findAndSortTraderName(traders);
		System.out.println("sorted traders name: " + sortedTraderName);

	}

}
