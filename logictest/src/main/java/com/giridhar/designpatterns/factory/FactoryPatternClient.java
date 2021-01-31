package com.giridhar.designpatterns.factory;

public class FactoryPatternClient {

	public static void main(String[] args) {
		Product loan = ProductFactory.createProduct("loan");

	}

}
