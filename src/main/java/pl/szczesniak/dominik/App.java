package pl.szczesniak.dominik;

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


	public static void main(String[] args) {
	}

}
