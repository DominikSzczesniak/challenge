package pl.szczesniak.dominik;

import java.awt.*;

public class App {


	public static String SearchingChallenge(String str) {
		String[] list = str.split(" ");
		for (String word : list) {
			int counter = 0;
			for (int i = 0; i < word.length(); i++) {
				char c = word.charAt(0);
				for (int k = 0; k < word.length(); k++) {
					if (word.charAt(k) == c) {
						counter++;
					}
				}
			}
		}
		return str;
	}


	public static void main(String[] args) {
	}

}
