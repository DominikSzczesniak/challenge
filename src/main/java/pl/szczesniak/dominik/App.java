package pl.szczesniak.dominik;

public class App {


	public static int ArrayChallenge(int[] arr) {
		int result = 0;
		for(int variable : arr) {
			result += variable;
		}

		return arr[0];
	}

	public static int  fibonacci(int number) {
		if (number < 2) {
			return number;
		}
		return fibonacci(number-1) + fibonacci(number-2);
	}


	public static void main(String[] args) {
	}

}
