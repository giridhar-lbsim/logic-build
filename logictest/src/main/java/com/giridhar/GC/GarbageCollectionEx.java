package com.giridhar.GC;

public class GarbageCollectionEx {
	
	GarbageCollectionEx gc;
	static Integer i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GarbageCollectionEx t1 = new GarbageCollectionEx();
		GarbageCollectionEx t2 = new GarbageCollectionEx();
		GarbageCollectionEx t3 = new GarbageCollectionEx();
		
		t1.gc = t2;
		t2.gc = t3;
		t3.gc = t1;
		
		t1 =null;
		t2 = null;
		t3 = null;
		
		
		
		method1();
	}

	private static void method1() {
		// TODO Auto-generated method stub
		
		i = new Integer(10);
		Integer i2 = new Integer(20);
		
	}

}
