package logictest.corejava;

class SuperClass{
	Integer i;
	SuperClass(){
		System.out.println("super class constructor");
	}
	
}
class SubClass extends SuperClass{
	Integer i;
	SubClass(Integer a,Integer b){
		super();
		System.out.println("subclass constructor");
		super.i=10;
		i=20;
		
	}
	void show() {
		System.out.println("super class i:"+super.i);
		System.out.println("sub class i:"+i);
	}
}

public class SuperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass subObj = new SubClass(25, 30);
		subObj.show();

	}

}
