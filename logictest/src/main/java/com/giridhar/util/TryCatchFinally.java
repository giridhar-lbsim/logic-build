package com.giridhar.util;

import java.io.IOException;

public class TryCatchFinally {

	int err() throws Exception{
		try {
			throw new IOException("..");
		}
		catch(RuntimeException e) {
			throw new RuntimeException(e);
		}
		finally {
			return -1;
		}
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TryCatchFinally obj = new TryCatchFinally();
		int err = obj.err();
		System.out.println("err:"+err);

	}

}
