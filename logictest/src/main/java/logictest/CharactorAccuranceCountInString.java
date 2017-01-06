package logictest;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*This class will make you able to find character occurence in string and number or words in string*/
public class CharactorAccuranceCountInString {

	static HashMap<Character, Integer> map = new HashMap<Character, Integer>();

	public static HashMap<Character, Integer> getCharactorOccuranceInString(String input) {
		int count = 0, inputLength = input.length();
		for (int i = 0; i < inputLength; i++) {
			count = 0;
			Character ch = input.charAt(i);
			for (int j = 0; j < inputLength; j++) {
				if (ch == input.charAt(j)) {
					count++;
				}
			}
			map.put(input.charAt(i), count);
		}
		return map;

	}

	public static int getNumberOfWordsInString(String input) {
		int count = 0, inputLength = input.length();
		for (int i = 0; i < inputLength; i++) {
			{
				Character ch = input.charAt(i);
				if ((int) ch == 32) {
					count++;
				}
			}
		}
		return ++count;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter input for counting character occurence in string:");
		String myInut = input.nextLine();
		input.close();
		HashMap<Character, Integer> charactorOccuranceInString = CharactorAccuranceCountInString
				.getCharactorOccuranceInString(myInut);
		Set<Entry<Character, Integer>> entrySet = charactorOccuranceInString.entrySet();
		System.out.println("Occurence of character:" + entrySet);

		int numberOfWordsInString = CharactorAccuranceCountInString.getNumberOfWordsInString(myInut);
		System.out.println("Number of words in string: " + numberOfWordsInString);

	}

}
