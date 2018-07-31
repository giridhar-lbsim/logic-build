package logictest.corejava;

public class MultiCatchExample {
	
	
	

	public static void main(String[] args) {
		int a=10,b=0,  val[]= {1,2,3,4},result;
		
		try {
			//cause arithmetic exception
//			result = a/b;
			// generate ArrayOutOfBoundException
			val[10] = 20;
			//this catch clause catches both the exceptions	
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught: "+e);
			
		}
		System.out.println("after multi-catch !!");

	}

}
