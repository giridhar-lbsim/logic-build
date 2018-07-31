package logictest;

import java.util.ArrayList;
import java.util.Scanner;

public class HRListOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, q;
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> row = new ArrayList<>();
		System.out.println("Enter number of elements ");
		n = in.nextInt();
		if (n > 0) {
			for (int i = n; i > 0; i--) {
				row.add(in.nextInt());
			}
		}
System.out.println("elements added");
		// perform operation on list
		// enter number of query
		q = in.nextInt();
		for (int j = q; j > 0; j--) {
			// enter action
			System.out.println("enter action");
			String action = in.next();
			System.out.println("action: "+action);
			
			if (action.equals("Insert")) {
				int index = in.nextInt();
				int value = in.nextInt();
				row.add(index, value);
			} else {
				// delete
				int index = in.nextInt();
				row.remove(index);
			}
		}
		System.out.println("updated list: "+row.toString());

	}

}
