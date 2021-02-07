package com.kmd.program.designpattern;

public class ComputerFactories {
	
	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}
}
