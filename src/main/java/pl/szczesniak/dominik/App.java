package pl.szczesniak.dominik;

import java.util.Arrays;
import java.util.List;

public class App {


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
