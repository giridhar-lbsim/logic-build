package logictest.corejava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		FileInputStream fis;
		if (args.length != 1) {
			System.out.println("Usage: ShowFile filename");
			return;
		}
		// attempt to open a file
		try {
			fis = new FileInputStream(args[0]);
		} catch (FileNotFoundException e) {
			System.out.println("Cannot open a file!");
			return;
		}
		// at this pont file is open and file can be read
		try {
			do {
				i = fis.read();
				if (i != -1) {
					System.out.println((char) i);
				}
			} while (i != -1);
		} catch (IOException e) {
			System.out.println("Error reading file");

		}
		// close the file
		try {
			fis.close();
		} catch (IOException e) {
			System.out.println("Error closing a file");
		}

	}

}
