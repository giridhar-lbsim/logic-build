package com.kmd.program;

public class JavaTocplusVariableAndViceVersa {

	public static void main(String[] args) {
		/**
		 * c++ variable:  this_is_a_variable
		 * java variable: thisIsAVariable
		 */
		StringBuilder str = new StringBuilder("thisIsAVariable");
		System.out.println(javaToCPlus(str));
	}

	private static StringBuilder javaToCPlus(StringBuilder str) {
		StringBuilder res = new StringBuilder("");
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '_') {
				res = res.append(String.valueOf(str.charAt(i + 1)).toUpperCase());
				str.deleteCharAt(i);
			} else if (String.valueOf(str.charAt(i)).equals(String.valueOf(str.charAt(i)).toUpperCase())) {
				res = res.append('_').append(String.valueOf(str.charAt(i)).toLowerCase());
			} else {
				res = res.append(String.valueOf(str.charAt(i)));
			}
		}
		return res;
	}

}
