package logictest.corejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Reading characters
 * @author 52033410
 *
 */
public class BRRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char ch;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter characters and 'q' to quit ");
		do {
			ch =(char)br.read();
			System.out.println(ch);
		}while(ch !='q');

	}

}
