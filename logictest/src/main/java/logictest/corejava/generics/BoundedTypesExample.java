package logictest.corejava.generics;

import java.util.concurrent.SynchronousQueue;

public class BoundedTypesExample<T extends Number> {
	T[] list;
	
	public BoundedTypesExample(T[] o) {
		list = o;
	}
	
	public double average() {
		double sum = 0.0;
		for(int i =0;i<list.length;i++) {
			sum +=list[i].doubleValue();
			
		}
		return sum/list.length;
	}
	
	boolean sameAverage(BoundedTypesExample<?> ob) {
		if(average() == ob.average()) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] marks = {10,30,40,50,40,50};
		BoundedTypesExample<Integer> testObj = new BoundedTypesExample<Integer>(marks);
		System.out.println("integer marks average: "+testObj.average());
		
		Double[] marksInDouble = {10.0,30.0,40.0,50.0,40.0,50.0};
		BoundedTypesExample<Double> testObjSecond = new BoundedTypesExample<Double>(marksInDouble);
		System.out.println("double marks average: "+testObjSecond.average());
		
		String[] strList = {"giridhar","sandeep"};
		//below line will give bound mismatch compile time error
		//BoundedTypesExample<String> testObjThird = new BoundedTypesExample<String>(strList);
		System.out.println("check average of Integer and doube marks");
		if(testObj.sameAverage(testObjSecond)) {
			System.out.println("are same");
		}else {
			System.out.println("differ");
		}

	}

}
