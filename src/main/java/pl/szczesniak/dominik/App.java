package pl.szczesniak.dominik;

import java.util.Arrays;
import java.util.List;

public class App {

	public static String SearchingChallenge(String str) {
		String[] list = str.split(" ");
		int highestCounted = 0;
		String wordWithMostLetters = "";
		for (String word : list) {
			int letterCounter = 0;
			for (int i = 0; i < word.length(); i++) {
				char c = word.charAt(i);
				for (int k = 0; k < word.length(); k++) {
					if (k != i && word.charAt(k) == c) {
						letterCounter++;
					}
				}
				if (letterCounter > 1 && letterCounter > highestCounted) {
					highestCounted = letterCounter;
					wordWithMostLetters = word;
				}
			}
			if (highestCounted > 1) {
				String token = "9p0tmyw3e1";
				String regex = "[" + token + "]";
				return wordWithMostLetters.replaceAll(regex, "");
			}
		}
		return "-1";
	}


	public static int ArrayChallenge(int[] arr) {
		int result = 0;
		for (int variable : arr) {
			result += variable;
		}

		for (int i = 0; i < 1000; i++) {
			if (fibonacci(result + i)) {
				return i;
			}
		}

		return arr[0];
	}

	public static boolean fibonacci(int number) {
		int previousNumber = 0;
		int currentNumber = 1;
		while (currentNumber < number) {
			int index = currentNumber;
			currentNumber = previousNumber + currentNumber;
			previousNumber = index;
		}
		return currentNumber == number;
	}


//	new String[] {"101",
//				  "111",
//				  "001"}

	public static String MatrixChallenge(String[] strArr) {
		int row = row(strArr);
		int column = column(strArr);

		return String.valueOf(row);
	}

	private static int column(final String[] strArr) {
		List<String> strings = Arrays.stream(strArr).toList();
		for (int i = 0; i < strArr.length; i++) {
				strings.get(i).charAt(i);
			}

		return 0;
	}

	private static int row(final String[] strArr) {
		int finalCounter = 0;
		int counter = 0;
		List<String> strings = Arrays.stream(strArr).toList();
		for (int i = 0; i < strArr.length; i++) {
			counter = 0;
			String s = strings.get(i);
			for (int k = 0; k < s.length(); k++) {
				if (s.charAt(k) == '1') {
					counter++;
				}
				if (counter > finalCounter) {
					finalCounter = counter;
				}
			}
		}
		return finalCounter;
	}


	public static void main(String[] args) {
	}

}
