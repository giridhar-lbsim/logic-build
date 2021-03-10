package com.giridhar.java8;

import java.util.Arrays;
import java.util.List;

//ASCII value or caps letter is 65 to 90 and small letter is 97 to 122 and for digits 48 to 57

public class StringParse {
	static String resultStr = "";

	public static void main(String[] args) {
		String input = "12345.	EBT(Electronic Benefit Transfer): EBT is an electronic system that allows a Supplemental Nutrition Assistance Program(SANP) participant to pay for food using SNAP benefits. When a participant shops at a SNAP authorized retail store, their SNAP EBT account is debited to reimburse the store for food that was purchased. EBT is in use in all 50 states and it has been the sole method of SNAP issuance in all the states.";
		List<String> asList = Arrays.asList(input.split(""));
		asList.stream().forEach(c -> {
			parseString(c.charAt(0));

		});

		System.out.println("result: " + resultStr);
	}

	private static void parseString(char c) {

		int intValue = (int) c;
		if ((intValue >= 65 && intValue <= 90) || (intValue >= 48 && intValue <= 57)) {
			resultStr = resultStr + "X";
		} else {
			resultStr = resultStr + c;
		}

	}

}
