package com.giridhar.designpatterns.factory.OSFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class OSFactory {
	
	final static Map<String, Supplier<OS>> osmap = new HashMap<>();
	
	static {
		osmap.put("android", Android::new);
		osmap.put("ios", IOS::new);
		osmap.put("windows", Windows::new);
	}

	
	public OS getInstance(String osName) {
		
		
		Supplier<OS> os = osmap.get(osName);
		if(os != null)
			return os.get();
		throw new RuntimeException("No such OS: "+osName);
		
		
	}

}
