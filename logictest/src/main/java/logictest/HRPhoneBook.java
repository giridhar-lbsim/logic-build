package logictest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HRPhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, q;
		Map<String, String> phoneBook = new HashMap<String, String>();
		Scanner in = new Scanner(System.in);

		System.out.println("enter number of entry in phone book");
		n = in.nextInt();
		in.nextLine();
		for (int i = 0; i < n; i++) {
			// System.out.println("enter elements in phone book");
			System.out.println("Enter name:");
			String name = in.nextLine();
			
			System.out.println("Enter mobile number");
			String mobileNumber = in.nextLine();
			
			phoneBook.put(name, mobileNumber);
		}
		
		while(in.hasNext()) {
			String name = in.nextLine();
			String nameToBeSearched = phoneBook.get(name);
			if (null != nameToBeSearched) {
				System.out.println(name + " = " + nameToBeSearched);
			} else {
				System.out.println("Not Found");
			}
		}
	}

}
