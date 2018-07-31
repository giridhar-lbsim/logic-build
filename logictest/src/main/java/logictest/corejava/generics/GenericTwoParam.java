package logictest.corejava.generics;

public class GenericTwoParam<T, V> {
	T objOne;
	V objTwo;

	public GenericTwoParam(T firstParam, V secondParam) {
		objOne = firstParam;
		objTwo = secondParam;
	}

	T getFirstObj() {
		return objOne;
	}

	V getSecondObj() {
		return objTwo;
	}

	public void showTypes() {
		System.out.println("Type of firstObj: " + objOne.getClass().getName());
		System.out.println("Type of secondObj: " + objTwo.getClass().getName());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		GenericTwoParam<Integer, String> testObj = new GenericTwoParam<Integer, String>(30,"Giridhar Kumar");
		testObj.showTypes();
		System.out.println("value of first object: "+testObj.getFirstObj());
		System.out.println("value of second object: "+testObj.getSecondObj());
		
		GenericTwoParam<String, Double> groceryObj  = new GenericTwoParam<String, Double>("Potato", 20.0);
		groceryObj.showTypes();
		System.out.println("grocery value: "+groceryObj.getFirstObj()+" "+groceryObj.getSecondObj());
		
		
		
		testObj.getSecondObj();
		

	}

}
