package logictest.corejava.generics;

import java.lang.reflect.GenericSignatureFormatError;

public class GenericOneParam<T> {
	T ob;

	GenericOneParam(T genericParam) {
		ob = genericParam;
	}

	T getOb() {
		return ob;
	}

	public void showTypes() {
		System.out.println("types of generic object: " + ob.getClass().getName());
	}

	public static void main(String[] args) {
		GenericOneParam<Integer> integerObj = new GenericOneParam<Integer>(88);
		integerObj.showTypes();
		Integer intVaule = integerObj.getOb();
		System.out.println("value of obj: " + intVaule);

		GenericOneParam<String> stringObj = new GenericOneParam<String>("generic example!!");
		stringObj.showTypes();
		System.out.println("value of stringObj: " + stringObj.getOb());

		GenericOneParam<Double> doubleObj = new GenericOneParam<Double>(94.52);
		doubleObj.showTypes();
		System.out.println("value of double object: " + doubleObj.getOb());

	}

}
