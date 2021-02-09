package com.kmd.program;

public class StrigEqualsHashCodeTest {
	public static final Developer dev = new Developer("kumod", 30, 85000);
	
	
	public static void main(String[] args) {
		String s1 = new String("Anupama");
		String s2 = new String("Anupama");
		String s3 = new String("Anu");
		String s4 = "Komal";
		String s5 = "Anupama";
		String s6 = "Komal";
		System.out.println(dev.equals(dev));
		System.out.println(s1.hashCode() == s2.hashCode());
		System.out.println(s1.hashCode() == s3.hashCode());
		System.out.println(s1.hashCode() == s5.hashCode());
		System.out.println(s4.hashCode() == s6.hashCode());
	}
}

