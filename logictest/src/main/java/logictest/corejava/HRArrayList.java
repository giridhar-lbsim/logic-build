package logictest.corejava;

import java.util.ArrayList;
import java.util.Scanner;

public class HRArrayList {

	public void getResult() {

	}

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> table = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		int n, d, q, x, y;
		System.out.println("Enter number of line");
		// enter number of row
		n = in.nextInt();
		for (int i = n; i > 0; i--) {
			// enter number of elements in row
			d = in.nextInt();
			ArrayList<Integer> row = new ArrayList<Integer>();
			for (int j = d; j > 0; j--) {
				row.add(in.nextInt());
			}
			table.add(row);
		}

		// enter number of question
		q = in.nextInt();
		for (int k = q; k > 0; k--) {
			x = in.nextInt();
			y = in.nextInt();
			try {
				System.out.println(table.get(x-1).get(y-1));
			}catch(IndexOutOfBoundsException e){
				System.out.println("Error");
				
			}
		}

	}

}
